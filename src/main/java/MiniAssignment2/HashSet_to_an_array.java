package MiniAssignment2;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSet_to_an_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs=new LinkedHashSet<>();
		hs.add("welcome");
		hs.add("to");
		hs.add("Hashedin");
		hs.add("by");
		hs.add("deloitte");
		String[] arr=new String[hs.size()];
		hs.toArray(arr);
		for(String str:arr) {
			System.out.print(str+" ");
		}

	}

}
