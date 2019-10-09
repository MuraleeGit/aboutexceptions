//program to find the biggest numbr among three numbers using ternary operator.
package com.k2js.exceptions.practice;

class Gradecalc{
		public static String getGrade(int marks){
			
			if(marks >=80){
				return "topper " + marks;
			}
			else if(marks>=75 ){
				return "distinction" + marks;
			}
			else if(marks>=60 ){
				return "first class" +marks;
			}
			else if(marks>=50 ){
				return "second class " +marks;
			}
			else if(marks >=35){
				return "pass " + marks;
			}
			else{
				return "failed " + marks;
			}
			
		
		}
 
}
class GradecalcTest{
	public static void main(String...abc){
		int marks =(int)(Math.random()*75)+10;//it will generate from 10 to 75 number which is up to 84
		String s =Gradecalc.getGrade(marks);
		System.out.println("Your grade is " +s);
		
	}
}

