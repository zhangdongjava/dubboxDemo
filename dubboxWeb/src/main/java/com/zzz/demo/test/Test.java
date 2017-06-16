package com.zzz.demo.test;

import com.zzz.demo.api.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by zd on 2017/6/16.
 */
public class Test {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.start();
        context.getBean(DemoService.class).hello("我叫张东");
    }
}
