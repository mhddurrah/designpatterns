package com.ugarit.java.designpatterns.bridge.impl;

import java.util.Random;

/**
 * Random integer strategy implementation to generate an integer greater than 100
 *
 * @author durrah (mhd.durrah@gmail.com) on 5/16/15.
 */
public class GT100RandomIntGenerator implements RandomIntGenerator {

    /**
     * generator implementation
     *
     * @return a random integer less that 100
     */
    @Override
    public int generateInteger() {
        return new Random().nextInt(100) + (int) Math.abs(Math.random() * 1000);
    }
}