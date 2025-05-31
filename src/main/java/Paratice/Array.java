package Paratice;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
//		int n=in.nextInt();
//        int arr[]=new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=in.nextInt();
//        }
		int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
		
		//1.Transpose the matrix
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("----------------");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("--------90 degree rolate--------");
		//2.90 degree rolate
		for(int i=0;i<3;i++) {
			for(int j=3-1;j>=0;j--) {
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("--------180 degree rolate--------");
		//2.180 degree rolate
		for(int i=3-1;i>=0;i--) {
			for(int j=3-1;j>=0;j--) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("-------- rolate--------");
		//2. degree rolate
		for(int i=3-1;i>=0;i--) {
			for(int j=3-1;j>=0;j--) {
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("-------- Max product--------");
		int a[]= {2, 3, 5, 7, -7, 5, 8, -5};
		int max=1;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(i!=j && a[i]!=a[j])
				max=Math.max(max, (a[i]*a[j]));
			}
		}
		System.out.println(max);
		System.out.println();
		System.out.println("-------- --------");
		int b[]= {11,5,3,6,9,2};
		for(int i=0;i<b.length;i++) {
			for(int j=i+1;j<b.length;j++) {
				if(b[i]<b[j]) {
					break;
				}
			}
			System.out.print(b[i]+" ");
		}
		
	}

}
