package com.operators;

public class GreaterThreeNumbers {

	public static void main(String[] args) {

     //logic1 
		
		int a= 78;
		int b=90;
		int c=56;
		/*
		if((a>b)&&(a>c))
		{
			System.out.println(a+ " is greatest.");
		}
		else if(b>c)
		     {
			  System.out.println(b+" is greatest");
		     }
		     else
		     {
		    	 System.out.println(c+" is greatest");
		     }
			
      */
		
		//logic 2
		
		/*
		if(a>b)
		{
			if(a>c)
			{
				System.out.println(a+ "is greatest");
				
			}
			else
			{
				System.out.println(c+ "is greatest");
			}
		}
		else
		{
			if(b>c)
			{
				System.out.println(b+ " is greatest");
			}
			else
			{
				System.out.println(c+ " is greatest");
			}
		}
		*/
		
		// logic 3
		
		int greater;
		
		greater= (a>b)?((a>c)?a:c):((b>c)?b:c);
		
		System.out.println("Greatest number:"+greater);
	}

}
