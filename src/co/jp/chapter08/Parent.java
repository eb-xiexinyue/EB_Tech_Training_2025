package co.jp.chapter08;

public class Parent {
	public String familyName="Jack";
	private String givenName="Hills";
	protected int money=2000;
	public int age=30;
	
	public void init() {//init:初始化对象
		System.out.println("this is from parent class");//这里可以被child复写
	}
	
	public Parent(int age) {
		this.age= age;
		
	}
}
