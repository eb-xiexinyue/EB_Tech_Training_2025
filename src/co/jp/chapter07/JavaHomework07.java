package co.jp.chapter07;

public class JavaHomework07 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		
//	質問1:
		// Pet.java
//		 public class Pet { 
//		    public String name; 
//		     
//		    public void setName(String value) { 
//		        this.name = value; 
//		    }
//		 }
		 // Kicker.java
//		 public class Kicker { 
//		    public static void main(String...args) { 
//		        Pet cat = new Pet(); 
//		        cat.setAge(1234); 
//		    }
//		 }
//		 クラス Pet には setAge というメソッドが定義されていません。
//		 Pet クラスには setName メソッドしか存在しないため、setAge を呼び出すとコンパイルエラーが発生します。
		
		 //質問2.行列計算。2D行列クラスのコンストラクタには１配列引数設定してください。
		public class Math {
		    // 配列のMAXを求める静的メソッド
		    public static int max(int[] input) {
		        int maxValue = input[0];
		        for (int value : input) {
		            if (value > maxValue) {
		                maxValue = value;
		            }
		        }
		        return maxValue;
		    }

		    // 配列のMINを求める静的メソッド
		    public static int min(int[] input) {
		        int minValue = input[0];
		        for (int value : input) {
		            if (value < minValue) {
		                minValue = value;
		            }
		        }
		        return minValue;
		    }

		    // 配列の平均値を求める静的メソッド
		    public static double average(int[] input) {
		        int sum = 0;
		        for (int value : input) {
		            sum += value;
		        }
		        return (double) sum / input.length;
		    }

		    // メインメソッド
		    public static void main(String[] args) {
		        int[] numbers = {10, 20, 30, 40, 50};
		        System.out.println("Max: " + max(numbers));
		        System.out.println("Min: " + min(numbers));
		        System.out.println("Average: " + average(numbers));
		    }
		}		
		
		（2）
		public class Matrix {
			    private final int[][] data;
			    public Matrix(int[][] data) {
			        this.data = data;
			    }

			    public Matrix add(Matrix b) {
			        int rows = this.data.length;
			        int cols = this.data[0].length;
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

			


	
