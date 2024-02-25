package com.submission.schoolservice.util.handler;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Data
public class BaseResponseApi {
    private int statusCode;
    private String message;
}
