package co.jp.chapter04;

public class JavaHomework04 {
	/*1,array[0] = 0;
	    array[1] = 0;
	    array[2] = 0;
	    array[3] = 0;
	*/
	/*2,array[0] = 5;
        array[1] = 6;
     */

	/*3,array[0][0] = 0;
        array[0][1] = 0;
        array[0][2] = 0;

        array[1][0] = 0;
        array[1][1] = 0;
        array[1][2] = 0;
        */
	/*4,外側の for-each ループ (for (int[] out : array2d)):
このループでは、array2d の各行（つまり、int[] 型の配列）を順番に取り出します。
out は array2d の各行を指す配列（1次元配列）です。
内側の for-each ループ (for (int inner : out)):

各行（out）の中で、個々の要素（整数値）を順に取得し、出力します。
inner は各行の要素を表す int 型の変数です。
	 */
	/*5,int[] array = new int[] {1, 3, 5, 7, 100, 0, 1};

int max = array[0];  // 最大値を初期化
int min = array[0];  // 最小値を初期化

for (int i = 1; i < array.length; i++) {
    if (array[i] > max) {
        max = array[i];  // 最大値を更新
    }
    if (array[i] < min) {
        min = array[i];  // 最小値を更新
    }
}

System.out.println("最大値: " + max);
System.out.println("最小値: " + min);
	 */
	/*6,int[] array = new int[4];
int sum = 0;

for (int value : array) {
    sum += value;
}

System.out.println("合計: " + sum);
	 */
	/*7,public class MatrixOperations {
    public static void main(String[] args) {
        int[][] matrixA = {
            {1, 2},
            {3, 4}
        };

        int[][] matrixB = {
            {5, 6},
            {7, 8}
        };

        // 行列の和を計算
        int[][] sum = calculateSum(matrixA, matrixB);
        System.out.println("行列の和:");
        printMatrix(sum);

        // 行列の積を計算
        int[][] product = calculateProduct(matrixA, matrixB);
        System.out.println("行列の積:");
        printMatrix(product);
    }

    public static int[][] calculateSum(int[][] matrixA, int[][] matrixB) {
        int rows = matrixA.length;
        int cols = matrixA[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        return result;
    }

    public static int[][] calculateProduct(int[][] matrixA, int[][] matrixB) {
        int rowsA = matrixA.length;
        int colsA = matrixA[0].length;
        int colsB = matrixB[0].length;
        int[][] result = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                result[i][j] = 0;
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
	  */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				if(i==4 || j==4 || i==j || i+j==8) {
					System.out.print(i+""+j+"\t");
				}
				else {
					System.out.print("\t");
				}

			}
			System.out.print("\n");
		}
}
}
