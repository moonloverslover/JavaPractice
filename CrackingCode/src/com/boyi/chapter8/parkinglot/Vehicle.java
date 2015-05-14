package com.boyi.chapter8.parkinglot;

import java.util.ArrayList;


public abstract class Vehicle {
 
  protected ArrayList<ParkingSpot> parkingSpots = new ArrayList<ParkingSpot>();
  protected String licencePlate;
  protected int spotsNeeded;
  protected VehicleSize size;
  
  
  public int getSpotsNeeded(){
	  return spotsNeeded;
  }
  
  public VehicleSize getsize(){
	  return size;
  }

  public void parkInSpot(ParkingSpot s){
	  parkingSpots.add(s);
  }
  
  public void clearSpots(){
	  
  }
  
  public abstract boolean canFitInSpot(ParkingSpot s); // since it is an abstract method; the subclass must override this method!
}
