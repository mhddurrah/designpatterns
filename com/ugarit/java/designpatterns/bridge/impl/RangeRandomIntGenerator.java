package com.ugarit.java.designpatterns.bridge.impl;

import java.util.Random;

/**
 * Random integer strategy implementation to generate an integer from a range
 *
 * @author durrah (mhd.durrah@gmail.com) on 5/16/15.
 */
public class RangeRandomIntGenerator implements RandomIntGenerator {
    /**
     * range min
     */
    private final int low;
    /**
     * range max
     */
    private final int high;

    public RangeRandomIntGenerator(int low, int high) {
        this.low = low;
        this.high = high;
    }


    /**
     * generator implementation
     *
     * @return a random integer between {@link #low} and {@link #high}
     */
    @Override
    public int generateInteger() {
        return new Random().nextInt(low) + (high - low);
    }
}