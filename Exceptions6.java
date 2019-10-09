// The user doesn't know what exception is this.
// At that time the nuser has to write parent exception which will handle any of its chils exception.


package com.k2js.exceptions.practice;

class Exception6{
	
	public static void m(Object o){
		
		int i=0;
		String value= String.valueOf(o);
		try{
		 i = Integer.parseInt(value);
		}
		catch(Exception e){
		 System.out.println(e);	
		
		}
		
	}
}

class Exception6Test{
	 
	 public static void main(String...abc){
		 
		 Exception6.m(null);
		 
	 }
	
}
