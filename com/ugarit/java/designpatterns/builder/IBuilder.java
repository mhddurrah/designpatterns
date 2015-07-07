package com.ugarit.java.designpatterns.builder;

/**
 * 
 * @author durrah (mhd.durrah@gmail.com) on 7/7/15.
 * 
 * @param <T>
 */
public interface IBuilder<T> {
	/**
	 * build an object of class T
	 * 
	 * @return an instance of T class
	 */
	public T build();
}
