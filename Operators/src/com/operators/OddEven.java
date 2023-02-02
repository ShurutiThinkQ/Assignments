package com.operators;

public class OddEven {

	public static void main(String[] args) {

      int num=89;
      
      System.out.println(num + ((num%2==0)?"  is even":" is odd"));
      
      String status;
      
      status = (num%2==0)?"even":"odd";
      
      System.out.println(num +" is "+status);

	}

}
