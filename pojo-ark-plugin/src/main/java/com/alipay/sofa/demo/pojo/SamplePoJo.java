/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.alipay.sofa.demo.pojo;

import java.io.Serializable;

/**
 * @author qilong.zql
 */
public class SamplePoJo implements Serializable {

    public String name;

    public SamplePoJo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}