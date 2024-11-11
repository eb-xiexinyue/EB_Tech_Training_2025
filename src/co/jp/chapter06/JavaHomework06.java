package co.jp.chapter06;

import java.util.Arrays;

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
		//質問５︓以下メソッドの実施結果を教えてください。:true
//		public class Kicker {
//			 private static void fillArray(String[] array) {
//			 array = new String[]{"1", "2"};
//			 }
//			 public static void main(String args[]) {
//			 String[] array = null;
//			 fillArray(array);
//			 System.out.println(array == null);
//			 }
//			}
		//質問６-０︓配列は直接に印刷できません。下記メソッドを利⽤して、配列をprintします。以下メソッドを呼び出してください。
		printArray(null);
		Object[] array= {1,2,3,4};
		printArray(array);
		//質問６-１︓以下静的なメソッドを定義してください。
//		1. メソッド名: megerArray
//		2. 引数１︓intの配列 left
//		3. 引数２︓intの配列 right
//		4. 戻り値︓intの配列
//		5. 処理内容︓引数left と 引数right をマージして、新しい配列を作成して返却する。

		int[] left = new int[] {1,2,3,4};
		int[] right= new int[] {5,6,7,8};
		megerArray(left, right);
		//質問６-２︓以下静的なメソッドを定義してください。
//		1. メソッド名: subArray
//		2. 引数１︓intの配列 array6
//		3. 引数２︓開始のstartIndex
//		4. 引数３︓⻑さlength
//		5. 戻り値︓intの配列
//		6. 処理内容︓startIndexからstartIndex + lengthまでサブ配列を取得する
		int[] array6 = new int[]{1,2,3,4};
		int length = 2;
		int startIndex = 1;
		int []result6= subArray(array6,startIndex,length);
		for (int i : result6) {
            System.out.println("6.2の出力："+i + " ");
        }
		
//		//質問７︓以下静的なメソッドを定義してください。
//		//1. メソッド名︓trim
//		2. 引数１︓charの配列
//		3. 戻り値︓charの配列
//		4. 処理内容︓引数１のcharの配列先頭と末尾の空⽩⽂字列を削除してください。
		char [] input7 =  new char[]{' ', ' ', 'A', 'b', ' ', ' ', 'C', ' '};
		char [] result7 = trim(input7);
		 System.out.println("7の出力："+String.valueOf(result7));
		 
		 //質問８︓バブルソート⽤メソッドを作成してください。
//		 1. メソッド名︓bubbleSort
//		 2. 引数１︓intの配列
//		 3. 戻り値︓ソート済みの配列
//		 4. 処理内容︓bubbleSortアルゴリズムを⽤い、⼊⼒した引数の配列をソートしてくださ
//		 い。
		 int[] input8 = {1,3,4,6,2,4,5};
		 int []result8 = bubble(input8);
		 System.out.println("8の出力："+Arrays.toString(result8));
		 
//		 質問９︓メソッドの呼び出す練習。
//		 1. 質問６-１を⽤い、２つ配列をマージします。
//		 2. 質問８を⽤い、ステップ１のマージした配列をソートする。
//		 3. 注意︓コードを１⾏にしてください。
		 int[] array91=new int[] {1,2,3,4,5};
		 int[] array92 = new int[] {6,7,8,9,10};
		 int[] mergearray9=megerArray1(array91, array92);
		 for (int i : mergearray9) {
	         System.out.print(i + " ");}
		 
		 System.out.println();
		 
		 int[]bubbleresult9 = bubble(mergearray9);
		 System.out.println("9の出力："+Arrays.toString(bubbleresult9));
		 

		 
		 
		
		
		

	}
	
	
	
	
	
	
	
	
//質問２用	
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
 
 
 //質問6.0用
 public static void printArray(Object[] objs) {
	 if(objs == null) {
	 System.out.println("null");
	 return;
	 }
	 String prefix = "";
	 StringBuilder sb = new StringBuilder();
	 sb.append("[");
	 for(Object obj : objs) {
	 sb.append(prefix);
	 sb.append(String.valueOf(obj));
	 prefix = ", ";
	 }
	 sb.append("]");
	 System.out.println(sb.toString());
	}
 //質問6.1用
 static void megerArray(int[] left,int[] right) {
	 int[] mergeresult= new int[left.length+right.length];
	 System.arraycopy(left, 0, mergeresult, 0, left.length);
	 System.arraycopy(right, 0, mergeresult,left.length,right.length);
	 for (int i : mergeresult) {
         System.out.print(i + " ");}
	 return;
 }
 
 //質問6.2用
 static int[] subArray(int[]array6,int startIndex,int length){
	 int[] subArray =new int[length];
	 System.arraycopy(array6, startIndex, subArray, 0, length);
	 return subArray;
 }
 
 //質問7用
 static char[] trim(char[] array7) {
	 int start=0;
     while (start < array7.length && array7[start] == ' ') {start++; }
     int end = array7.length - 1;
     while (end >= 0 && array7[end] == ' ') { end--;}
     if (start > end) { return new char[0];}
     char[] output = new char[end-start+1];
     System.arraycopy(array7, start, output, 0, output.length);

     return output;
     
 }
 
 //質問8用
 static int[] bubble(int[] array8) {
	 int n =array8.length;
	 for (int i = 0; i < n - 1; i++) {
         for (int j = 0; j < n - 1 - i; j++) {
             if (array8[j] > array8[j + 1]) {
                 // 要素を交換
                 int temp = array8[j];
                 array8[j] = array8[j + 1];
                 array8[j + 1] = temp;
             }
         }
     }
     return array8;  
	 
 }
 //質問９用
 static int[] megerArray1(int[] array91,int[] array92) {
	 int[] mergeresult= new int[array91.length+array92.length];
	 System.arraycopy(array91, 0, mergeresult, 0, array91.length);
	 System.arraycopy(array92, 0, mergeresult,array91.length,array92.length);

	 return mergeresult;
 }
 
 
 
}
