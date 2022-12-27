package com.linfeng;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.DigestUtils;

@SpringBootTest
class ReggieTakeOutApplicationTests {

    @Test
    void contextLoads() {
        String password ="2534800363";
        password = DigestUtils.md5DigestAsHex(password.getBytes());
        System.out.println(password);
    }

}
