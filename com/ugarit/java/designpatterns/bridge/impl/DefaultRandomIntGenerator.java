package com.ugarit.java.designpatterns.bridge.impl;

import java.util.Random;

/**
 * Default Random integer strategy implementation to generate an integer
 *
 * @author durrah (mhd.durrah@gmail.com) on 5/16/15.
 */
public class DefaultRandomIntGenerator implements RandomIntGenerator {

    /**
     * generator implementation
     *
     * @return a random integer between {@link #low} and {@link #high}
     */
    @Override
    public int generateInteger() {
        return new Random().nextInt();
    }
}