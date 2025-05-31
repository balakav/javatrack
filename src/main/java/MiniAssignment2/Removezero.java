package MiniAssignment2;

import java.util.ArrayList;
import java.util.Collections;

public class Removezero {

	private static int j;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {0,10,43,27,0,98,75,59,3,191,0};
		ArrayList<Integer> al=new ArrayList<>();
		int c=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				c++;
			}
			else {
				al.add(arr[i]);
			}
		}
		System.out.println(al);
		int nums[]=new int[al.size()];
		for(int i=0;i<al.size();i++) {
			nums[i]=al.get(i);
		}
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]>nums[j]) {
					int temp=nums[i];
					nums[i]=nums[j];
					nums[j]=temp;

				}
			}
		}
		
		
//		Collections.sort(al);
		for(int i:nums) {
			System.out.print(i+" ");
		}

	}

}
