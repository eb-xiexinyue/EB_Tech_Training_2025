package co.jp.chapter05;

public class JavaHomework05 {
	public static void main(String[] args) {
		int[] array = new int[] {1, 3, 5, 7, 100, 0, 1};
		System.out.println("max is "+max(array));
		System.out.println("min is "+min(array));
		System.out.println("sum is "+sum(array));
		String[] ay= {"a","b","c"};
		printArray(ay);
		int[] left = new int[] {1, 2, 3, 4};
		int[] right = new int[] {5, 6, 7, 8};
		bubbleSort(megerArray(left,right));
		
//		String x = null;
//		sayHello(x);
//		System.out.println(x);
//		
//		String[] array1 = new String[]{"value1"};
//		fillArray(array1);
//		System.out.println(array1[0]);
//		
//		String[] array2 = null;
//		fillArray(array2);
//		System.out.println(array2 == null);
	}

	//	質問１．以下関数の修飾⼦、返却型、関数名、引数（引数の型・名称）を回答してください。
//	public static void main(String[] args);
//	修飾⼦:public static
//	返却型:void
//	関数名:main
//	引数:文字列・args

	//	質問２．配列の和、MAX値、MIN値を求める処理を関数化してください、main関数に呼び出してください。
	// 例：配列のMax値を求めるメソッド
	public static int max(int[] datas) {
		int max=datas[0];
		for(int i=0;i<datas.length;i++) {
			if (datas[i]>max) {
				max=datas[i];
			}
		}
		return max;
	}
	
	public static int min(int[] datas) {
		int min=datas[0];
		for(int i=0;i<datas.length;i++) {
			if (datas[i]<min) {
				min=datas[i];
			}
		}
		return min;
	}
	
	public static int sum(int[] datas) {
		int sum=0;
		for(int i=0;i<datas.length;i++) {
			sum+=datas[i];
		}
		return sum;
	}

	//	質問３．以下メソッドの実施結果を教えてください。
//	private static void sayHello(String y) {
//		y = "Hello world";
//		}
//	null

	//	質問４︓以下メソッドの実施結果を教えてください。
//	private static void fillArray(String[] array) {
//		array[0] = "value2";
//		}
//	value2
	

	//	質問５︓以下メソッドの実施結果を教えてください。
//	private static void fillArray(String[] array) {
//		array = new String[]{"1", "2"};
//		}
//	error

	//	質問６-０︓配列は直接に印刷できません。下記メソッドを利⽤して、配列をprintします。以下メソッドを呼び出してください。
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
	
	//	質問６-１︓以下静的なメソッドを定義してください。
	public static int[] megerArray(int[] left, int[] right) {
		int[] result = new int[left.length + right.length];
		System.arraycopy(left, 0, result, 0, left.length);
		System.arraycopy(right, 0, result, left.length, right.length);
		return result;
	}

	//	質問６-２︓以下静的なメソッドを定義してください。
	public static int[] subArray(int[] array, int startIndex, int length) {
		int[] result = new int[length];
		System.arraycopy(array, startIndex, result, 0, length);
		return result;
	}
	

	//	質問７︓以下静的なメソッドを定義してください。
	public static char[] trim(char[] array) {
		int start = 0;
		int end = array.length - 1;
		while (start <= end && array[start] == ' ') {
            start++;
        }
		while (end >= start && array[end] == ' ') {
            end--;
        }
		char[] trimmedArray = new char[end - start + 1];
		System.arraycopy(array, start, trimmedArray, 0, end - start + 1);
		return trimmedArray;
	}
	

	//	質問８︓バブルソート⽤メソッドを作成してください。
	public static int[] bubbleSort(int[] array) {
		int n = array.length;
		for (int i = 0; i < n - 1; i++) {
			 boolean swapped = false;
			 for (int j = 0; j < n - 1 - i; j++) {
				 if (array[j] > array[j + 1]) {
					 int temp = array[j];
					 array[j] = array[j + 1];
					 array[j + 1] = temp;
					 swapped = true;
				}
			}
			if (!swapped) {
				break;
		}
		}
		return array;
	}

	//	質問９︓メソッドの呼び出す練習。
	//	main

}
