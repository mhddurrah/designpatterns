package com.ugarit.java.designpatterns.bridge.impl;

import java.util.Random;

/**
 * Random integer strategy implementation to generate an integer less than 100
 *
 * @author durrah (mhd.durrah@gmail.com) on 5/16/15.
 */
public class LT100RandomIntGenerator implements RandomIntGenerator {

    /**
     * generator implementation
     *
     * @return a random integer less that 100
     */
    @Override
    public int generateInteger() {
        return new Random().nextInt(100);
    }
}