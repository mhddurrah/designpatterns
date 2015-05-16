package com.ugarit.java.designpatterns.bridge.abs;

import com.ugarit.java.designpatterns.bridge.impl.RandomIntGenerator;

import java.util.ArrayList;
import java.util.List;

/**
 * A class that holds a sequence of random generated integers in a List
 * based on random generation policy
 *
 * @author durrah (mhd.durrah@gmail.com) on 5/16/15.
 */
public class ListRandomIntSequenceCreator extends AbstractRandomIntSequenceWorker {
    private List<Integer> integers;

    public ListRandomIntSequenceCreator(int count, RandomIntGenerator generator) {
        super(count, generator);
        integers = new ArrayList<Integer>(count);
    }

    /**
     * @see AbstractRandomIntSequenceWorker#createSequence()
     */
    @Override
    public void createSequence() {
        for (int i = 0; i < count; i++) {
            integers.add(generator.generateInteger());
        }
    }

    /**
     * @see AbstractRandomIntSequenceWorker#printSequence()
     */
    @Override
    public void printSequence() {
        for (int integer : integers)
            System.out.print(integer + " ");
        System.out.println();
    }

    /**
     * @see AbstractRandomIntSequenceWorker#reset()
     */
    @Override
    protected void reset() {
        integers = new ArrayList<Integer>(count);
    }
}
