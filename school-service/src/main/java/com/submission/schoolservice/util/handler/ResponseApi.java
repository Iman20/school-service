package com.submission.schoolservice.util.handler;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ResponseApi<T> extends BaseResponseApi {
    private T data;
}
