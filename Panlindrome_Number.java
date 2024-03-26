package strings_practice;

import java.util.Scanner;

public class Panlindrome_Number {

	public static void main(String[] args) {

		Scanner sc=new Scanner (System.in);
		
		System.out.println("enter the integer value");
		
		int num=sc.nextInt();
		
		int ogiginal_num = num;
		
		int rev=0;
		
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		if(ogiginal_num==rev) {
			System.out.println(ogiginal_num+"   is palindrome");
		}
		else
		{
			System.out.println(ogiginal_num+"   is  not palindrome");	
		}
		
		
		
		
	}

}
