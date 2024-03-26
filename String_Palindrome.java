package strings_practice;

import java.util.Scanner;

public class String_Palindrome {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		
		System.out.println("enter the any string");
		
	     String str=sc.nextLine();
	     
	     String original=str;
	     String rev="";
	     
	     int length=str.length();
	     
	     for(int i=length-1;i>=0;i--) {
	    	 
	    	 rev=rev+str.charAt(i);
	    	 
	     }
	     
	     if(original.equals(rev)) {
	    	 System.out.println(rev  + "   is palindrome");
	     }
	     else
	     {
	    	 System.out.println(rev  +  "   is not palindrome");
	     }
		
	}

}
