package com.ugarit.java.designpatterns.bridge.main;

import com.ugarit.java.designpatterns.bridge.abs.AbstractRandomIntSequenceWorker;
import com.ugarit.java.designpatterns.bridge.abs.ListRandomIntSequenceCreator;
import com.ugarit.java.designpatterns.bridge.impl.GT100RandomIntGenerator;
import com.ugarit.java.designpatterns.bridge.impl.RandomIntGenerator;
import com.ugarit.java.designpatterns.bridge.impl.RangeRandomIntGenerator;

/**
 * Main Test
 *
 * @author durrah (mhd.durrah@gmail.com) on 5/16/15.
 */
public class BridgeTest {

    public static void main(String... args) {
        RandomIntGenerator generator = new RangeRandomIntGenerator(10, 20);
        AbstractRandomIntSequenceWorker worker = new ListRandomIntSequenceCreator(10, generator);
        worker.doWork();
        worker.setGenerator(new GT100RandomIntGenerator());
        worker.doWork();
    }
}
