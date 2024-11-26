package co.jp.chapter08;

public class Parent {
	public String familyName = "Jack";
	
	private String givenName = "Hills";
	
	protected int money = 2000;
	
	public int age;
	
	public void init() {
		System.out.println("This is from Parent class");
	}
	
	public Parent(int age) {
		this.age = age;
	}
}
