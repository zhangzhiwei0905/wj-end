package com.zzw.wj.result;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 功能描述
 *
 * @author z00770293
 * @since 2023年04月02日
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result {
    //响应码
    private int code;

    private String message;

    private Object data;

    public Result(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
