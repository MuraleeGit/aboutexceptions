//write a program to print Sunday to Saturday from number 1 to 9
//if 1 then sunday, if 2 thn monday like that 

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

/*
D:\seleniumtrainingbyJitendra\Practicals\Javapracticals\aboutexceptions\src>javac -d ..\bin com\k2js\exceptions\practice\Conditions20.java

D:\seleniumtrainingbyJitendra\Practicals\Javapracticals\aboutexceptions\src>java -cp ..\bin  com.k2js.exceptions.practice.WeekdaysTest
No day in the weekdays8

D:\seleniumtrainingbyJitendra\Practicals\Javapracticals\aboutexceptions\src>java -cp ..\bin  com.k2js.exceptions.practice.WeekdaysTest
Sunday1

D:\seleniumtrainingbyJitendra\Practicals\Javapracticals\aboutexceptions\src>java -cp ..\bin  com.k2js.exceptions.practice.WeekdaysTest
Wednesday4

D:\seleniumtrainingbyJitendra\Practicals\Javapracticals\aboutexceptions\src>java -cp ..\bin  com.k2js.exceptions.practice.WeekdaysTest
Friday6

D:\seleniumtrainingbyJitendra\Practicals\Javapracticals\aboutexceptions\src>java -cp ..\bin  com.k2js.exceptions.practice.WeekdaysTest
No day in the weekdays0

D:\seleniumtrainingbyJitendra\Practicals\Javapracticals\aboutexceptions\src>java -cp ..\bin  com.k2js.exceptions.practice.WeekdaysTest
Sunday1

D:\seleniumtrainingbyJitendra\Practicals\Javapracticals\aboutexceptions\src>java -cp ..\bin  com.k2js.exceptions.practice.WeekdaysTest
Saturday7

D:\seleniumtrainingbyJitendra\Practicals\Javapracticals\aboutexceptions\src>java -cp ..\bin  com.k2js.exceptions.practice.WeekdaysTest
Wednesday4

D:\seleniumtrainingbyJitendra\Practicals\Javapracticals\aboutexceptions\src>java -cp ..\bin  com.k2js.exceptions.practice.WeekdaysTest
Saturday7
*/