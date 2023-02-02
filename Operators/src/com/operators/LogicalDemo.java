package com.operators;

import java.util.Scanner;

public class LogicalDemo {

	public static void main(String[] args) {

      Scanner sc= new Scanner(System.in);
      
      System.out.println("Enter total marks:");
      float marks= sc.nextFloat();
      
      System.out.println("Enter marks of best three:");
      float bestThree= sc.nextFloat();
      
    /*  if((marks>85)||(bestThree>90))
      {
    	  System.out.println("Eligible in college");
      }
      else
    	  System.out.println("Not eligible");
      
      */
      // using trenary
      
      System.out.println((marks>85)&&(bestThree>90)? "Eligible in college":"Not eligible");
      

	}

}
