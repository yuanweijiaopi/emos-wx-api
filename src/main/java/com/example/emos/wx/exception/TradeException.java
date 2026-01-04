package com.example.emos.wx.exception;

/**
 * @ClassName TradeException
 * @Description TODO
 * @Author aql
 * @Date 2025/12/4 16:15
 * @Version 1.0
 **/
public class TradeException extends BizException{

    public TradeException(ErrorCode errorCode) {
        super(errorCode);
    }

    public TradeException(String message, ErrorCode errorCode) {
        super(message, errorCode);
    }

    public TradeException(String message, Throwable cause, ErrorCode errorCode) {
        super(message, cause, errorCode);
    }

    public TradeException(Throwable cause, ErrorCode errorCode) {
        super(cause, errorCode);
    }

    public TradeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, ErrorCode errorCode) {
        super(message, cause, enableSuppression, writableStackTrace, errorCode);
    }
}
