package com.zzz.demo.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by zd on 2017/6/16.
 */
public class Test {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext  context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.start();
        System.out.println("服务接口开启成功!");
        System.in.read(); // 按任意键退出
    }
}
