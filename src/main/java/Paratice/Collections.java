package Paratice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Collections {
	private static final int HashMap = 0;

	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		ArrayList<Integer> al=new ArrayList<>();
		for(int i=0;i<5;i++) {
			al.add(i);
			
		}
		for(int k:al) {
			System.out.print(k+" ");
		}
		System.out.println();
		HashSet<Integer> hs=new HashSet<>();
		hs.add(1);
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(1);
		System.out.print(hs);
		System.out.println("-----------------------");
		HashMap<Integer,Integer> hm=new HashMap<>();
		for(int i=0;i<6;i++) {
			int num=in.nextInt();
			int value=in.nextInt();
			hm.put(num, value);
		}
		System.out.print(hm);
		
	}

}
