//checking where to write the try catch in a program.
package com.k2js.exceptions.practice;

class Exception12{
			
	public static int getQuotient(Object numerator, Number denomenator){

		if (numerator !=null && denomenator !=null){
			String n=null;
			int d=0;
			try{
				n=numerator.toString();
				d=denomenator.intValue();
				return Integer.valueOf(n)/d;
			}
			catch(NumberFormatException | ArithmeticException e){
				System.out.println(e);
				return -1;
			}
		}
		else{
			System.out.println("null is not a valid input");
			return -1;
		}
		

	}	
}

class Exception12Test{
	 
	 public static void main(String...abc){
		 
		System.out.println(Exception12.getQuotient(null, null));
		System.out.println(Exception12.getQuotient("abc", 0));
		System.out.println(Exception12.getQuotient(10, 0.0));
		System.out.println(Exception12.getQuotient(0, 0.0));
		System.out.println(Exception12.getQuotient(10, 0));
		System.out.println(Exception12.getQuotient(10, 5));
		 
		 
	 }
	
}

/* In the Exception12Test we are passing invalid values. For that we are writing the try and catch.*/
