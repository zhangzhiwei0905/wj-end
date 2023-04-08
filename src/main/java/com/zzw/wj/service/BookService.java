package com.zzw.wj.service;

import com.zzw.wj.dao.BookDao;
import com.zzw.wj.pojo.Book;
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
public class BookService {

    @Autowired
    BookDao bookDao;

    @Autowired
    CategoryService categoryService;

    public List<Book> list() {
        Sort sort = Sort.by(Sort.Direction.DESC, "id");
        return bookDao.findAll(sort);
    }

    public void addOrUpdate(Book book) {
        bookDao.save(book);
    }

    public void deleteById(int id) {
        bookDao.deleteById(id);
    }

    public List<Book> listByCategory(int cid) {
        Category category = categoryService.get(cid);
        return bookDao.findAllByCategory(category);
    }

}
