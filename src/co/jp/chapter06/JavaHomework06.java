package co.jp.chapter06;

public class JavaHomework06 {

	// TODO 自動生成されたメソッド・スタブ
	//質問１
	//修飾子：public static
	//返却型：void
	//関数名：main
	//引数：String[] args

	//質問2
	// 配列の最大値を求めるメソッド
	public static int max(int[] datas) {
		int max = datas[0];
		for (int i = 1; i < datas.length; i++) {
			if (datas[i] > max)
				max = datas[i];
		}
		return max;
	}

	// 配列の最小値を求めるメソッド
	public static int min(int[] datas) {
		int min = datas[0];
		for (int i = 1; i < datas.length; i++) {
			if (datas[i] < min)
				min = datas[i];
		}
		return min;
	}

	// 配列の和を求めるメソッド
	public static int sum(int[] datas) {
		int sum = 0;
		for (int i = 0; i < datas.length; i++) {
			sum += datas[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] datas = { 1, 2, 3, 4, 5, 6, 7 };

		int total = total(datas);
		int max = max(datas);
		int min = min(datas);

		System.out.println("Total: " + total);
		System.out.println("Max: " + max);
		System.out.println("Min: " + min);
	}

	private static int total(int[] datas) {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	//質問3
	//null

	//質問4
	//value2

	//質問5
	//true

	//質問6-0
	public class ArrayPrinter {
		public static void main(String[] args) {
			String[] arr = { "apple", "banana", "cherry" };
			printArray(arr);
		}

		public static void printArray(Object[] objs) {
			if (objs == null) {
				System.out.println("null");
				return;
			}
			String prefix = "";
			StringBuilder sb = new StringBuilder();
			sb.append("[");
			for (Object obj : objs) {
				sb.append(prefix);
				sb.append(String.valueOf(obj));
				prefix = ", ";
			}
			sb.append("]");
			System.out.println(sb.toString());
		}
	}

	//6-1
	public static int[] mergeArray(int[] left, int[] right) {
		int[] merged = new int[left.length + right.length];
		System.arraycopy(left, 0, merged, 0, left.length);
		System.arraycopy(right, 0, merged, left.length, right.length);
		return merged;
	}

	//6-2
	public static int[] subArray(int[] array, int startIndex, int length) {
		int[] sub = new int[length];
		for (int i = 0; i < length; i++) {
			sub[i] = array[startIndex + i];
		}
		return sub;
	}
//質問7
	public static char[] trim(char[] array) {
	    int startIndex = 0;
	    int endIndex = array.length - 1;

	    while (startIndex <= endIndex && array[startIndex] == ' ') {
	        startIndex++;
	    }
	    while (endIndex >= startIndex && array[endIndex] == ' ') {
	        endIndex--;
	    }
	    
	    return subArray(array, startIndex, endIndex - startIndex + 1);
	}

	public static char[] subArray(char[] array, int startIndex, int length) {
	    char[] sub = new char[length];
	    for (int i = 0; i < length; i++) {
	        sub[i] = array[startIndex + i];
	    }
	    return sub;
	}
//質問8
	public static int[] bubbleSort(int[] array) {
	    int n = array.length;
	    for (int i = 0; i < n - 1; i++) {
	        for (int j = 0; j < n - 1 - i; j++) {
	            if (array[j] > array[j + 1]) {
	                int temp = array[j];
	                array[j] = array[j + 1];
	                array[j + 1] = temp;
	            }
	        }
	    }
	    return array;
	}
//質問9
	public class Main {
	    public static void main(String[] args) {
	        int[] result = bubbleSort(mergeArray(new int[]{1, 3, 5}, new int[]{2, 4, 6}));  // 使用了6-1和8
	        for (int num : result) System.out.print(num + " ");
	    }

	    public static int[] mergeArray(int[] left, int[] right) {  // 6-1
	        int[] merged = new int[left.length + right.length];
	        System.arraycopy(left, 0, merged, 0, left.length);
	        System.arraycopy(right, 0, merged, left.length, right.length);
	        return merged;
	    }

	    public static int[] bubbleSort(int[] array) {  // 8
	        int n = array.length;
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - 1 - i; j++) {
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
}
