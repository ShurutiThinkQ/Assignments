package com.demo;

abstract public class Person {
	
	private String name;
	private int age;
	static int pcount=0;
	
	{
		pcount++;
	}
	
	Person()
	{
		
	}
	
	 Person(String name, int age)
	{
		System.out.println("Abstract class constructor");
		this.name=name;
		this.age=age;
	}
	
	//abstract method: not final , no static 
	
	abstract void checkStatus();
	
	abstract void moneyStatus(float amount);
	
	//static 
	static void displayPerssonCount()
	{
		System.out.println("Number of person:"+pcount);
	}
	
	//concrete. instance
	
	 void checkVote()
	{
		if(age>=18)
			System.out.println(name+" can vote");
		else
			System.out.println(name+" cannot vote");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "name=" + name + ", age=" + age ;
	}

	 
	 
	 
}
