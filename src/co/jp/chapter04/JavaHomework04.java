package co.jp.chapter04;

public class JavaHomework04 {

	public static void main(String[] args) {
		// 問題１int[] array = new int[4]; 各要素の値を記載してください。
		//{0，0，0，0}
		//問題２︓int[] array = new int[] {5, 6}; 各要素の値を記載してください。
		//{5，6}
		//問題３︓int[][] array = new int[2][3]; 各要素の値を記載してください。
		//{{0,0,0},{0,0,0}}
		//問題４︓以下２重Foreachを理解してください。
		int[] [] array2d = new int[4][2];
		for(int[]out:array2d) {
			for(int inner:out) {
				System.out.println(inner);
			}
		}
		
		//解釈：４行２列の構造で、各要素が０。外側と内側両方ループし合計８つの０が出力される。
		//問題５︓int[] array = new int[] {1, 3, 5, 7, 100, 0, 1}; 左の配列の最⼤値と最⼩桁値をSystem.out.println()。
		int[] array5 = new int[] {1, 3, 5, 7, 100, 0, 1};
		//方法1
		System.out.println(array5[4]);
		System.out.println(array5[5]);
		//方法２
		int max=0;
		int min = 0;
		for(int num:array5) {
			if (num>max) {max = num;}
			if (num<min) {min = num;}
		}

        System.out.println("最大値: " + max);
        System.out.println("最小値: " + min);
        //問題６︓問題１の配列のSUMを求める。
        int[] array1 = new int[4];
        int sum = 0;
        for(int num:array1) {
        	sum += num;
        }
        System.out.println(sum);
        
        //問題７︓⾏列（２次元配列）の和と積を計算してください。
        int[][] array2d7 = new int[][] {{1,2},{3,4}};
        int sum7 = 0;
        int prod7 = 1;
        for(int[] out:array2d7) {
        	for(int inner:out) {
        		sum7+= inner;
        		prod7*=inner;
        	} 
        }
        System.out.println(sum7);
        System.out.println(prod7);
		
		
		
		
	}

}
