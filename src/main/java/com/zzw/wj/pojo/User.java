package com.zzw.wj.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * 功能描述
 *
 * @author z00770293
 * @since 2023年04月02日
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;

    String username;

    String nickname;

    String phone;

    String email;

    String password;
}
