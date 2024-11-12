package co.jp.chapter06;

public class JavaHomework06 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
	//	質問1「以下関数の修飾子、返却型、関数名、引数（引数の型・名称）を回答してください。」

//		public static void main(String[] args);
//		修飾子：public static
//		返却型：void
//		関数名：main
//		引数：型：String[]；名称：args
		
	//質問2「配列の和、MAX値、MIN値を求める処理を関数化してください。main関数に呼び出してください。」
		

		    // 配列の和を求めるメソッド
//		    public static int total(int[] datas) {
//		        int sum = 0;
//		        for (int data : datas) {
//		            sum += data;
//		        }
//		        return sum;
//		    }
//
//		    // 配列の最大値を求めるメソッド
//		    public static int max(int[] datas) {
//		        int max = datas[0];
//		        for (int data : datas) {
//		            if (data > max) {
//		                max = data;
//		            }
//		        }
//		        return max;
//		    }
//
//		    // 配列の最小値を求めるメソッド
//		    public static int min(int[] datas) {
//		        int min = datas[0];
//		        for (int data : datas) {
//		            if (data < min) {
//		                min = data;
//		            }
//		        }
//		        return min;
//		    }
//
//		    public static void main(String[] args) {
//		        int[] datas = {1, 2, 3, 4, 5, 6, 7};
//
//		        int total = total(datas);
//		        int max = max(datas);
//		        int min = min(datas);
//		        
//		        System.out.println("Total: " + total);
//		        System.out.println("Max: " + max);
//		        System.out.println("Min: " + min);
//		    }
//		

	    	
	//質問3「以下メソッドの実施結果を教えてください。」
	
//	public class Kicker {
//	    private static void sayHello(String y) {
//	        y = "Hello world";
//	    }
//
//	    public static void main(String args[]) {
//	        String x = null;
//	        sayHello(x);
//	        System.out.println(x);
//	    }
//	}
//	結果: null

	//質問4「以下メソッドの実施結果を教えてください。」
		
//		public class Kicker {
//		    private static void fillArray(String[] array) {
//		        array[0] = "value2";
//		    }
//
//		    public static void main(String args[]) {
//		        String[] array = new String[] { "value1" };
//		        fillArray(array);
//		        System.out.println(array[0]);
//		    }
//		}
//		結果: value2
	
	//質問5「以下メソッドの実施結果を教えてください。」
		
//		public class Kicker {
//		    private static void fillArray(String[] array) {
//		        array = new String[]{"1", "2"};
//		    }
//
//		    public static void main(String args[]) {
//		        String[] array = null;
//		        fillArray(array);
//		        System.out.println(array == null);
//		    }
//		}
//		
//		結果:true
		
		//質問6
//		public static void printArray(Object[] objs) {
//		    if(objs == null) {
//		        System.out.println("null");
//		        return;
//		    }
//
//		    String prefix = "";
//		    StringBuilder sb = new StringBuilder();
//		    sb.append("[");
//		    for(Object obj : objs) {
//		        sb.append(prefix);
//		        sb.append(String.valueOf(obj));
//		        prefix = ", ";
//		    }
//		    sb.append("]");
//		    System.out.println(sb.toString());
//		}
//	}
	   //6-1
//	    public static int[] mergeArray(int[] left, int[] right) {
//	        int[] result = new int[left.length + right.length];
//	        System.arraycopy(left, 0, result, 0, left.length);
//	        System.arraycopy(right, 0, result, left.length, right.length);
//	        return result;
//	}

	   //6-2
//		static int[] subArray(int[] array, int startIndex, int length) {
//		    int[] subArray = new int[length];
//		    System.arraycopy(array, startIndex, subArray, 0, length);
//		    return subArray;
//		}

	    //質問７︓以下静的なメソッドを定義してください。
//		1. メソッド名︓trim
//		2. 引数１︓charの配列
//		3. 戻り値︓charの配列
//		4. 処理内容︓引数１のcharの配列先頭と末尾の空⽩⽂字列を削除してください
		
//	    static char[] trim(char[] array) {
//	        int start = 0;
//
//	        while (start < array.length && array[start] == ' ') {
//	            start++;
//	        }
//
//	        int end = array.length - 1;
//
//	      
//	        while (end >= 0 && array[end] == ' ') {
//	            end--;
//	        }
//
//	       
//	        if (start > end) {
//	            return new char[0];
//	        }
//
//	  
//	        char[] output = new char[end - start + 1];
//	        System.arraycopy(array, start, output, 0, output.length);
//
//	        return output;
//	    }
//}

	 //質問８︓バブルソート⽤メソッドを作成してください。
//		1. メソッド名︓bubbleSort
//		2. 引数１︓intの配列
//		3. 戻り値︓ソート済みの配列
//		4. 処理内容︓bubbleSortアルゴリズムを⽤い、⼊⼒した引数の配列をソートしてください。
       
//	    public static void bubbleSort(int[] array) {
//   
//            for (int i = 0; i < array.length - 1; i++) {
//       
//            for (int j = 0; j < array.length - 1 - i; j++) {
//                 
//            	if (array[j] > array[j + 1]) {
//               
//                int temp = array[j];
//                array[j] = array[j + 1];
//                array[j + 1] = temp;
//            }
//        }
		
		
		//質問９︓メソッドの呼び出す練習
		public class Main {
		    public static void main(String[] args) {
		        int[] sortedArray = bubbleSort(mergeArray(new int[]{1, 3, 5}, new int[]{2, 4, 6}));
		        for (int num : sortedArray) {
		            System.out.print(num + " ");
		        }
		    }

		    public static int[] mergeArray(int[] left, int[] right) {
		        int[] result = new int[left.length + right.length];
		        System.arraycopy(left, 0, result, 0, left.length);
		        System.arraycopy(right, 0, result, left.length, right.length);
		        return result;
		    }

		    public static int[] bubbleSort(int[] array) {
		        for (int i = 0; i < array.length - 1; i++) {
		            for (int j = 0; j < array.length - 1 - i; j++) {
		                if (array[j] > array[j + 1]) {
		                    int temp = array[j];
		                    array[j] = array[j + 1];
		                    array[j + 1] = temp;
		                }
		            }
		        }
		        return array;
		    }
		}

            
	   
	
	
	

		
	

