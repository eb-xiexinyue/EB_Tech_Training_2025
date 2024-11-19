package co.jp.chapter07;

public class JavaHomework07 {
	// TODO 自動生成されたメソッド・スタブ
	//質問1 以下コードのコンパイルエラー理由を教えてください。
	//答え：PetクラスにはsetAgeというメソッドが定義されていない。
	// 修正版: Pet.java
	//		public class Pet {
	//		    public String name;
	//		    public int age; // 新しいフィールド
	//
	//		    public void setName(String value) {
	//		        this.name = value;
	//		    }
	//
	//		    public void setAge(int value) { // 新しいメソッド
	//		        this.age = value;
	//		    }
	//		}
	//
	//		// 修正版: Kicker.java
	//		public class Kicker {
	//		    public static void main(String... args) {
	//		        Pet cat = new Pet();
	//		        cat.setAge(1234); // エラーは発生しません
	//		        cat.setName("Kitty"); // 動作例
	//		        System.out.println("Name: " + cat.name + ", Age: " + cat.age);
	//		    }
	//		}
	//質問2
	public static int max(int[] input) {
		int max = input[0];
		for (int num : input) {
			max = Math.max(max, num);
		}
		return max;
	}

	public static int min(int[] input) {
		int min = input[0];
		for (int num : input) {
			min = Math.min(min, num);
		}
		return min;
	}

	public static double average(int[] input) {
		int sum = 0;
		for (int num : input) {
			sum += num;
		}
		return (double) sum / input.length;
	}

	public static void main1(String[] args) {
		int[] nums = { 3, 1, 4, 1, 5, 9 };
		System.out.println("Max: " + max(nums));
		System.out.println("Min: " + min(nums));
		System.out.println("Avg: " + average(nums));
	}

	//⾏列計算。2D⾏列クラスのコンストラクタには１配列引数設定してください。
	public class Matrix {
	    private final int[][] data;
	    public Matrix(int[][] data) {
	        this.data = data;
	    }
	    public Matrix add(Matrix b) {
	        int rows = data.length;
	        int cols = data[0].length;
	        int[][] result = new int[rows][cols];

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                result[i][j] = this.data[i][j] + b.data[i][j];
	            }
	        }
	        return new Matrix(result);
	    }
	    public void print() {
	        for (int[] row : data) {
	            for (int value : row) {
	                System.out.print(value + " ");
	            }
	            System.out.println();
	        }
	    }
	}

	}