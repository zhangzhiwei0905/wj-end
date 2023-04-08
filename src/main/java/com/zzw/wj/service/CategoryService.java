package com.zzw.wj.service;

import com.zzw.wj.dao.CategoryDao;
import com.zzw.wj.pojo.Category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 功能描述
 *
 * @author z00770293
 * @since 2023年04月02日
 */
@Service
public class CategoryService {
    @Autowired
    CategoryDao categoryDAO;

    public List<Category> list() {
        Sort sort = Sort.by(Sort.Direction.DESC, "id");
        return categoryDAO.findAll(sort);
    }

    public Category get(int id) {
        Category c = categoryDAO.findById(id).orElse(null);
        return c;
    }

}
