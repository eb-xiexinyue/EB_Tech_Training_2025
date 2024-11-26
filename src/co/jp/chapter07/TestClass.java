package co.jp.chapter07;

public class TestClass {
	private int x = 0;
	
	public static int static_x = 123;

	public String getStr() {
		TestClass ts = new TestClass(20);
		return "This is from TestClass";
	}
	
	public TestClass(int x) {
		this(x, static_x);
	}
	
	public TestClass(int origin, int offset) {
		this.x = origin + offset;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	public static void printHello() {
		static_x = 100;
		System.out.println("hello from static printHello()");
	}
}
