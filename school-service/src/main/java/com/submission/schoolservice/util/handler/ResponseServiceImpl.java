package com.submission.schoolservice.util.handler;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class ResponseServiceImpl implements ResponseService{
    @Override
    public <T> ResponseApi<T> apiSuccess(T data) {
        ResponseApi<T> response = new ResponseApi<>();
        response.setData(data);
        response.setMessage("Success");
        response.setStatusCode(HttpStatus.OK.value());
        return response;
    }
}
