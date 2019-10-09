// The user doesn't know what exception is this.
// At that time the nuser has to write parent exception which will handle any of its chils exception.
package com.k2js.exceptions.practice;

class Exception8{
	
	public static void m(Object o){
		
		
		//String value= String.valueOf(o);
		String value= null;//it will throw nullpointer exception
		int i=0;
		try{//try with multiple catch
			value =o.toString();
			i=Integer.parseInt(value);
		}
		catch(Exception e){
			if(e instanceof NullPointerException)
				System.out.println("with null we cant");
			else if (e instanceof NumberFormatException);
			System.out.println("you provided null");	
		}
		
	}
}

class Exception8Test{
	 
	 public static void main(String...abc){
		 
		 Exception8.m(null);
		 
	 }
	
}
