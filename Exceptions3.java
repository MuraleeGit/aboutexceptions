// Exceptions handling with throw

package com.k2js.exceptions.practice;

class Exception3{
	
	public static void m(Object o){
		
		int i=0;
		String value= String.valueOf(o);
		try{
		 i = Integer.parseInt(value);
		}
		catch(NumberFormatException e){
			System.out.println("Please provide a valid input");
			e.printStackTrace();//this is a method to 
		}
		
	
		if(i%2==0){
			System.out.println("The given numbr is even");
		}
		else{
			System.out.println("The given number is odd");
		}
	}
}

class Exception3Test{
	 
	 public static void main(String...abc){
		 //Evenodd.m(10);
		 //Evenodd.m("15");
		 Exception3.m("Abc"); //if you eecute this it will throw run time exception.
		 Exception3.m(null);
		 
	 }
	
}
/*
D:\seleniumtrainingbyJitendra\Practicals\Javapracticals\aboutexceptions\src>java -cp ..\bin  com.k2js.exceptions.practice.Exception3Test
Please provide a valid input
java.lang.NumberFormatException: For input string: "Abc"
        at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        at java.lang.Integer.parseInt(Integer.java:580)
        at java.lang.Integer.parseInt(Integer.java:615)
        at com.k2js.exceptions.practice.Exception3.m(Exceptions3.java:12)
        at com.k2js.exceptions.practice.Exception3Test.main(Exceptions3.java:34)
The given numbr is even
Please provide a valid input
java.lang.NumberFormatException: For input string: "null"
        at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        at java.lang.Integer.parseInt(Integer.java:580)
        at java.lang.Integer.parseInt(Integer.java:615)
        at com.k2js.exceptions.practice.Exception3.m(Exceptions3.java:12)
        at com.k2js.exceptions.practice.Exception3Test.main(Exceptions3.java:35)
The given numbr is even*/

