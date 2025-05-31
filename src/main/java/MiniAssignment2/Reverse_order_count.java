package MiniAssignment2;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Reverse_order_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="chhaviH";
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
		System.out.println();
		HashMap<Character,Integer> hm=new LinkedHashMap<>();
		for(int i=0;i<s.length();i++) {
			hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i), 0)+1);
		}
		System.out.print(hm);
		

	}

}
