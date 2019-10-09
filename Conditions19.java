//write a program to generate the random number from A to z. Check which lettr is being generated.
//small letter, capital letter, or some other number.
package com.k2js.exceptions.practice;

class A{
	
	public static void m(char i){
		
		if(i<'Z'){
			System.out.println(" The number generated is capital letters" +i);
		}
		else if(i>'a' && i<'z'){
			System.out.println("The number generated is lower case numbers" +i);
		}
		else{
			System.out.println("Special characters" +i );
		}
	}
}

class ATest{
	
	public static void main(String...abc){
		
		A.m((char)((Math.random()*('z'-'A'))+'A'));
		A.m((char)((Math.random()*('z'-'A'))+'A'));
		A.m((char)((Math.random()*('z'-'A'))+'A'));
	}
	
}
/* output

D:\seleniumtrainingbyJitendra\Practicals\Javapracticals\aboutexceptions\src>javac -d ..\bin com\k2js\exceptions\practice\Conditions19.j

D:\seleniumtrainingbyJitendra\Practicals\Javapracticals\aboutexceptions\src>java -cp ..\bin  com.k2js.exceptions.practice.ATest
Special characters[

D:\seleniumtrainingbyJitendra\Practicals\Javapracticals\aboutexceptions\src>java -cp ..\bin  com.k2js.exceptions.practice.ATest
 The number generated is capital lettersC

D:\seleniumtrainingbyJitendra\Practicals\Javapracticals\aboutexceptions\src>java -cp ..\bin  com.k2js.exceptions.practice.ATest
Special characters`

D:\seleniumtrainingbyJitendra\Practicals\Javapracticals\aboutexceptions\src>java -cp ..\bin  com.k2js.exceptions.practice.ATest
The number generated is lower case numbersc

D:\seleniumtrainingbyJitendra\Practicals\Javapracticals\aboutexceptions\src>java -cp ..\bin  com.k2js.exceptions.practice.ATest
The number generated is lower case numbersh

D:\seleniumtrainingbyJitendra\Practicals\Javapracticals\aboutexceptions\src>java -cp ..\bin  com.k2js.exceptions.practice.ATest
 The number generated is capital lettersB

D:\seleniumtrainingbyJitendra\Practicals\Javapracticals\aboutexceptions\src>java -cp ..\bin  com.k2js.exceptions.practice.ATest
The number generated is lower case numbersb

D:\seleniumtrainingbyJitendra\Practicals\Javapracticals\aboutexceptions\src>java -cp ..\bin  com.k2js.exceptions.practice.ATest
The number generated is lower case numbersh

D:\seleniumtrainingbyJitendra\Practicals\Javapracticals\aboutexceptions\src>java -cp ..\bin  com.k2js.exceptions.practice.ATest
The number generated is lower case numbersr

D:\seleniumtrainingbyJitendra\Practicals\Javapracticals\aboutexceptions\src>java -cp ..\bin  com.k2js.exceptions.practice.ATest
Special characters`

D:\seleniumtrainingbyJitendra\Practicals\Javapracticals\aboutexceptions\src>java -cp ..\bin  com.k2js.exceptions.practice.ATest
 The number generated is capital lettersS

D:\seleniumtrainingbyJitendra\Practicals\Javapracticals\aboutexceptions\src>java -cp ..\bin  com.k2js.exceptions.practice.ATest
The number generated is lower case numbersm

D:\seleniumtrainingbyJitendra\Practicals\Javapracticals\aboutexceptions\src>java -cp ..\bin  com.k2js.exceptions.practice.ATest
The number generated is lower case numbersn

D:\seleniumtrainingbyJitendra\Practicals\Javapracticals\aboutexceptions\src>java -cp ..\bin  com.k2js.exceptions.practice.ATest
Special characters]
*/