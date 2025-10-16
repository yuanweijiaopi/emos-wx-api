package com.example.emos.wx.bean.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @ClassName Result
 * @Description TODO
 * @Author aql
 * @Date 2025/10/16 17:06
 * @Version 1.0
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Result<T> implements Serializable {
    /**
     * 0-成功，非0-失败
     */
    private Integer status;
    private Long timestamp;
    private String message;

    private T data;


    public static <T> Result<T> succ(T data) {
        Result<T> result = new Result<>();
        result.setTimestamp(System.currentTimeMillis());
        result.setStatus(ResultStatus.OK.value());
        result.setMessage("请求处理成功");
        result.setData(data);
        return result;
    }

    public static <T> Result<T> successMessage(String message) {
        Result<T> result = new Result<>();
        result.setTimestamp(System.currentTimeMillis());
        result.setStatus(ResultStatus.OK.value());
        result.setMessage(message);
        return result;
    }

    public static Result succ() {
        Result result = new Result<>();
        result.setTimestamp(System.currentTimeMillis());
        result.setStatus(ResultStatus.OK.value());
        result.setMessage("success");
        return result;
    }

    public static <T> Result<T> error(String message) {
        Result<T> result = new Result<>();
        result.setTimestamp(System.currentTimeMillis());
        result.setStatus(ResultStatus.PARAMETER_ERROR.value());
        result.setMessage(message);
        return result;
    }
    public static <T> Result<T> error() {
        Result<T> result = new Result<>();
        result.setTimestamp(System.currentTimeMillis());
        result.setStatus(ResultStatus.PARAMETER_ERROR.value());
        result.setMessage("请求处理失败");
        return result;
    }

    public static <T> Result<T> fail() {
        Result<T> result = new Result<>();
        result.setTimestamp(System.currentTimeMillis());
        result.setStatus(ResultStatus.SERVER_ERROR.value());
        result.setMessage("请求处理失败");
        return result;
    }

    public static <T> Result<T> fail(String message) {
        Result<T> result = new Result<>();
        result.setTimestamp(System.currentTimeMillis());
        result.setStatus(ResultStatus.SERVER_ERROR.value());
        result.setMessage(message);
        return result;
    }

    public static <T> Result<T> fail(String message, T data) {
        Result<T> result = new Result<>();
        result.setTimestamp(System.currentTimeMillis());
        result.setStatus(ResultStatus.SERVER_ERROR.value());
        result.setMessage(message);
        result.setData(data);
        return result;
    }
}
