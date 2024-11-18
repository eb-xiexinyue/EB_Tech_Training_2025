package co.jp.chapter07;

public class JavaHomework07 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		
//		質問１︓以下コードのコンパイルエラー理由を教えてください。
//		答え：PetクラスにはsetAgeというメソッドが定義されていない。
//		
//		// Pet.java
//		public class Pet {
//			 public String name;
//			 
//			 public void setName(String value) {
//			 this.name = value;
//			 }
//			}
//			// Kicker.java
//			public class Kicker {
//			 public static void main(String...args) {
//			 Pet cat = new Pet();
//			 cat.setAge(1234);
//			 }
//			}
		//質問２：Mathクラスを作成してください。以下メソッドを定義します。
//		1. 配列のMAXを求める静的メソッドを定義。（引数は int 配列）
//		2. 配列のMINを求める静的メソッドを定義。（引数は int 配列）
//		3. 配列の平均値を求める静的メソッドを定義。（引数は int 配列）
//		4. mainメソッドで上記それぞれメソッドを呼び出してください。

        int[] b = {85, 11, 69, 50};

        System.out.println("最大値は: " + Math.max(b));
        System.out.println("最小値は: " + Math.min(b));
        System.out.println("平均値は: " + Math.average(b));
//        2.⾏列計算。2D⾏列クラスのコンストラクタには１配列引数設定してください。
//        public class Matrix {
//         private final int[][] data;
//         /** construct method */
//         public Matrix(int[][] data) {
//         this.data = data;
//         }
//         // 行列 ADD
//         public Matrix add(Matrix b) {
//         //....
//         return ???
//         }
//        }
	
	
	
	
	
	
	}
}
		

	
		
		
		
	
		
		
		

