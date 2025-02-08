package co.jp.chapter07;

public class JavaHomework07 {
	public static void main(String[] args) {
		// 質問1 以下コードのコンパイルエラー理由を教えてください。
		// public class Pet {
		// public String name;
		//
		// public void setName(String value) {
		// this.name = value;
		// 		}
		// }
		//
		//// Kicker.java
		//
		// public class Kicker {
		//     public static void main(String...args) {
		//         Pet cat = new Pet();
		//         cat.setAge(1234);
		//     }
		// }
		
		// PetというクラスのsetAgeメソッドがありません。
		

		int[] arr = {1,2,3,4};
		Math.max(arr);
		Math.min(arr);
		Math.average(arr);

		Matrix m = new Matrix(new int[] {1,2,3});
		m.add(m);

	}

}

class Math {
	// 質問2 Mathクラスを作成してください。以下メソッドを定義します。
	// 1. 配列のMAXを求める静的メソッドを定義。（引数は int 配列）
	// 2. 配列のMINを求める静的メソッドを定義。（引数は int 配列）
	// 3. 配列の平均値を求める静的メソッドを定義。（引数は int 配列）
	// 4. mainメソッドで上記それぞれメソッドを呼び出してください。

	public static int max(int[] input) {
		int result = Integer.MIN_VALUE;
		for (int i : input) {
			if (result < i) {
				result = i;
			}
		}
		return result;
	}
	
	public static int min(int[] input) {
		int result = Integer.MAX_VALUE;
		for (int i : input) {
			if (result > i) {
				result = i;
			}
		}
		return result;
	}
	
	public static int average(int[] input) {
		int result = 0;
		for (int i : input) {
			result += i;
		}
		return result / input.length;
	}
}

// 質問 2.2 2D行列クラスのコンストラクタには１配列引数設定してください。
class Matrix {
	private final int[][] data;
	public Matrix(int[] input) {
		data = new int[input.length][input.length];
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input.length; j++) {
				data[i][j] = input[j];
			}
		}
	}
	
	
	
	public Matrix add(Matrix b) {
		int[] result = new int[data.length * data[0].length];
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[0].length; j++) {
				result[i*j + j] = data[i][j]+ b.data[i][j];
			}
		}
		return new Matrix(result);
	}
	
}
