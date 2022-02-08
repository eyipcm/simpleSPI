package com.aypc.spi.animal.impl;

import com.aypc.spi.animal.IShout;

public class Dog implements IShout {
	@Override
    public void shout() {
        System.out.println("wang wang");
    }
}
