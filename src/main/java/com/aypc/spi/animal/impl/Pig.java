package com.aypc.spi.animal.impl;

import com.aypc.spi.animal.IShout;

public class Pig implements IShout {

	@Override
	public void shout() {
		System.out.println("Ong Ong");
	}
}
