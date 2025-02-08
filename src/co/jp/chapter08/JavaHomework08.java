package co.jp.chapter08;

public class JavaHomework08 {

	public static void main(String[] args) {
		// 質問１以下コードの出⼒するを回答してください。
		String x = "a";
		String y = "a";
		System.out.println(x == y); // true ? false? 原因は ? (true, xとyは同じStringインスタンスを参照している)
		System.out.println(x.equals(y)); // true ? false? 原因は ?  (true, オブジェクトの値は同じ)
		String empty = "";
		String nullString = null;
		System.out.println(nullString.equals(empty)); // true ? false? 原因は ? (error, Cannot invoke "String.equals(Object)" because "nullString" is null)
		
		// 質問２以下コードの出力するを回答してください。
		// Employee.java
		// public class Employee {
		// 	private String id;
		// 	public Employee(String id) {
		// 		this.id = id;
		// 	 }
		// @Override
		// public boolean equals(Object another) {
		// 	if (another instanceof Employee) {
		// 		Employee an = (Employee) another;
		// 		return an.id.equals(id);
		// 		}
		// return false;
		//	 }
		// }
		// Kicker.java
		// public class Kicker {
		// 	public static void main(String...args) {
		// 		Employee x = new Employee("1234");
		// 		Employee y = new Employee("1234");
		// 		System.out.println(x == y); // true ? false? 原因は ?　(false, インスタンス化後のメモリアドレス同じくらい)
		// 		System.out.println(x.equals(y)); // true ? false? 原因は ? (true, equalsがoverrideされており、xとyのidは同じ値を持つため)
		//	 }
		// }
		
		// 質問３︓以下コンパイルを修正してください。
		// Parent.java
		// public class Parent {
		//  public void hello() {
		//  System.out.println("parent method");
		//  }
		// }
		// Child.java
		// public class Child extends Parent {
		// @Override // 親クラスの強制的にOverrideする意味（アノテーション）
		//  public void hello() {
		//  System.out.println("child method");
		//  }
		// }
		// Kicker.java
		// public class Kicker {
		//  public static void print(Child v) {  (public static void print(Parent v))*
		//  v.hello();
		//  }
		//  public static void main(String...args) {
		//  print(new Parent());
		
	}

}
