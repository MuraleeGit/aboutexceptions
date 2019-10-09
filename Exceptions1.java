// Exceptions handling

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

/*
D:\seleniumtrainingbyJitendra\Practicals\Javapracticals\aboutconditions\src>java -cp ..\bin  com.k2js.aboutconditions.practice.EvenoddTest
The given numbr is even
The given number is odd
Exception in thread "main" java.lang.NumberFormatException: For input string: "Abc"
        at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        at java.lang.Integer.parseInt(Integer.java:580)
        at java.lang.Integer.parseInt(Integer.java:615)
        at com.k2js.aboutconditions.practice.Evenodd.m(Conditions8.java:11)
        at com.k2js.aboutconditions.practice.EvenoddTest.main(Conditions8.java:27)
		*/
		