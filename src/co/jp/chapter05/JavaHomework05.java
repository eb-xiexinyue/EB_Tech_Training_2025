package co.jp.chapter05;

public class JavaHomework05 {
	public static void main(String[] args) {
		// 設問１: 1から100までの偶数の和を求める (for + if)
		int sumEven = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				sumEven += i;
				}
			}
		System.out.println("設問１: 1から100までの偶数の和は " + sumEven);
		
		// 設問２: 5の階乗を求める (for)
		int factorial = 1;
		for (int i = 1; i <= 5; i++) {
			factorial *= i;
		}
		System.out.println("設問２: 5の階乗は " + factorial);
		
		// 設問３: 配列 {1, 2, 6, 7, 9, 6, 2, 1} の最大値、最小値、和、平均値を求める
		int[] arr = {1, 2, 6, 7, 9, 6, 2, 1};
		int max = arr[0];
		int min = arr[0];
		int sum = 0;
		for (int num : arr) {
			if (num > max) {
				max = num;
			}
			if (num < min) {
				min = num;
			}
			sum += num;
		}
		double avg = (double) sum / arr.length;
		System.out.println("設問３: 配列の最大値は " + max);
		System.out.println("設問３: 配列の最小値は " + min);
		System.out.println("設問３: 配列の和は " + sum);
		System.out.println("設問３: 配列の平均値は " + avg);
		
		// 設問４: 配列に重複する要素を探す（各重複要素は1回だけ表示）
		System.out.print("設問４: 重複している要素は ");
		for (int i = 0; i < arr.length; i++) {
			boolean alreadyChecked = false;
			for (int k = 0; k < i; k++) {
				if (arr[i] == arr[k]) {
					alreadyChecked = true;
					break;
				}
			}
			if (alreadyChecked) {
				continue;
			}

			boolean isDuplicate = false;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					isDuplicate = true;
					break;
				}
			}
			if (isDuplicate) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
		
		// 設問５: 配列内の値「7」のインデックスを求める
		System.out.print("設問５: 値7が存在するインデックスは ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 7) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		// 設問６: 任意の２次元配列同士の行列乗法を求める
        int[][] A = {
            {1, 2, 3},
            {4, 5, 6}
        };
        int[][] B = {
            {7, 8},
            {9, 10},
            {11, 12}
        };

        int m = A.length;
        int n = A[0].length;
        int p = B[0].length;
        
        int[][] C = new int[m][p];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                for (int k = 0; k < n; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        System.out.println("設問６: 行列乗法の結果は");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                System.out.print(C[i][j] + "\t");
            }
            System.out.println();
        }
		
		// 設問７: 配列を昇順でソートする (java.utilのメソッド禁止)
		int[] sortArr = {5, 2, 8, 3, 9, 1, 4};
		for (int i = 0; i < sortArr.length - 1; i++) {
			for (int j = 0; j < sortArr.length - 1 - i; j++) {
				if (sortArr[j] > sortArr[j + 1]) {
					int temp = sortArr[j];
					sortArr[j] = sortArr[j + 1];
					sortArr[j + 1] = temp;
				}
			}
		}
		System.out.print("設問７: 昇順にソートされた配列は ");
		for (int num : sortArr) {
			System.out.print(num + " ");
		}
		System.out.println();
		
		// 設問８: LV10のパスカルの三角形を出力する
		System.out.println("設問８: パスカルの三角形 (LV10)");
		int levels = 10;
		for (int i = 0; i < levels; i++) {
			for (int s = 0; s < levels - i; s++) {
				System.out.print(" ");
			}
			int number = 1;
			for (int j = 0; j <= i; j++) {
				System.out.print(number + " ");
				number = number * (i - j) / (j + 1);
			}
			System.out.println();
		}
	}

}
