package MiniAssignment1;
class Animal{
	private String color;
	private int weight;
	private int lifespan;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getLifespan() {
		return lifespan;
	}
	public void setLifespan(int lifespan) {
		this.lifespan = lifespan;
	}
	
	
	
}
public class Animalpro {
	public static void main(String args[]) {
		
		Animal animalobj=new Animal();
		animalobj.setColor("black");
		System.out.println(animalobj.getColor());
		animalobj.setWeight(30);
		System.out.println(animalobj.getWeight());
		animalobj.setLifespan(40);
		System.out.println(animalobj.getLifespan());
	}

}
