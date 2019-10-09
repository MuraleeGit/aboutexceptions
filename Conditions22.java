//write a program to print Sunday to Saturday from number 1 to 9
//if 1 then sunday, if 2 thn monday like that. 
//The same programe we are writing using switch case statement. 

package com.k2js.exceptions.practice;

class Switchcase{
	public static void m(int i){
		int r = (i%2==0)?0:1;
		switch(r){
			case 0:
			System.out.println("Even number");
			break;
			case 1:
			System.out.println("Odd Number");
		}
	}	
}

class SwitchcaseTest{
	public static void main(String...abc){
		Switchcase.m(0);
	}
}
