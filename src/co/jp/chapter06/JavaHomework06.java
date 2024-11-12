package co.jp.chapter06;

import java.util.Arrays;

public class JavaHomework06 {

	 public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		質問１．以下関数の修飾⼦、返却型、関数名、引数（引数の型・名称）を回答してください。
//		1 public static void main(String[] args);	
//	    修飾⼦:public
//		返却型:void
//		関数名:main
//		引数（引数の型・名称):引数の型String[] ,名称args 
		
		
//		質問２．配列の和、MAX値、MIN値を求める処理を関数化してください、main関数に呼
//		び出してください。

		  int[] datas = {0, 2, 4, 6, 8};

	        // 最大値
	        int max1 = max(datas);
	        System.out.println("Max valueは： " + max1);

	        // 最小値
	        int min1 = min(datas);
	        System.out.println("Min valueは: " + min1);

	        // 配列の和
	        int sum1 = sum(datas);
	        System.out.println("Sumは: " + sum1);
	    


	
//		質問３．以下メソッドの実施結果を教えてください。           :ｘの出力結果はnullです。
		
//		public class Kicker {
//		 private static void sayHello(String y) {
//		 y = "Hello world";
//		 }
//		 public static void main(String args[]) {
//		 String x = null;
//		 sayHello(x);
////	
//		 System.out.println(x);
//		 }
//		}

		
//		質問４︓以下メソッドの実施結果を教えてください。         : 出力結果はvalue2です。
	
//		public class Kicker {
//		 private static void fillArray(String[] array) {
//		 array[0] = "value2";
//		 }
//		 public static void main(String args[]) {
//		 String[] array = new String[]{"value1"};
//		 fillArray(array);
//		 System.out.println(array[0]);
//		 }
//		}

		
//		質問５︓以下メソッドの実施結果を教えてください。       : 出力結果はtrueです。
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

		
//		質問６-０︓配列は直接に印刷できません。下記メソッドを利⽤して、配列をprintしま
//		す。以下メソッドを呼び出してください。	
		    Object[] array= {1,2,3,4};
			   printArray(array); 
			   printArray(null); 

				   
//		質問６-１︓以下静的なメソッドを定義してください。
//		1. メソッド名: megerArray
//		2. 引数１︓intの配列 left
//		3. 引数２︓intの配列 right
//		4. 戻り値︓intの配列
//		5. 処理内容︓引数left と 引数right をマージして、新しい配列を作成して返却する。
//		以下メソッドの実施例︓
		
		int[] left = new int[] {1, 2, 3, 4};
		int[] right = new int[] {5, 6, 7, 8};
	    int [] mergedArray =mergeArray(left,right) ;
	    System.out.println(Arrays.toString(mergedArray));

		
//		質問６-２︓以下静的なメソッドを定義してください。
//		1. メソッド名: subArray
//		2. 引数１︓intの配列 array
//		3. 引数２︓開始のstartIndex
//		4. 引数３︓⻑さlength
//		5. 戻り値︓intの配列
//		6. 処理内容︓startIndexからstartIndex + lengthまでサブ配列を取得する
//		以下メソッドの実施例︓
		
		int[] array1 = new int[] {4, 7, 9, 8};
		int[] result = subArray(array1, 1, 2); // start = 1, length = 2
		 System.out.println(Arrays.toString(result));
		
		
		
//		質問７︓以下静的なメソッドを定義してください。
//		1. メソッド名︓trim
//		2. 引数１︓charの配列
//		3. 戻り値︓charの配列
//		4. 処理内容︓引数１のcharの配列先頭と末尾の空⽩⽂字列を削除してください。
//		以下メソッドの実施例︓

