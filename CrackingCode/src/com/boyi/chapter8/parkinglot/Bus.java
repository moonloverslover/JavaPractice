package com.boyi.chapter8.parkinglot;

public class Bus extends Vehicle{

	public Bus(){
		spotsNeeded=5;
		size = VehicleSize.Large;
	}
	
	public boolean canFitInSpot(ParkingSpot s){
		return true; ////
	}
}
