package com.boyi.chapter8.parkinglot;

public class ParkingSpot {
	private Level level;
	private int row;
	private int spotNumber;
	private Vehicle vehicle;
	private VehicleSize spotSize;
	
	
	public ParkingSpot(Level level,int row,int sportNumber,VehicleSize vehicleSize){
		
	}
	
	public boolean isAvailable(){
		return true; ///
	}
	
	public boolean canFitVehicle(Vehicle v){
		return true; ///
	}
	
	public boolean park(Vehicle v){
		return true; ///
	}
	
	public int getRow(){
		return row;
	}
	
	public int getSpotNumber(){
		return spotNumber;
	}
	
	//remove  vehicle from spot and notify the level that a new spot is available
	public void removeVehicle(){
		
	}

}
