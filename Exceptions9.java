// The user doesn't know what exception is this.
// At that time the nuser has to write parent exception which will handle any of its chils exception.
package com.k2js.exceptions.practice;

class Exception9{
	
	public static void m(Object o){
		String value=null;
		int i=0;
		try{
			value = o.toString();
			i=Integer.parseInt(value);
		}
		catch(NumberFormatException e){
			System.out.println("something");
		}
		catch(Exception e){
			System.out.println("null cant be usd to cal metods");	
			
		}
			
	}
}

class Exception9Test{
	 
	 public static void main(String...abc){
		 
		 Exception9.m(null);
		 Excption9.m("abc");
		 
	 }
	
}
