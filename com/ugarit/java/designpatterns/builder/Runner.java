package com.ugarit.java.designpatterns.builder;

import java.lang.ref.WeakReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 * @author durrah (mhd.durrah@gmail.com) on 7/7/15.
 * 
 */
public class Runner {
	final static Logger logger = Logger.getLogger(Runner.class.getName());

	public static void main(String[] args) {
		LargeObject.Builder builder = new LargeObject.Builder();

		/**
		 * use builder to make instance, notice the {@code WeakReference}
		 */
		WeakReference<LargeObject> largeObject = new WeakReference<LargeObject>(
				builder.id(1L).name("A9").model("").color("red").type("Sport")
						.build());

		logger.log(Level.INFO, "Object Color is {}", largeObject.get()
				.getColor());
	}

}
