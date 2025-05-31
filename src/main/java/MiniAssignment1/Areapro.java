package MiniAssignment1;
class Area{
	public double Circle(double r) {
		return 3.14*r*r;
	}
	public double Square(double a) {
		return a*a;
	}
	public double Rectangle(double l,double b) {
		return l*b;
	}
	public double Triangle(double l,double b) {
		return 0.5*l*b;
	}
	
}
public class Areapro {
	public static void main(String args[]) {
		Area a=new Area();
		System.out.println("Area of Circle is :"+a.Circle(10));
		System.out.println("Area of Square is :"+a.Square(10));
		System.out.println("Area of Rectangle is :"+a.Rectangle(10,8));
		System.out.println("Area of Triangle is :"+a.Triangle(10,6));
	}

}
