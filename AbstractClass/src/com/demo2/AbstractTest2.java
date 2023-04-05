package com.demo2;

class Audi extends Car
{
	String  model;
	
	Audi(int carid, String model)
	{
		super(carid);
		this.model=model;
	}
	
	@Override
	void startCar() {

      System.out.println(carid+":Audi "+model+ " started");
		
	}
}

class Bmw extends Car
{
	String model;

    Bmw(int carid, String model)
   {
	super(carid);
	this.model=model;
   }

	@Override
	void startCar() {

		System.out.println(carid+": BMW" + model + " started");

	}
	
	
	void details()
	{
		System.out.println("Available in matt colours");
		System.out.println("Delivery in 3 months");
	}
}



public class AbstractTest2 {

	public static void main(String[] args) {

     Audi a1= new Audi(1011,"Q7");
     a1.startCar();
     
     System.out.println("----------------------------------");
     
     Bmw b1= new Bmw(789,"X3");
     b1.startCar();
     b1.details();
     
     System.out.println("----------------------------------");
     
     Car c;
     c= new Bmw(677,"Z6");
     c.startCar();
     //c.details();
     
     
     

	}

}
