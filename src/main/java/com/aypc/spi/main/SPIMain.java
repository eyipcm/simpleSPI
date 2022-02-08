package com.aypc.spi.main;

import java.util.ServiceLoader;

import com.aypc.spi.animal.IShout;

public class SPIMain {

	public static void main(String[] args) {
		ServiceLoader<IShout> shouts = ServiceLoader.load(IShout.class);
        for (IShout s : shouts) {
            s.shout();
        }
	}
}
