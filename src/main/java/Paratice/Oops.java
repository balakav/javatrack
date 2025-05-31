package Paratice;
abstract class Person{
	private String name;
	private int age;
	private String address;
	public Person(String name,int age,String address) {
		this.name=name;
		this.age=age;
		this.address=address;
	}
	public void displayDetails() {
		// TODO Auto-generated method stub
		
	}
	public abstract void displaydetails();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
class Student extends Person {
    private int studentId;
    private String course;

    public Student(String name, int age, String address, int studentId, String course) {
        super(name, age, address);
        this.studentId = studentId;
        this.course = course;
    }
    @Override
    public void displayDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Address: " + getAddress());
        System.out.println("Course: " + course);
    }
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@Override
	public void displaydetails() {
		// TODO Auto-generated method stub
		
	}
	
    
}

class Teacher extends Person{

	
	public int teacherid;
	public String teachersub;
	public int getTeacherid() {
		return teacherid;
	}
	public void setTeacherid(int teacherid) {
		this.teacherid = teacherid;
	}
	public String getTeachersub() {
		return teachersub;
	}
	public void setTeachersub(String teachersub) {
		this.teachersub = teachersub;
	}
	
	public Teacher(String name, int age, String address, int teacherid, String teachersub) {
		super(name, age, address);
		this.teacherid = teacherid;
		this.teachersub = teachersub;
	}
	@Override
	public void displaydetails() {
		// TODO Auto-generated method stub
		System.out.println("Teacher ID: " + getTeacherid());
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Address: " + getAddress());
        System.out.println("Subject: " + teachersub);		
	}
	
	
}
public class Oops {
	public static void main(String args[]) {
		Student stuobj=new Student("Balakavi",21,"Sivakasi",20,"IT");
		stuobj.displayDetails();
		System.out.println();
		System.out.println();
		Teacher teaobj=new Teacher("Raja",27,"CBE",430,"Physics");
		teaobj.displaydetails();
		
	}
}
