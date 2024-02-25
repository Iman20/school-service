package com.submission.schoolservice.util.handler;

public interface ResponseService {
    <T> ResponseApi<T> apiSuccess(T data);
}
