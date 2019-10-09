//program to find the biggest numbr among three numbers using ternary operator.
package com.k2js.exceptions.practice;

class Boy_or_Girl{
	
	public static String getAge(char gender, int age){
		if(gender=='M'){
			if(age<25){
				return "boy " +age;
			}
			else if(age<50){
				return "man "+age;
			}
		    else{
				return "old man "+age;
			}
		}
		else if(gender=='F'){
			if(age<25){
				return "girl " +age;
			}
			else if(age<50){
				return "woman "+age;
			}
			else{
				return "old woman "+age;
			}
			
		}
		return null;
	}
	
}
class IndependantTest{
	public static void main(String...abc){
		
		int a=(int)(Math.random()*75)+10;// we dont need to give input from 10 to 84 because this function will take care
		String s =Boy_or_Girl.getAge('M',a);
		System.out.println("the category is " +s);
		return;
	}
}