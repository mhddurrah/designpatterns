package com.ugarit.java.designpatterns.bridge.abs;

import com.ugarit.java.designpatterns.bridge.impl.RandomIntGenerator;

/**
 * A class that holds a sequence of random generated integers in an Array
 * based on random generation policy
 *
 * @author durrah (mhd.durrah@gmail.com) on 5/16/15.
 */
public class ArrayRandomIntSequenceWorker extends AbstractRandomIntSequenceWorker {

    /**
     * numbers' holder
     */
    private int[] integers;

    public ArrayRandomIntSequenceWorker(int count, RandomIntGenerator generator) {
        super(count, generator);
    }

    /**
     * @see AbstractRandomIntSequenceWorker#createSequence()
     */
    @Override
    protected void createSequence() {
        for (int i = 0; i < count; i++) {
            integers[i] = generator.generateInteger();
        }
    }

    /**
     * @see AbstractRandomIntSequenceWorker#printSequence()
     */
    @Override
    protected void printSequence() {
        for (int integer : integers)
            System.out.print(integer + " ");
        System.out.println();
    }

    /**
     * @see AbstractRandomIntSequenceWorker#reset()
     */
    @Override
    protected void reset() {
        integers = new int[count];
    }
}
