package com.kerno.sugar.exception;

import com.kerno.sugar.dto.Result;
import org.springframework.boot.context.properties.bind.BindException;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.multipart.MaxUploadSizeExceededException;
import org.springframework.web.multipart.support.MissingServletRequestPartException;
import org.springframework.web.servlet.NoHandlerFoundException;

/*
 *@author sugar
 *2019/10/30
 *9:18
 * 全局异常捕获
 */

@RestControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 基本异常
     */
    @ExceptionHandler(Exception.class)
    public Result exception(Exception e) {
        //控制台打印
        e.printStackTrace();
        return Result.fail(500, e.getMessage(), "Server Error");
    }

    /**
     * 请求路径无法找到异常
     */
    @ExceptionHandler(NoHandlerFoundException.class)
    public Result notFoundException() {
        return Result.fail(404, "Not found");
    }

    /**
     * 请求方法不支持异常
     */
    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    public Result httpRequestMethodNotSupportedException() {
        return Result.fail(405, "Method not allowed");
    }

    /**
     * 空指针异常
     */
    @ExceptionHandler(NullPointerException.class)
    public Result nullPointerException() {
        return Result.fail(500, "nullPointerException");
    }

    /**
     * 请求参数异常
     */
    @ExceptionHandler({HttpMessageNotReadableException.class, MissingServletRequestParameterException.class, MissingServletRequestPartException.class, BindException.class})
    public Result parameterException() {
        return Result.fail(403, "Parameter error");
    }

    /**
     * 上传文件过大异常
     */
    @ExceptionHandler(MaxUploadSizeExceededException.class)
    public Result maxUploadSizeExceededException() {
        return Result.fail(403, "File is too large");
    }

    /**
     * 服务异常
     */
    @ExceptionHandler(ServiceException.class)
    public Result serviceException(ServiceException e) {
        return Result.fail(e.getCode(), e.getMessage(), e.getData());
    }
}
