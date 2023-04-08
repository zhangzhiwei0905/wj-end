package com.zzw.wj.dao;

import com.zzw.wj.pojo.LoginInfo;
import com.zzw.wj.pojo.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * 功能描述
 *
 * @author z00770293
 * @since 2023年04月02日
 */
public interface UserDao extends JpaRepository<User, Integer> {
    User findByUsername(String username);

    User getByUsernameAndPassword(String username, String password);

    @Query(
        "select u from User u where u.email=:#{#loginInfo.account} or u.username=:#{#loginInfo.account} or u.phone=:#{#loginInfo.account}")
    User validateUser(@Param("loginInfo") LoginInfo loginInfo);
}
