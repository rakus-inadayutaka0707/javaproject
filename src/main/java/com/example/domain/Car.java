package com.example.domain;

public class Car {
	private String name1;
	private Integer speedMax;
	private String color;

	public String getName1() {
		return name1;
	}

	public void setName1(String name1) {
		this.name1 = name1;
	}

	public Integer getSpeedMax() {
		return speedMax;
	}

	public void setSpeedMax(Integer speedMax) {
		this.speedMax = speedMax;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Car [name1=" + name1 + ", speedMax=" + speedMax + ", color=" + color + "]";
	}
}
