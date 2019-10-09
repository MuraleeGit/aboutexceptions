//write a program to print Sunday to Saturday from number 1 to 9
//if 1 then sunday, if 2 thn monday like that. 
//The same programe we are writing using switch case statement. 
/*
package com.k2js.exceptions.practice;

class Weekdays{
	
	public static void m(int i){
		
		if (i==1){
			System.out.println("Sunday" +i);
		}else if(i==2){
			System.out.println("Monday" +i);
		}else if(i==3){
			System.out.println("Tuesday" +i);
		}else if(i==4){
			System.out.println("Wednesday" +i);
		}else if(i==5){
			System.out.println("Thursday" +i);
		}else if(i==6){
			System.out.println("Friday" +i);
		}else if(i==7){
			System.out.println("Saturday" +i);
		}
		else{
			System.out.println("No day in the weekdays" +i);

		}
		
	}
}

class WeekdaysTest{
	public static void main(String...abc){
		Weekdays.m((int)((Math.random()*9+0)));
	}
}
*/

package com.k2js.exceptions.practice;

class WeekdaysSwitch{
	
	public static void m(int i){
		switch(i){
			case 1:
				System.out.println("Sunday" +i);
				break;
			case 2:
				System.out.println("Monday" +i);
				break;
			case 3:
				System.out.println("Tuesday" +i);
				break;
			case 4:
				System.out.println("Wednesday" +i);
				break;
			case 5:
				System.out.println("Thursday" +i);
				break;
			case 6:
				System.out.println("Friday" +i);
				break;
			case 7:
				System.out.println("Saturday" +i);
				break;
		
			default:
			System.out.println("No day in a weekday");
		}
	}
}

class WeekdaysSwitchTest{
	public static void main(String...abc){
		WeekdaysSwitch.m(8);
	}
}

/*where all colon : can beused.
: can be used in case
: can be used in assert
: can be used in ternary
: can be used in method reference
*/
