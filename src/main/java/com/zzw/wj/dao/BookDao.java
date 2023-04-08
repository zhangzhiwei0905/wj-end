package com.zzw.wj.dao;

import com.zzw.wj.pojo.Book;
import com.zzw.wj.pojo.Category;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 功能描述
 *
 * @author z00770293
 * @since 2023年04月02日
 */
public interface BookDao extends JpaRepository<Book, Integer> {
    List<Book> findAllByCategory(Category category);

    List<Book> findAllByTitleLikeOrAuthorLike(String keyword1, String keyword2);
}
