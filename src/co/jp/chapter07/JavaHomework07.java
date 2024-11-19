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
		 
		 public class Matrix {
			    private final int[][] data;

			    // コンストラクタ: 1つの配列引数を受け取る
			    public Matrix(int[][] data) {
			        this.data = data;
			    }

			    // 行列の加算メソッド
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

			    // 行列を出力するメソッド（デバッグ用）
			    public void print() {
			        for (int[] row : data) {
			            for (int value : row) {
			                System.out.print(value + " ");
			            }
			            System.out.println();
			        }
			    }

			    // メインメソッド
			    public static void main(String[] args) {
			        int[][] dataA = {{1, 2}, {3, 4}};
			        int[][] dataB = {{5, 6}, {7, 8}};
			        
			        Matrix matrixA = new Matrix(dataA);
			        Matrix matrixB = new Matrix(dataB);

			        Matrix result = matrixA.add(matrixB);
			        result.print(); // 結果を表示
			    }
			}


	}

}
