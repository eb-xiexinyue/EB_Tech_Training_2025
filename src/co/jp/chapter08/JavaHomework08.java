package co.jp.chapter08;

public class JavaHomework08 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//質問1
		//		System.out.println(x == y);
		//		結果: true
		//		原因:
		//		JavaのStringは文字列リテラルとして作成された場合、文字列プールに保存されます。xとyは同じ文字列リテラル"a"を指しているため、同一のオブジェクトを参照しており、==で比較するとtrueとなります。
		//
		//		System.out.println(x.equals(y));
		//		結果: true
		//		原因:
		//		equalsメソッドはStringの内容を比較します。xとyの内容は同じ"a"であるため、equalsの結果もtrueです。
		//
		//		System.out.println(nullString.equals(empty));
		//		結果: false（実行時例外発生）
		//		原因:
		//		nullStringがnullであるため、nullString.equals(empty)を呼び出そうとするとNullPointerExceptionが発生します。
		
		//質問2
//		// Employee.java
//		public class Employee {
//		    private String id;
//
//		    public Employee(String id) {
//		        this.id = id;
//		    }
//
//		    @Override
//		    public boolean equals(Object another) {
//		        if (another instanceof Employee) {
//		            Employee an = (Employee) another;
//		            return an.id.equals(id);
//		        }
//		        return false;
//		    }
//		}
//		
//		// Kicker.java
//		public class Kicker {
//		    public static void main(String... args) {
//		        Employee x = new Employee("1234");
//		        Employee y = new Employee("1234");
//		        System.out.println(x == y);         // true ? false ? 原因は？
//		        
//		        
//				false
//				new Employee("1234") によってそれぞれ異なるインスタンス（メモリ参照）が作成されているため、x と y は異なるメモリアドレスを持ちます。そのため、x == y は false となります。
//
//		        
//		        
//		        System.out.println(x.equals(y));   // true ? false ? 原因は？
//				
//				true
//				x と y の id はどちらも "1234" であり、String の equals メソッドは値の比較を行うため、結果は true となります。
		//質問３
		// Parent.java
		public class Parent {
		    public void hello() {
		        System.out.println("parent method");
		    }
		}

		// Child.java
		public class Child extends Parent {
		    @Override
		    public void hello() {
		        System.out.println("child method");
		    }
		}

		// Kicker.java
		public class Kicker {
		    // 引数のタイプを Parent に変更
		    public static void print(Parent v) {
		        v.hello();
		    }

		    public static void main(String... args) {
		        print(new Parent()); 
		        print(new Child()); 
		    }
		}
	}

}
