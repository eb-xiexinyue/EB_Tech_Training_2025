package co.jp.chapter07;

public class Matrix {
    //    2.⾏列計算。2D⾏列クラスのコンストラクタには１配列引数設定してください。
    private final int[][] data;

    /**
     * construct method
     */
    public Matrix(int[][] data) {
        this.data = data;
    }

    // 行列 ADD
    public Matrix add(Matrix b) {
        //行列 a と b の行数および列数が同じかどうかを確認します。もし異なる場合は、例外をスローするか、nullを返すべき。

        int row = b.data.length;
        int line = b.data[0].length;
        if (row == this.data.length && line == this.data[0].length) {
            int[][] x = new int[row][line];
            Matrix matrix = new Matrix(x);
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < line; j++) {
                    x[i][j] = this.data[i][j] + b.data[i][j];
                }
            }
            return matrix;
        } else {
            return null;
        }
    }

}
