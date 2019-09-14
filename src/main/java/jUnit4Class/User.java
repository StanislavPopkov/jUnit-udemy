package jUnit4Class;
//import org.junit.Test;

public class User {

	private String name;
	private int age;
	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	//@Test
	public void test1() {
		System.out.println("in test1()");
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return this.name + ", " + this.age + " years";
	}
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	@Override
	public boolean equals(Object other) {
		if(this == other ) return true;
		if(!this.getClass().equals(other.getClass())) return false;

		return this.name.equals(  ((User)other).name ) && this.age == ((User)other).age;
	}


	
}
