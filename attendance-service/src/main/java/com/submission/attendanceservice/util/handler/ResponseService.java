package com.submission.attendanceservice.util.handler;

public interface ResponseService {
    <T> ResponseApi<T> apiSuccess(T data);
}
