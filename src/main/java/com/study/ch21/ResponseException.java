package com.study.ch21;

import lombok.Getter;

import java.util.Map;
@Getter
public class ResponseException extends RuntimeException {//Exception 있으면 예외 클래스
    private Map<String,Object> errorMap;

    public ResponseException(String message, Map<String, Object> errorMap) {
        super(message);
        this.errorMap = errorMap;
    }

}
