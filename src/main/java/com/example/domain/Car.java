package com.example.domain;

public class Car {
	private String partsName;
	private Integer maxSpeed;
	private String color;

	public String getpartsName() {
		return partsName;
	}

	public void setName(String partsName) {
		this.partsName = partsName;
	}

	public Integer getmaxSpeed() {
		return maxSpeed;
	}

	public void setpartsSpeed(Integer maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Car [partsName=" + partsName + ", maxSpeed=" + maxSpeed + ", color=" + color + "]";
	}

}
