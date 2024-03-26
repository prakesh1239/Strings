package strings_practice;

import java.util.Scanner;

public class UpperCaseLetters_LowercaseLetters {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the string value");
		
		String str=sc.nextLine();
		
	 
	    
	    int uppercase=0;
	    int lowercase=0;
	    
	    for(int i=0;i<str.length();i++) {
	    	
	    char ch=str.charAt(i);
	    
	    if(Character.isUpperCase(ch)) {
	    	
	    	uppercase++;
	    }
	    else {
	    	if(Character.isLowerCase(ch)) {
	    		lowercase++;
	    	}
	    		
	    		
	    	}
	    }
	    System.out.println("uppercase count is " + uppercase);
	    System.out.println("lowercase count is " + lowercase);

	    

	}

}
