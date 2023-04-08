package com.zzw.wj.dao;

import com.zzw.wj.pojo.Category;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 功能描述
 *
 * @author z00770293
 * @since 2023年04月02日
 */
public interface CategoryDao extends JpaRepository<Category, Integer> {
}
