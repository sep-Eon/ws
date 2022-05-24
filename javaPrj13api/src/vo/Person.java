package vo;

public class Person {

	
	public Person(String name, int age, double height, double weight, char gender) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.gender = gender;
	}	
		
	private String name;
	private int age;
	private double height;
	private double	weight;
	private char gender;
	
	
	
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
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight + ", gender="
				+ gender + "]";
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}

}
