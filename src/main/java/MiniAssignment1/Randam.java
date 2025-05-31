package MiniAssignment1;

import java.util.*;

public class Randam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[10];
		Random r=new Random();
		for(int i=0;i<arr.length;i++) {
			arr[i]=r.nextInt(100)+1;
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		int min=arr[0];
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println("Minimum: "+min);
		System.out.println("Maximum: "+max);

	}

}
