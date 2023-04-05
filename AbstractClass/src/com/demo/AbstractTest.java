package com.demo;

public class AbstractTest {

	public static void main(String[] args) {

     // Person p1= new Person();
	   Employee e1= new Employee("Sahili", 23, 89000f, "Java Developer");
	   e1.checkVote();
	   e1.checkStatus();
	   e1.moneyStatus(3000f);
	   
	   System.out.println("---------------------------------------");
	   Patient p1= new Patient("Rahul", 56, "Dengue", 78000f);
	   p1.checkVote();
	   p1.checkStatus();
	   p1.moneyStatus(56000f);
      

	}

}
