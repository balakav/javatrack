package MiniAssignment2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="hgfdsa";
		String s2="asdfgh";
		ArrayList<Character> al1=new ArrayList<>();
		ArrayList<Character> al2=new ArrayList<>();
		for(int i=0;i<s1.length();i++) {
			al1.add(s1.charAt(i));
		}
		for(int i=0;i<s2.length();i++) {
			al2.add(s2.charAt(i));
		}
		Collections.sort(al1);
		Collections.sort(al2);
		boolean f=false;
		if(s1.length()==s2.length()) {
			for(int i=0;i<al1.size();i++) {
				for(int j=0;j<al2.size();j++) {
					if((i==j) &&(al1.get(i)==al2.get(j))) {
						f=true;
					}
				}
			}
		}
		else {
			System.out.println("Not Anagram");
			
		}
		if(f==true) {
			System.out.println("Anagram");
		}

	}

}
