package com.example.demo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Test01 {

    @Value("${a.key1}")
    private String key1;

    @Test
    public void test01() {
        System.out.println(key1);
    }
}
