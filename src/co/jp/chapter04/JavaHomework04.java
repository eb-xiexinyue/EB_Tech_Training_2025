package co.jp.chapter04;

public class JavaHomework04 {

	public static void main(String[] args) {
//		問題１︓int[] array = new int[4]; 各要素の値を記載してください。
//		{0,0,0,0}
		
//		問題２︓int[] array = new int[] {5, 6}; 各要素の値を記載してください。
//		{5,6}
		
//		問題３︓int[][] array = new int[2][3]; 各要素の値を記載してください。
//		{{0,0,0},{0.0.0}}
		
//		問題４︓以下２重Foreachを理解してください。
		int[][] array2d = new int[4][2];//4*2の配列を宣言
		for (int[] out : array2d) {//配列の１次元をループ（4回)
			for (int inner : out) {//配列の2次元をループ（2回）
				System.out.println(inner);//値をプリントする
			}
		}
		
//		問題５︓int[] array = new int[] {1, 3, 5, 7, 100, 0, 1}; 左の配列の最⼤値と最⼩桁値を
//		System.out.println()。
		int[] array = new int[] {1, 3, 5, 7, 100, 0, 1};
		int max=array[0];
		int min=array[0];
		for(int i=0;i<array.length;i++) {
			if(array[i]>max) {
				max = array[i];
			}
			if(array[i]<min) {
				min = array[i];
			}
		}
		System.out.println("max is "+max);
		System.out.println("min is "+min);
		
//		問題６︓問題１の配列のSUMを求める。
		int[] arrayq1 = new int[4];
		int sum=0;
		for(int i=0;i<arrayq1.length;i++) {
			sum+=arrayq1[i];
		}
		System.out.println("sum is "+sum);
		
//		問題７︓⾏列（２次元配列）の和と積を計算してください。
		int he=0;
		int ji=1;
		for(int i=0;i<array2d.length;i++) {
			for(int j=0;j<array2d[i].length;j++) {
				he+=array2d[i][j];
				ji*=array2d[i][j];
			}
		}
		System.out.println("he is "+he);
		System.out.println("ji is "+ji);

	}

}
