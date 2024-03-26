package strings_practice;

import java.util.Scanner;

public class Words_In_String {

	public static void main(String[] args) {

		
     Scanner sc=new Scanner	(System.in)	;
     
     System.out.println("enter any string");
     
     String Str = sc.nextLine();
     
     String[] ss= Str.split(" ");
     
     System.out.println(ss.length);
    
   	}

}
