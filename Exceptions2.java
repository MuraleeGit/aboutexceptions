// Exceptions handling with throw

package com.k2js.exceptions.practice;

class Evenodd{
	
	public static void m(Object o){
		
		int i=0;
		String value= String.valueOf(o);
		try{
		 i = Integer.parseInt(value);
		}
		catch(NumberFormatException e){
			System.out.println("Please provide a valid input");
			throw e;// to stop the 
		}
		
	
		if(i%2==0){
			System.out.println("The given numbr is even");
		}
		else{
			System.out.println("The given number is odd");
		}
	}
}

class EvenoddTest{
	 
	 public static void main(String...abc){
		 //Evenodd.m(10);
		 //Evenodd.m("15");
		 Evenodd.m("Abc"); //if you eecute this it will throw run time exception.
		 Evenodd.m(null);
		 
	 }
	
}

