package MiniAssignment2;

public class Duplicate_elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String arr[]= {"abc", "java", "javahungry", "java", "javahungry", "yash", "yash"};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(isEquals(arr[i],arr[j])) {
					System.out.println("Duplicate element: "+arr[i]);
					
				
				}
			}
			
		}
	
	}

	public static boolean isEquals(String s, String t) {
		
		char arr1[]=s.toCharArray();
		char arr2[]=t.toCharArray();
		boolean f=false;
		if(s.length()==t.length()) {
			for(int i=0;i<arr1.length;i++) {
				for(int j=0;j<arr2.length;j++) {
					if((i==j) &&(arr1[i]==arr2[j])) {
						f=true;
					}
				}
			}
		}
		else {
			return false;
			
		}
		
		return true;
	}

}