	    char[] input = new char[] {' ', ' ', 'A', 'b', ' ', ' ', 'C', ' '};  // 入力引数
//		// メソッドを実施後
      	char[] output = trim(input);
      	System.out.println(Arrays.toString(output));
		
//		ヒント︓
//		1. 配列の起点から、 ' ' ではない⽂字列のインデックスを探す。
//		2. 配列の終点から、 ' ' ではない⽂字列のインデックスを探す。
//		3. 起点と終点を引数として、質問６-２で作成したサブ配列メソッドを呼び出して、結果
//		を求める。
	
	
//		質問８︓バブルソート⽤メソッドを作成してください。
//		1. メソッド名︓bubbleSort
//		2. 引数１︓intの配列
//		3. 戻り値︓ソート済みの配列
//		4. 処理内容︓bubbleSortアルゴリズムを⽤い、⼊⼒した引数の配列をソートしてくださ
//		い。
      	 int[] input1 = {9,8,5,4,1,2,7};
		 int[]result2 = bubbleSort(input1);
		 System.out.println(Arrays.toString(result2));
      	
      	
      	
      	
//		質問９︓メソッドの呼び出す練習。

			int[] left4 = new int[] {10, 9, 0, 5};
			int[] right4 = new int[] {5, 6, 7, 8};
		    int [] mergedArray1 =mergeArray(left4,right4) ;
		    System.out.println(Arrays.toString(mergedArray1)); 
		    int[]result3 = bubbleSort(mergedArray1);
		    System.out.println(Arrays.toString(result3));

			

}
     //質問2　　　　
//	 　　　　　　　最大値　
	 
     			   public static int max(int[] datas) {
     			        int max1 = datas[0];
     			        for (int i = 1; i < datas.length; i++) {
     			            if (datas[i] > max1) {
     			                max1= datas[i];
     			            }
     			        }
     			        return max1;
     			    }

     			    // 最小値を求めるメソッド
     			    public static int min(int[] datas) {
     			        int min1 = datas[0];
     			        for (int i = 1; i < datas.length; i++) {
     			            if (datas[i] < min1) {
     			                min1 = datas[i];
     			            }
     			        }
     			        return min1;
     			    }

     			    // 配列の和を求めるメソッド
     			    public static int sum(int[] datas) {
     			        int sum1 = 0;
     			        for (int data : datas) {
     			            sum1+= data;
     			        }
     			        return sum1;
     			    }		   


//			    6-0:
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
		    
//	６−１	
				   public static int []  mergeArray(int [] left,int [] right) {	 
				   int [] result=new int[left.length+right.length];
				   for(int i=0;i<left.length;i++) {
				     result[i]=left[i];
				   }
				   for(int j=0;j<right.length;j++) {
					     result[j+left.length]=right[j];
				   }
			return result; 
				   }  

//	6-2			   		   
					 public static int []  subArray(int [] array,int  startIndex,int  length){	 
				     int [] result=new int [length] ;
				      for (int i = 0; i < length; i++) {
				            result[i] = array[startIndex + i];
				        }
				        return result;
				    }

//	質問7：
					   
					    	public static char[] trim(char[] array) {
					    	    int i = 0;
					    	    int j = array.length - 1;

					    	    for (; i <= j && array[i] == ' '; i++);
                                for (; j >= i && array[j] == ' '; j--);

					    	   
					    	    return subArray(array, i, j - i + 1);
					    	}
					    	public static char[] subArray(char[] array, int startIndex, int length) {
					    	    char[] result = new char[length];
					    	    for (int k = 0; k < length; k++) {
					    	        result[k] = array[startIndex + k];
					    	    }
					    	    return result;
					    	} 	
//質問８：
		            public static int[] bubbleSort(int[]array6) {
		            	  int n = array6.length;
		            	    for (int i = 0; i < n - 1; i++) {
		            	        for (int j = 0; j < n - 1 - i; j++) {
		            	            if (array6[j] > array6[j + 1]) {
		            	                int x = array6[j];
		            	                array6[j] = array6[j + 1];
		            	                array6[j + 1] = x;
		            	            }
		            	        }
		            	    }
		            	    return array6;
		            	}   	    
					    	    
					    	    
					    	    
					    	    
}





					   
					
					 
					 
					 
					

	

	
