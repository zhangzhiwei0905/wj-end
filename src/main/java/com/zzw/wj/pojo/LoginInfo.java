package com.zzw.wj.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 功能描述
 *
 * @author z00770293
 * @since 2023年04月05日
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class LoginInfo {
    private String account;

    private String password;
}
