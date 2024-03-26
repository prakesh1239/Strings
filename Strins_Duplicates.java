package strings_practice;

import java.util.Scanner;

public class Strins_Duplicates {

	public static void main(String[] args) {

		
        Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String value");
		
	    String original=sc.nextLine();
	    
	 char[] ch=	original.toCharArray();
	 
	 int count=0;
	 
	 for(int i=0;i<ch.length;i++) {
		 
		 for(int j=i+1;j<ch.length;j++) {
			 
			 if(ch[i]==ch[j]) {
				 System.out.println("duplicate charcters in string == "+ch[j]);
			 }
		 }
	 }
	
	    
	   
	}

}
