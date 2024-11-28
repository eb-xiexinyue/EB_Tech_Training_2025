package co.jp.chapter08;

public class JavaHomework08 {

	public static void main(String[] args) {
		// 質問１
		String x = "a";
		String y = "a";
		System.out.println(x == y); // true  原因:アドレスは同じ
		System.out.println(x.equals(y)); // true   原因:内容は同じ

		String empty = "";
		String nullString = null;
		//System.out.println(nullString.equals(empty)); // nullはそもそもメソッドとして使えない

		//質問２
		//// Employee.java
//		public class Employee {
//			 private String id;
//			 public Employee(String id) {
//			 this.id = id;
//			 }
//			 @Override
//			 public boolean equals(Object another) {
//			 if (another instanceof Employee) {
//			 Employee an = (Employee) another;
//			 return an.id.equals(id);
//			 }
//			 return false;
//			 }
//			}
//			// Kicker.java
//			public class Kicker {
//			 public static void main(String...args) {
//			 Employee x = new Employee("1234");
//			 Employee y = new Employee("1234");
//			 System.out.println(x == y); //  false 原因：独立なアドレス  
//			 System.out.println(x.equals(y)); // true  原因：内容は同じ
//			 }
//			}
		
//		以下コンパイルを修正してください。
//		// Parent.java
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
//		print(new Child());
//		 }
//		}
		//原因：58行で定義しているように、printメソッドはそもそもChild型の変数しか受け入れない
		//62行で書いたParent型の関数を受け入れてしまっている。
		//改善方法：58行のpublic static void print(Child v) をpublic static void print(Parent v)に変更 
	}

}


