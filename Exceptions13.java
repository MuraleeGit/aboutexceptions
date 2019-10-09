//program to find the biggest numbr among three numbers.
package com.k2js.exceptions.practice;

class FindBig{
	
	public static int getBigNumber(int i, int j, int k){
		
			if (i>j && i>k){
				System.out.println("The highest number is i" + i);
			}
			else if (j>i && j>k){
				System.out.println("The highest number is j" + j);

			}
			else{
				System.out.println("The highest number is K" +k);
			}
			
			
			return 0;
	}
}

class FindBigTest{
	public static void main(String...abc){
		FindBig.getBigNumber(-1,-1,-1);
	}
}