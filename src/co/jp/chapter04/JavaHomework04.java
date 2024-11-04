package co.jp.chapter04;

public class JavaHomework04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		
	//問題１:int[] array = new int[4]; 各要素の値を記載してください。
		
	//	0,0,0,0 
	
	//問題２:int[] array = new int[] {5, 6}; 各要素の値を記載してください。
		
	//	5.6
		
	//問題３:int[][] array = new int[2][3]; 各要素の値を記載してください。
		
	//	0,0,0
	//	0,0,0
		
	//問題4：
//		int[][] array2d = new int[4][2];
//		for (int[] out : array2d) {
//		    for (int inner : out) {
//		        System.out.println(inner);
//		    }
//		}
//		4行2列の配列、全ての要素が0
		
		
	//	問題5: int[] array = new int[] {1, 3, 5, 7, 100, 0, 1}; の最大値と最小値を求める。	
//		int[] array = {1, 3, 5, 7, 100, 0, 1};
//		int max = array[0];
//		int min = array[0];
//
//		for (int num : array) {
//		    if (num > max) max = num;
//		    if (num < min) min = num;
//		}
//
//		System.out.println("最大值: " + max);
//		System.out.println("最小值: " + min);
//
//		最大值: 100
//		最小值: 0
		
		//問題6: 問題1の配列 array のSUM（合計値）を求める
//		int[] array = new int[4];
//		int sum = 0;
//		for (int num : array) {sum += num;}
//		
//		System.out.println(sum);
//		0

		//問題7: 行列（2次元配列）の和と積を計算してください。
		
		int[][] array = {
			    {1, 2, 3},
			    {4, 5, 6}
			};

			int sum = 0;
			int product = 1;
			
           //方法①

//			for (int i = 0; i < array.length; i++) { 
//			for (int j = 0; j < array[i].length; j++) { 
//			
//			sum += array[i][j]; 
//			product *= array[i][j];
//			    }
//			}
//
//			System.out.println(sum);
//			System.out.println(product);

			//方法②
			
			for (int[] out : array) {
			    for (int inner : out) {
			        sum += inner;      
			        product *= inner;  
			      
			    }
			}
		
			System.out.println(sum);
			System.out.println(product);
		
	}

}
