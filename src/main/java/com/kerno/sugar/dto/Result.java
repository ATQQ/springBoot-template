package com.kerno.sugar.dto;
/*
 *@author sugar
 *2019/10/30
 *9:05
 * 回调信息
 */

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Result {
    private Integer code;

    private String errMsg;

    private Object data;

    public Result(Integer code, String errMsg) {
        this.code = code;
        this.errMsg = errMsg;
    }

    /**
     * 成功响应回调
     */

    public static Result success(){
        return new Result(0,"OK");
    }

    public static Result success(Object data){
        return new Result(0,"OK",data);
    }

    /**
     * 错误回调
     * @param code 状态码
     * @param errMsg 错误信息
     */
    public static Result fail(Integer code,String errMsg){
        return new Result(code,errMsg);
    }
    public static Result fail(Integer code,String errMsg,Object data){
        return new Result(code,errMsg,data);
    }
}
