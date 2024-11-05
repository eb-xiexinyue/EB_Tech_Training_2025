package co.jp.chapter04;

import java.util.Arrays;

public class JavaHomework04 {
	
 public static void main(String[] args) {
	 
//	 問題１︓int[] array = new int[4]; 各要素の値を記載してください.
	//	 int[] array = new int[4]; 要素は初期化時に0が入っています。
	 // System.out.println(Arrays.toString(array)); 出力: [0,0,0,0]
 

//	 問題２︓int[] array = new int[] {5, 6}; 各要素の値を記載してください。
	 // int[] array = new int[] {5, 6};	 要素は初期化時に5,6が入っています。
	 // System.out.println(Arrays.toString(array)); 出力: [5,6]
	 
	 
	 
//	 問題３︓int[][] array = new int[2][3]; 各要素の値を記載してください。
//	 int[][] array= new int[2][3]; 2行3列の配列を初期化
//	 for (int[] outs : array) { 各行を順番に取得します 
//	 for(int ins :outs) {各行要素を順番に取得します 
//		System.out.println(ins+"");  出力[0,0,0][0,0,0]
//	  }
//	 System.out.println("\n"); // 行の終わりで改行
//	 }

//	 問題４︓以下２重Foreachを理解してください。
//	 int[][] array2d = new int[4][2]; 4行２列の配列を初期化
//	 for (int[] out : array2d) {//	 各行を順番に取得します
//	  for (int inner : out) {//	各行要素を順番に取得します 
//	  System.out.println(inner); // 出力
//	  }
//	 }
	 

//	 問題５︓int[] array = new int[] {1, 3, 5, 7, 100, 0, 1}; 左の配列の最⼤値と最⼩桁値を System.out.println()。
	 int[] array = new int[] {1, 3, 5, 7, 100, 0, 1};
	 System.out.println(Arrays.toString(array));
//	方法１：
	 int max =array[0];
	 int minimum=array[0];
	 for(int num :array) {
	 if(num >max) {
		  max=num;
}
	 if(num<minimum ) {
		 minimum=num;
 }
	 }
	 System.out.println("最大値"+max);
	 System.out.println("最小値"+minimum);
//	 	方法２：
	 int max1=array[4];
	 int minimum1=array[5];
	 System.out.println("最大値"+max1);
	 System.out.println("最小値"+minimum1);

//	 問題６︓問題１の配列のSUMを求める。
	 int[] arr = new int[4];
	 int sum=0;
	 for(int num :arr) {
		 sum+=num;
	 }	 
	 System.out.println( sum );
		 

	 
//	 問題７︓⾏列（２次元配列）の和と積を計算してください。
//	方法1：
	 int[][] ar= {{1,2,3},{4,5,6}};
	 int sum1=0;
	 int mul=1;
	 for(int[] outs :ar) { 
		 for(int inner :outs) { 
			 sum1+=inner; 
			 mul*=inner; 
		 }
	 } System.out.println( "２次元配列の和"+sum1 );
	 System.out.println("２次元配列の積"+mul );
	 
//	 方法２：
	 int[][] ar1= {{1,2,3},{4,5,6}};
	 int sum2=0;
	 int mul1=1;
	 for(int i=0;i<ar1.length;i++){
	 for(int j=0;j<ar1[i].length;j++){
		 sum2+=ar1[i][j]; 
		 mul1*=ar1[i][j]; 
	 }
 } System.out.println( "２次元配列の和"+sum2 );
 System.out.println("２次元配列の積"+mul1 );
 
	 
	 
	 
 }
 }