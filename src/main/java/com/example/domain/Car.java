package com.example.domain;

public class Car {
	private String partsName;
	private Integer maxSpeed;
	private Integer modelYear;

	public Integer getModelYear() {
		return modelYear;
	}

	public void setModelYear(Integer modelYear) {
		this.modelYear = modelYear;
	}

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

	@Override
	public String toString() {
		return "Car [partsName=" + partsName + ", maxSpeed=" + maxSpeed + ", modelYear=" + modelYear + "]";
	}
}
