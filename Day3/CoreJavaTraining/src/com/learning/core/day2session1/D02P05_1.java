package com.learning.core.day2session1;
import java.util.Scanner;

public class D02P05_1 
{

	public static void main(String[] args)
	{
		String str,rev = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		str = sc.nextLine();
		int length = str.length();
		for(int i = length - 1; i >= 0; i--)
			rev = rev + str.charAt(i);
		if(str.equals(rev))
			System.out.println("It is a palindrome ");
		else
			System.out.println("It is not a palindrome");
	}

}





/*package com.learning.core.day2session1;
import java.util.Scanner;

public class D02P05_1 {

	public static void main(String[] args)
	{
	
		String str;
		//int num ;
		int len =0 ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		str = sc.nextLine();
		char[] strChars = str.toCharArray();
		for(char ch : strChars)
		len++;
		System.out.println("\nLength of String = "+len);
	}

}
*/
