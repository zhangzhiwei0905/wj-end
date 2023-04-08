package com.zzw.wj;

import com.zzw.wj.dao.UserDao;
import com.zzw.wj.pojo.LoginInfo;
import com.zzw.wj.pojo.User;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
class WjApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    void contextLoads() {
        LoginInfo user = new LoginInfo();
        // user.setEmail("1034528234@qq.com");
        user.setAccount("18162628678");
        // user.setUsername("a5153909");
        User res = userDao.validateUser(user);
        log.info(res.toString());
    }

}
