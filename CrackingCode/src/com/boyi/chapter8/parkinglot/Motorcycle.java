package com.boyi.chapter8.parkinglot;

public class Motorcycle extends Vehicle{

	public Motorcycle(){
		spotsNeeded=1;
		size = VehicleSize.Motorcycle;
	}
	
	public boolean canFitInSpot(ParkingSpot s){
		return true; ////
	}
}
