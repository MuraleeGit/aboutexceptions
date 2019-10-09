//program to find the biggest numbr among three numbers using ternary operator.
//Very very important class.
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
class IndependantTest2{
	public static void main(String...abc){
		char[] a={'M', 'F','T'};
		int r =(int)(Math.random()*3)+0;
		System.out.println("the gender is " +a[r]);
		
		int age=(int)(Math.random()*75)+10;
		Boy_or_Girl.getAge(a[r],age);
		
	
	}
}