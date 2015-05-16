package com.ugarit.java.designpatterns.bridge.abs;

import com.ugarit.java.designpatterns.bridge.impl.RandomIntGenerator;

/**
 * An abstract class that holds a sequence of random generated integers
 * based on random generation policy
 *
 * @author durrah (mhd.durrah@gmail.com) on 5/16/15.
 */
public abstract class AbstractRandomIntSequenceWorker {
    /**
     * the count of numbers to be generated
     */
    protected final int count;
    /**
     * the generator impl
     */
    protected RandomIntGenerator generator;

    public AbstractRandomIntSequenceWorker(int count, RandomIntGenerator generator) {
        this.count = count;
        this.generator = generator;
    }

    /**
     * set generator on the fly
     *
     * @param generator
     */
    public void setGenerator(RandomIntGenerator generator) {
        this.generator = generator;
    }

    /**
     * create the sequence of the random integer
     */
    protected abstract void createSequence();

    /**
     * print the sequence ot the numbers
     */
    protected abstract void printSequence();

    /**
     * reset the container
     */
    protected abstract void reset();

    /**
     * create then print the sequence
     * <p/>
     * #Template Method pattern :)
     */
    public final void doWork() {
        reset();
        createSequence();
        printSequence();
    }
}
