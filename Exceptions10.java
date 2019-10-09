//
package com.k2js.exceptions.practice;

class Exception10{
		public static void m(Object o){
			String value=null;
		int i=0;
			try{
				value =o.toString();
				i=Integer.parseInt(value);
			}
			catch(NullPointerException | NumberFormatException e){
				System.out.println((e instanceof NullPointerException)? "Null cant be used to call method" 
				:(e instanceof NullPointerException) ? "invalid input"
				: "not a number");
			}			
		}
}

class Exception10Test{
	 
	 public static void main(String...abc){
		 
		 Exception10.m(null);
		 Exception10.m("abc");
		 
	 }
	
}
