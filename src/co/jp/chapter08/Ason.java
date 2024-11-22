package co.jp.chapter08;

public class Ason {
	int age;
	public static void main(String[] args) {
		Ason a = new Ason(10);
		System.out.println("a of main method:"+a);
	}

	public Ason(int age) {
		this.age=age;
	}

	
    @Override
	public String toString() {
		return"class:ason.age"+this.age;
	}




}