package co.jp.chapter08;

public class JavaHomework08 {

	public static void main(String[] args) {


//		質問１︓以下コードの出⼒するを回答してください。
	
//		 x = "a";
//		 String y = "a";
//		 System.out.println(x == y); // true  理由：xとyは同じobjectを指している。
//		 System.out.println(x.equals(y)); // true　理由：文字列の内容を比較するため、xとｙは"a"という同じ値を持つのでtrueになる。
		
//		String empty = "";
//		String nullString = null;
//		System.out.println(nullString.equals(empty)); // 結果はNullPointerExceptionになる。

	
//		質問２︓以下コードの出⼒を回答してください。
	
		
		// Employee.java
//		public class Employee {
//		 private String id;
//		 public Employee(String id) {
//		 this.id = id;
//		 }
//		 @Override
//		 public boolean equals(Object another) {
//		 if (another instanceof Employee) {
//		 Employee an = (Employee) another;
//		 return an.id.equals(id);
//		 }
//		 return false;
//		 }
//		}
//		// Kicker.java
//		public class Kicker {
//		 public static void main(String...args) {
//		 Employee x = new Employee("1234");
//		 Employee y = new Employee("1234");
//		 System.out.println(x == y);
//		false　xとyはそれぞれ異なるオブジェクトであり、異なるメモリ位置を指している。＝＝はメモリアドレスを比較しますので、　異なるメモリアドレスを持つxとyはfalseです。　
//		 System.out.println(x.equals(y)); // true equalsメソッドがオーバーライドされており、idのvalueを比較しているためです。
		
		
//		質問３︓以下コンパイルを修正してください。
		
		// Parent.java
//		public class Parent {
//		 public void hello() {
//		 System.out.println("parent method");
//		 }
//		}
//		// Child.java
//		public class Child extends Parent {
//		 @Override // 親クラスの強制的にOverrideする意味（アノテーション）
//		 public void hello() {
//		 System.out.println("child method");
//		 }
//		}
//		// Kicker.java
//		public class Kicker {
//		 public static void print(Child v) {
//		 v.hello();
//		 }
//		 public static void main(String...args) {
//		 print(new Parent());
////		
//		 print(new Child());
//		 }
//		}
//		
	
	
	
	
	}
	}
