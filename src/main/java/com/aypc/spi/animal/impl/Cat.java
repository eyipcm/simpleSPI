package com.aypc.spi.animal.impl;

import com.aypc.spi.animal.IShout;

public class Cat implements IShout {
    @Override
    public void shout() {
        System.out.println("miao miao");
    }
}
