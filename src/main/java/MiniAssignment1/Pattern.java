package MiniAssignment1;

import java.util.Scanner;

public class Pattern {
	public static void main(String args[]) {
		int i, j, k, n;  
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter the number: ");  
		n = sc.nextInt();          
		for (i= 1; i<= n ; i++){  
		for (j=i; j <n ;j++){  
		System.out.print(" ");  
		}  
		
		for (k=1; k<=i;k++){  
		System.out.print("*");   
		}   
		System.out.println("");   
		}   
		for (i=n; i>=1; i--){  
		for(j=i; j<=n;j++){  
		System.out.print(" ");  
		}  
		for(k=1; k<i ;k++)   {  
		System.out.print("*");  
		}  
		System.out.println("");  
		}  
	}

}
