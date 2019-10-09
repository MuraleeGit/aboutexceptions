//program to find the biggest numbr among three numbers using ternary operator.
package com.k2js.exceptions.practice;

class FindBig2{
	
	public static int Bignumber(int i, int j, int k){

		return ((i>j && i>k)?i:(j>k && j>i)?j:k);	
		
	}
	
}

class FindBig2test{
	public static void main(String...abc){
		int r= FindBig2.Bignumber(10,20,30);
		System.out.println("The highest number is "+r);
	}
}	