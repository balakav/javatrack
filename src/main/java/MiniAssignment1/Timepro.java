package MiniAssignment1;
class Time{
	private int hr;
	private int mm;
	private int sec;
	public Time() {
		
		this.hr = 0;
		this.mm = 0;
		this.sec = 0;
	}
	public Time(int hr, int mm, int sec) {
		if(isValidTime(hr,mm,sec)) {
			this.hr = hr;
			this.mm = mm;
			this.sec = sec;
		}
		else {
			System.out.print("Invalid Input");
			this.hr = 0;
			this.mm = 0;
			this.sec = 0;
		}
		
	}
	public boolean isValidTime(int hr,int mm,int sec) {
		return((hr>=1 && hr<=23)&&(mm>=1 &&mm<=59)&&(sec>=1&&sec<=59));
	}
	public void Display() {
		System.out.print("Time: "+hr+":"+mm+":"+sec);
	}
	
	
}
public class Timepro {
public static void main(String args[]) {
	Time t1=new Time(10,30,45);
	t1.Display();
	System.out.println();
	Time t2=new Time(23,61,45);
	t2.Display();
}
}
