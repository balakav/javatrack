package MiniAssignment2;

public class Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Ba1@@@@298";
			
		try {
			if(s.length()<5 || s.length()>10) {
				System.out.print("Password range 5-10");
			}
		
		boolean u = false;
        boolean l = false;
        boolean d = false;
        boolean sc = false;
        for(char ch:s.toCharArray()) {
        	if(Character.isUpperCase(ch)) {
        		u=true;
        	}
        	else if(Character.isLowerCase(ch)){
        		l=true;
        	}
        	else if(Character.isDigit(ch)) {
        		d=true;
        	}
        	else {
        		sc=true;
        	}
        }
		
        if(!u) {
        	System.out.println("Passward contain atleast one uppercase");
        }
        if(!l) {
        	System.out.println("Passward contain atleast one Lowercase");
        }
        if(!d) {
        	System.out.println("Passward contain atleast one number");
        }
        if(!sc) {
        	System.out.println("Passward contain atleast one spicalchar");
        }
        if(u==true&&l==true&&d==true&&sc==true) {
        	System.out.println("Password accepted");
        }
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	

}
