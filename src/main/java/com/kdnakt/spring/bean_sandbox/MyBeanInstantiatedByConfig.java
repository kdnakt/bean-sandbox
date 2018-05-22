package com.kdnakt.spring.bean_sandbox;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

public class MyBeanInstantiatedByConfig {

    @Autowired
    private HttpServletRequest req;

    private int data;

    public int getData() {
        System.out.println(req);
        return data;
    }

    public void setData(final int data) {
        this.data = data;
    }

}
