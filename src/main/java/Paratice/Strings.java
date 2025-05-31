package Paratice;

import java.util.Scanner;

public class Strings {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		String s="hello world";
		char arr[]=s.toCharArray();
		for(char ch:arr) {
			System.out.print(ch+" ");
		}
		System.out.println();
		String d=s.concat("Hello");
		System.out.println(d);
		String g=s.toLowerCase();
		System.out.println(g);
		String k=s.replace("hello", "Hello");
		System.out.println(k);
		
		
		
		String s1="hello";
		String s2="hello";
		String s3=new String("hello");
		String s4=s1;
		System.out.println(s1 == s2); //true
		System.out.println(s1.equals(s2)); //true
		System.out.println(s1 == s3); //false
		System.out.println(s1.equals(s3)); //true
		System.out.println(s1 == s4); //true
		System.out.println(s1.equals(s4)); //true
		
		
		
	}

}
