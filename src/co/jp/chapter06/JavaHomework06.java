package co.jp.chapter06;

import java.util.Arrays;

public class JavaHomework06 {
	public static void main(String[] args) {
		//問題1: 修飾子public、返却型void、関数名main、引数型String[]、引数名称args
		//問題6-0: 
		printArray(new Object[] {1,2});
		//問題9:
		bubbleSort(mergeArray(new int[]{2,1},new  int[]{4,-1}));
		
	}
	//問題2:
	public static int sum(int[] datas) {
		int result = 0; 
		for (int n : datas) {
			result += n;
		}
		return result;
	}
	
	public static int max(int[] datas) {
		int result = Integer.MIN_VALUE; 
		for (int n : datas) {
			if (result < n) {
				result = n;
			}
		}
		return result;
	}
	
	public static int min(int[] datas) {
		int result = Integer.MAX_VALUE; 
		for (int n : datas) {
			if (result > n) {
				result = n;
			}
		}
		return result;
	}
	//問題3: null
	//問題4: value2
	//問題5: true
	//問題6-0:
	public static void printArray(Object[] objs) {
		if (objs == null) {
			System.out.println("null");
			return;
		}
		String prefix = "";
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for(Object obj: objs) {
			sb.append(prefix);
			sb.append(String.valueOf(obj));
			prefix = ",";
		}
		sb.append("]");
		System.out.println(sb.toString());
	}
	//問題6-1:
	static int[] mergeArray(int[] left, int[] right) {
		int[] result = new int[left.length + right.length];
		for (int i = 0; i < left.length; i++) {
			result[i] = left[i];
		}
		for (int i = 0; i < right.length; i++) {
			result[i + left.length] = right[i];
		}
		return result;
	}
	//問題6-2:
	static int[] subArray(int[] array, int startIndex, int length) {
		return Arrays.copyOfRange(array, startIndex, startIndex + length);
		
	}
	//問題7:
	static char[] trim(char[] origin) {
		int startIndex = 0, endIndex = origin.length; 
		for (int i = 0; i < origin.length; i++, startIndex++) {
			if (origin[i] != ' ') break;
		}
		for (int i = origin.length - 1; i >= 0; i--, endIndex--) {
			if (origin[i] != ' ') break;
		}
		return Arrays.copyOfRange(origin, startIndex, endIndex);
	}
	
	//問題8:
	static int[] bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1 ; j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}
	
	//問題9: mainメソッドに書いてあります。
	

}
