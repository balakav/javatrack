package MiniAssignment2;

public class Exceptionhandleing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			int b=5/0;
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		finally {
			System.out.println("Thank You");
		}
		

	}

}
