package co.jp.chapter07;

public class JavaHomework07 {
	private int name;

	public static void main(String[] args) {
		//質問1: PetというクラスのsetAgeメソッドがありません。
		//質問2:　
		int[] arr = {1,2,3,4};
		Math.max(arr);
		Math.min(arr);
		Math.average(arr);
		//問題２:回答は以下にあります。
		Matrix m = new Matrix(new int[] {1,2,3});
		m.add(m);

	}

}

class Math {
	
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



//2D⾏列クラスのコンストラクタには１配列引数設定してください。
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
				System.out.println(result[i*j + j]);
			}
		}
		return new Matrix(result);
	}
	
	
}
