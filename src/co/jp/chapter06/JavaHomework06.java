package co.jp.chapter06;

public class JavaHomework06 {

	public static void main(String[] args) {
		// 質問１．以下関数の修飾⼦、返却型、関数名、引数（引数の型・名称）を回答してください。
		//public static void main(String[] args);
		//修飾⼦:public static 返却型void、関数名main、引数（引数の型String[] ・名称args）
		//質問２．配列の和、MAX値、MIN値を求める処理を関数化してください、main関数に呼び出してください。
		int[] datas= {1,2,3,4,5,6,7};
		int total = total(datas);
		int max = max(datas);
		int min = min(datas);
		System.out.println(total);
		System.out.println(max);
		System.out.println(min);
		//質問３以下メソッドの実施結果を教えてください。:		null
//		public class Kicker {
//			 private static void sayHello(String y) {
//			 y = "Hello world";
//			 }
//			 public static void main(String args[]) {
//			 String x = null;
//			 sayHello(x);
//			 System.out.println(x);
//			 }
//			}

		//質問４︓以下メソッドの実施結果を教えてください。:value2
//		public class Kicker {
//			 private static void fillArray(String[] array) {
//			 array[0] = "value2";
//			 }
//			 public static void main(String args[]) {
//			 String[] array = new String[]{"value1"};
//			 fillArray(array);
//			 System.out.println(array[0]);
//			 }
//			}
		//質問５︓以下メソッドの実施結果を教えてください。
		
		
		
		
	}
	
	
 static int total(int[] datas) {
int total = 0;
	 for(int num:datas) {total += num; }
	return total;
 }
 
 static int max(int[] datas) {
     int max = 0;

	 for(int num:datas) {if ( num>max) {max= num;}}
	return max;
 }
 
 static int min(int[] datas) {
     int min = 0;

	 for(int num:datas) {if ( num<min) {min= num;}}
	return min;
 }
 
}
