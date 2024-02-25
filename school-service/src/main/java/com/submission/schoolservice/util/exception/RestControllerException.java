package com.submission.schoolservice.util.exception;

import com.submission.schoolservice.domain.classroom.exception.ClassroomNotFoundException;
import com.submission.schoolservice.domain.school.exception.SchoolNotFoundException;
import com.submission.schoolservice.domain.student.exception.StudentNotFoundException;
import com.submission.schoolservice.util.handler.BaseResponseApi;
import com.submission.schoolservice.util.handler.ResponseApi;
import jakarta.validation.ConstraintViolationException;
import org.springframework.core.NestedExceptionUtils;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import org.springframework.web.servlet.resource.NoResourceFoundException;

@RestControllerAdvice
public class RestControllerException extends ResponseEntityExceptionHandler {

    @Override
    protected ResponseEntity<Object> handleHttpMessageNotReadable(HttpMessageNotReadableException ex, HttpHeaders headers, HttpStatusCode status, WebRequest request) {
        ResponseApi response = new ResponseApi();
        response.setMessage(ex.getLocalizedMessage());
        response.setStatusCode(HttpStatus.BAD_REQUEST.value());
        return buildResponseEntity(response);
    }

    @Override
    protected ResponseEntity<Object> handleNoResourceFoundException(NoResourceFoundException ex, HttpHeaders headers, HttpStatusCode status, WebRequest request) {
        ResponseApi response = new ResponseApi();
        response.setMessage(ex.getLocalizedMessage());
        response.setStatusCode(HttpStatus.NOT_FOUND.value());
        return buildResponseEntity(response);
    }

    @ExceptionHandler(value= { IllegalArgumentException.class, IllegalStateException.class })
    protected ResponseEntity<Object> handleIllegalArgumentException(Exception ex) {
        ResponseApi response = new ResponseApi();
        response.setMessage(ex.getLocalizedMessage());
        response.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
        return buildResponseEntity(response);
    }

    @ExceptionHandler(value= {ConstraintViolationException.class})
    protected ResponseEntity<Object> handleConstraintViolationException(ConstraintViolationException ex) {
        ResponseApi response = new ResponseApi();
        response.setMessage(ex.getConstraintViolations().stream().toList().get(0).getMessage());
        response.setStatusCode(HttpStatus.BAD_REQUEST.value());
        return buildResponseEntity(response);
    }

    @ExceptionHandler(value= {DataIntegrityViolationException.class})
    protected ResponseEntity<Object> handleDataIntegrityViolationException(DataIntegrityViolationException ex) {
        String message = NestedExceptionUtils.getMostSpecificCause(ex).getMessage();
        ResponseApi response = new ResponseApi();
        response.setMessage(message);
        response.setStatusCode(HttpStatus.BAD_REQUEST.value());
        return buildResponseEntity(response);
    }

    @ExceptionHandler(value= { ClassroomNotFoundException.class, SchoolNotFoundException.class, StudentNotFoundException.class })
    protected ResponseEntity<Object> handleIdNotFoundException(Exception ex) {
        ResponseApi response = new ResponseApi();
        response.setMessage(ex.getLocalizedMessage());
        response.setStatusCode(HttpStatus.NOT_FOUND.value());
        return buildResponseEntity(response);
    }

    private ResponseEntity<Object> buildResponseEntity(BaseResponseApi apiError) {
        return new ResponseEntity<>(apiError, HttpStatus.OK);
    }


}
