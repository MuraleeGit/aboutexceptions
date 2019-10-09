// Exceptions handling with e.getMssage

package com.k2js.exceptions.practice;

class Exception4{
	
	public static void m(Object o){
		
		int i=0;
		String value= String.valueOf(o);
		try{
		 i = Integer.parseInt(value);
		}
		catch(NumberFormatException e){
			System.out.println("Please provide a valid input");
			System.out.println(e.getMessage()); //what is the maning of this?
		}
		
	}
}

class Exception4Test{
	 
	 public static void main(String...abc){
		 //Evenodd.m(10);
		 //Evenodd.m("15");
		 //Exception4.m("Abc"); //if you eecute this it will throw run time exception.
		 Exception4.m(null);
		 
	 }
	
}
