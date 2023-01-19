package com.learcha.learchaapp.member.common.exception;

import com.learcha.learchaapp.member.common.error.ErrorCode;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class BaseException extends RuntimeException {
    private ErrorCode errorCode;

    public BaseException(ErrorCode errorCode) {
        super(errorCode.getErrorMsg());
        this.errorCode = errorCode;
    }

    public BaseException(String message, ErrorCode errorCode) {
        super(message);
        this.errorCode = errorCode;
    }
}
