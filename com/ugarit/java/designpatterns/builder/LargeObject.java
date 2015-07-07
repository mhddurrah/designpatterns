package com.ugarit.java.designpatterns.builder;

/**
 * a large object with too many fields to be built
 * 
 * @author durrah (mhd.durrah@gmail.com) on 7/7/15.
 * 
 */
public class LargeObject {

	private long id;
	private String name;
	private String color;
	private String type;
	private String model;

	private LargeObject(Builder builder) {
		id = builder.id;
		name = builder.name;
		color = builder.color;
		type = builder.type;
		model = builder.model;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public String getType() {
		return type;
	}

	public String getModel() {
		return model;
	}

	/**
	 * the builder of our large object
	 * 
	 * @author durrah (mhd.durrah@gmail.com) on 7/7/15.
	 * 
	 */
	static class Builder implements IBuilder<LargeObject> {
		private long id;
		private String name;
		private String color;
		private String type;
		private String model;

		public Builder id(long id) {
			this.id = id;
			return this;
		}

		public Builder name(String name) {
			this.name = name;
			return this;
		}

		public Builder color(String color) {
			this.color = color;
			return this;
		}

		public Builder type(String type) {
			this.type = type;
			return this;
		}

		public Builder model(String model) {
			this.model = model;
			return this;
		}

		/**
		 * {@inheritDoc}
		 */
		@Override
		public LargeObject build() {
			return new LargeObject(this);
		}
	}
}
