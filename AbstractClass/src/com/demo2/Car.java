package com.demo2;

abstract public class Car {
	
	int carid;
	
	Car()
	{
		System.out.println("Abstract default const");
	}
	
	Car(int carid)
	{
		this.carid=carid;
	}
	
	int getCarid()
	{
		return carid;
	}
	
	abstract void startCar();

}
