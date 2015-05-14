package com.boyi.chapter8.parkinglot;

public class Car extends Vehicle {

	public Car(){
		spotsNeeded=1;
		size = VehicleSize.Compact;
	}
	
	public boolean canFitInSpot(ParkingSpot s){
		return true; ////
	}
}