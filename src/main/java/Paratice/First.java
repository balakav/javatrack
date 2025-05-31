package Paratice;

import java.util.Arrays;
import java.util.Scanner;

public class First {
	
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		int n=5;
		int arr[]= {4,2,3,1,6};
		//1.bubble sort
		System.out.println("1.sortig a array");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println();
		System.out.println("---------------------------------------------");
		//2.Remove duplicate values
		System.out.println("2.Remove a duplicate elements in the array");
		int size=7;
		int array[]= {1,1,2,2,4,4,7};
		
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				
				if(array[i]==array[j]) {
					array[i]=0;
					break;
				}
			}
			if(array[i]!=0) {
				System.out.print(array[i]+" ");
			}
		}
		System.out.println();
		System.out.println();
		System.out.println("---------------------------------------------");

		//3.Calculator
		System.out.println("3.Display calculator");
		int a=8;
		int b=9;
		
		char ch='+';
		switch(ch) {
		case '+':
			System.out.println(a+b);
			break;
		case '-':
			System.out.println(a-b);
			break;
		case '*':
			System.out.println(a*b);
			break;
		case '/':
			if(b!=0) {
				System.out.println(a/b);
				break;
				
			}
			else {
				System.out.println("Divisor can not be zero");
				break;
			}
		default:
			System.out.println("Invalid Input");
		}
		System.out.println();
		System.out.println("---------------------------------------------");
		//4.pattern
		System.out.println("4.left upper triangle pattern");
		for(int i=0;i<n;i++) {
			for(int j=n;j>i;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("---------------------------------------------");
		
	}

}
