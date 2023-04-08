package com.zzw.wj.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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
@Entity
@Table(name = "category")
@JsonIgnoreProperties( {"handler", "hibernateLazyInitializer"})
@Data
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;

    String name;

}
