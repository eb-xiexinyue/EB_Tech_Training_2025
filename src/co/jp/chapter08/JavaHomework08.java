package co.jp.chapter08;

public class JavaHomework08 {
//質問１︓以下コードの出⼒するを回答してください。
//public class Child extends Parent {}
//String x = "a";
//String y = "a";
//System.out.println(x == y); // true、理由は、JavaのStringプール機構によって、xとyが同じStringインスタンスを参照しているためです。
//System.out.println(x.equals(y)); // true、原因はequalsメソッドはオブジェクトの内容（文字列）を比較するため、このコードは常にtrueを出力します
//String empty = "";
//String nullString = null;
//System.out.println(nullString.equals(empty)); // このコードは NullPointerException をスローします。

//	質問２︓以下コードの出⼒を回答してください。
//
//	public class Employee {
//		private String id;
//		public Employee(String id) {
//			this.id = id;
//		}
//		@Override
//		public boolean equals(Object another) {
//			if (another instanceof Employee) {
//				Employee an = (Employee) another;
//				return an.id.equals(id);
//			}
//			return false;
//		}
//	}
//	public class Kicker {
//		public static void main(String...args) {
//			Employee x = new Employee("1234");
//			Employee y = new Employee("1234");
//			System.out.println(x == y); //  false、 原因はxとyはnew Employee("1234")で生成された別々のオブジェクトを参照しています。==はオブジェクトの**参照（メモリアドレス）**を比較するため、異なるメモリアドレスを持つxとyはfalseとなります。
//			System.out.println(x.equals(y)); // true、原因は Employeeクラスでequalsメソッドがオーバーライドされており、idフィールドの内容を比較するように実装されています。xとyのidはどちらも"1234"で同じ値を持つため、equalsメソッドはtrueを返します。
//		}
//	}


	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}

}
