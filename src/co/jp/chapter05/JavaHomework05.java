package co.jp.chapter05;

public class JavaHomework05 {
  public static void main(String[] args) {
	        // 設問1: 1から100までの偶数の和を求める(for + if)
	        int sumEven = 0;
	        for (int i = 1; i <= 100; i++) {
	            if (i % 2 == 0) {
	                sumEven += i;
	            }
	        }
	        System.out.println("1から100までの偶数の和: " + sumEven);

	        // 設問2: 5の階乗を求める(for)
	        int factorial = 1;
	        for (int i = 1; i <= 5; i++) {
	            factorial *= i;
	        }
	        System.out.println("5の階乗: " + factorial);

	        // 設問3: 配列の最大値、最小値、和、平均値を求める
	        int[] arr = {1, 2, 6, 7, 9, 6, 2, 1};
	        int max = arr[0], min = arr[0], sum = 0;
	        for (int num : arr) {
	            if (num > max) max = num;
	            if (num < min) min = num;
	            sum += num;
	        }
	        double avg = (double) sum / arr.length;
	        System.out.println("最大値: " + max + ", 最小値: " + min + ", 和: " + sum + ", 平均値: " + avg);

	        // 設問4: 配列に重複ある要素を探す
	        System.out.print("重複要素: ");
	        for (int i = 0; i < arr.length; i++) {
	            for (int j = i + 1; j < arr.length; j++) {
	                if (arr[i] == arr[j]) {
	                    System.out.print(arr[i] + " ");
	                    break;
	                }
	            }
	        }
	        System.out.println();

	        // 設問5: 配列に値「7」のインデックスを求める
	        System.out.print("値7のインデックス: ");
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == 7) {
	                System.out.print(i + " ");
	            }
	        }
	        System.out.println();

	        // 設問6: 任意行列の積を求める
	        int[][] matrixA = {{1, 2}, {3, 4}};
	        int[][] matrixB = {{5, 6}, {7, 8}};
	        int[][] product = new int[2][2];
	        for (int i = 0; i < 2; i++) {
	            for (int j = 0; j < 2; j++) {
	                for (int k = 0; k < 2; k++) {
	                    product[i][j] += matrixA[i][k] * matrixB[k][j];
	                }
	            }
	        }
	        System.out.println("行列の積: ");
	        for (int[] row : product) {
	            for (int value : row) {
	                System.out.print(value + " ");
	            }
	            System.out.println();
	        }

	        // 設問7: 配列を昇順でソート（バブルソート使用）
	        for (int i = 0; i < arr.length - 1; i++) {
	            for (int j = 0; j < arr.length - 1 - i; j++) {
	                if (arr[j] > arr[j + 1]) {
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                }
	            }
	        }
	        System.out.print("昇順ソート後: ");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	        System.out.println();

	        // 設問8: LV10のパスカルの三角形を出力
	        int[][] pascal = new int[10][10];
	        for (int i = 0; i < 10; i++) {
	            for (int j = 0; j <= i; j++) {
	                if (j == 0 || j == i) {
	                    pascal[i][j] = 1;
	                } else {
	                    pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
	                }
	                System.out.print(pascal[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	}
