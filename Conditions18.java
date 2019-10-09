//This program is for selecctin the machine and the browser that needs to be opened.
//Very very important class.
package com.k2js.exceptions.practice;

class BrowserOpen{
	public static String OpenAnyBrowser(String bn, String rm){
	
		if(rm.equals("remote")){
			if(bn.equalsIgnoreCase("chrome")){
				return "chrome opening in machine1";
			}
			else if(bn.equalsIgnoreCase("FireFox")){
				return "firefox opening in machine 2";
			}
				
		}
		else if(rm.equalsIgnoreCase("local")){
			if(bn.equalsIgnoreCase("chrome")){
				return("chrome is running in local machine");
			}
			else if(bn.equalsIgnoreCase("firefox")){
				return("fire fox running in local");
			}
		}
				
		return null;
			
	}

}

class IndependantTest{
	public static void main(String...abc){
		String[] rm={"local", "remote"};
		String[] bn={"chrome", "firefox", "ie"};
		int i = (int)(Math.random()*bn.length)+0;
	    int j = (int)(Math.random()*rm.length)+0;
		String r= BrowserOpen.OpenAnyBrowser(bn[i],rm[j]);
		System.out.println(bn[i]+rm[j]);
		System.out.println("The result is " +r);
		
	}
}