package MiniAssignment2;

import java.util.HashMap;

public class count_the_occurrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Coderolls";
		HashMap<Character,Integer> hm=new HashMap<>();
		for(int i=0;i<s.length();i++) {
			hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i), 0)+1);
		}
		System.out.print(hm);
	}

}
