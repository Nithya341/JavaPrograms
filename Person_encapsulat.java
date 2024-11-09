package Exceptions_throws;

public class Person_encapsulat {

	private String name = "Nithya";
	private int age = 24;
	private String country = "India";
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getName() {
		return name;
	}
	public String getCountry() {
		return country;
	}
	public int getAge() {
		return age;
	}
	public static void main(String[] args) {
		Person_encapsulat v1 = new Person_encapsulat();
		v1.setName("sumithra");
		v1.setCountry("New zeland");
		v1.setAge(46);
		System.out.println(v1.getAge());
		System.out.println(v1.getName());
		System.out.println(v1.getCountry());
	}
}
