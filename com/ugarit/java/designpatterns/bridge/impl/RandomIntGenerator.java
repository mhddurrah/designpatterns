package com.ugarit.java.designpatterns.bridge.impl;

/**
 * An interface for generating random integer numbers
 *
 * @author durrah (mhd.durrah@gmail.com) on 5/16/15.
 */
public interface RandomIntGenerator {
    /**
     * Generate a random number based on strategy
     *
     * @return
     */
    public int generateInteger();
}