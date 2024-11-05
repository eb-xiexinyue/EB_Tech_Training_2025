package co.jp.chapter04;

public class JavaHomework04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//問題1 
		//	0,0,0,0 

		//問題2 
		//	5.6

		//問題3 
		//	0,0,0
		//	0,0,0

		//問題4
		int[][] array2d = new int[4][2];
		for (int[] out : array2d) {
			for (int inner : out) {
				System.out.println(inner);
			}
		}
		//すべての要素が 0 
		
		//問題5 
		int[] array = new int[] {1, 3, 5, 7, 100, 0, 1};
		int max = array[0];
		int min = array[0];
		for (int value : array) {
		    if (value > max) max = value;
		    if (value < min) min = value;
		}
		System.out.println("最大値: " + max);
		System.out.println("最小値: " + min);
		//最大値: 100
		//最小値: 0
		
		//問題6
		int sum = 0;
		for (int value : array) {
		    sum += value;
		}
		System.out.println("合計値: " + sum);
		//0
		
		//問題7
		int[][] matrix = {
	            {1, 2, 3},
	            {4, 5, 6}
	        };

	        int sum1 = 0;
	        int product = 1;

	        for (int[] row : matrix) {
	            for (int value : row) {
	                sum1 += value;
	                product *= value;
	            }
	        }

	        System.out.println("和: " + sum1);
	        System.out.println("积: " + product);
	}
	

}
