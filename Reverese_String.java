package strings_practice;

import java.util.Scanner;

public class Reverese_String {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String value");
		
	    String original=sc.nextLine();
	    String reverse=" ";
	   char[] ch= original.toCharArray();
	   
	   System.out.println(original.length());
	   
	   for(int i=original.length()-1;i>=0;i--) {
		   
		   reverse=reverse+ch[i];
	   }

	   System.out.println("Reverse String is" + reverse);
	}

}
