package com.voya.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Vehicle {
	private Integer vehicleId;
	private String brand;
	private String model;
	private double price;
	private Engine engine;
	public Integer getVehicleId() {
		return vehicleId;
	}
	@Value("1001")
	public void setVehicleId(Integer vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getBrand() {
		return brand;
	}
	@Value("bmw")
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	@Value("a1")
	public void setModel(String model) {
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	@Value("2000")
	public void setPrice(double price) {
		this.price = price;
	}
	public Engine getEngine() {
		return engine;
	}
	@Autowired
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	@Override
	public String toString() {
		return "Vehicle [vehicleId=" + vehicleId + ", brand=" + brand + ", model=" + model + ", price=" + price
				+ ", engine=" + engine + "]";
	}

}
