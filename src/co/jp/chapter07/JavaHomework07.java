package co.jp.chapter07;

public class JavaHomework07 {
/*
 質問１このコードのコンパイルエラーの理由は、Pet クラスに setAge メソッドが定義されていないためです。
 質問２①// Math.java
public class Math {
    // 配列のMAXを求めるメソッド
    public static int max(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("配列が空です。");
        }
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // 配列のMINを求めるメソッド
    public static int min(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("配列が空です。");
        }
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // 配列の平均値を求めるメソッド
    public static double average(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("配列が空です。");
        }
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }

    // mainメソッド
    public static void main(String[] args) {
        int[] numbers = {5, 3, 9, 1, 6};

        // maxメソッドの呼び出し
        System.out.println("配列の最大値: " + Math.max(numbers));

        // minメソッドの呼び出し
        System.out.println("配列の最小値: " + Math.min(numbers));

        // averageメソッドの呼び出し
        System.out.println("配列の平均値: " + Math.average(numbers));
    }
}



②public class Matrix {
    private final int[][] data;

    
    public Matrix(int[][] data) {
        if (data == null || data.length == 0 || data[0].length == 0) {
            throw new IllegalArgumentException("行列が正しく初期化されていません。");
        }
        // ディープコピーでdataを保持
        this.data = new int[data.length][data[0].length];
        for (int i = 0; i < data.length; i++) {
            if (data[i].length != data[0].length) {
                throw new IllegalArgumentException("行列の各行の列数が一致していません。");
            }
            System.arraycopy(data[i], 0, this.data[i], 0, data[i].length);
        }
    }

    public Matrix add(Matrix b) {
        // 行列のサイズ確認
        if (this.data.length != b.data.length || this.data[0].length != b.data[0].length) {
            throw new IllegalArgumentException("行列のサイズが一致しません。");
        }

        // 結果を格納する新しい行列を作成
        int[][] result = new int[this.data.length][this.data[0].length];
        for (int i = 0; i < this.data.length; i++) {
            for (int j = 0; j < this.data[i].length; j++) {
                result[i][j] = this.data[i][j] + b.data[i][j];
            }
        }
        return new Matrix(result);
    }

    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int[] row : data) {
            sb.append("[ ");
            for (int value : row) {
                sb.append(value).append(" ");
            }
            sb.append("]\n");
        }
        return sb.toString();
    }

    
    public static void main(String[] args) {
        int[][] arrayA = {
            {1, 2, 3},
            {4, 5, 6}
        };
        int[][] arrayB = {
            {7, 8, 9},
            {10, 11, 12}
        };

        Matrix matrixA = new Matrix(arrayA);
        Matrix matrixB = new Matrix(arrayB);

        Matrix result = matrixA.add(matrixB);

        System.out.println("Matrix A:");
        System.out.println(matrixA);
        System.out.println("Matrix B:");
        System.out.println(matrixB);
        System.out.println("Result of A + B:");
        System.out.println(result);
    }
}

 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}

}
