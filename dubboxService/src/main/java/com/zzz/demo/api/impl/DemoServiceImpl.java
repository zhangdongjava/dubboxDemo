package com.zzz.demo.api.impl;

import com.zzz.demo.api.DemoService;

/**
 * Created by zd on 2017/6/16.
 */
public class DemoServiceImpl implements DemoService {
    public void hello(String name) {
        System.out.println("hello ->"+name);
    }
}
