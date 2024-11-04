package co.jp.chapter04;

import java.util.Arrays;

public class JavaChapter04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

//		int[] arr = new int[4];
//		int[] arrWIthInitial = new int[] {1,2,3,4};
//		int[] arrWIthInitial1 = {1,2,3,4};
//		
//		 System.out.println(Arrays.toString(arr));
//	     System.out.println(Arrays.toString(arrWIthInitial));
//	     System.out.println(Arrays.toString(arrWIthInitial1));
//	     
//	    
//	     long[] arrLong = new long [4];
//	     char[] arrChar = new char[4];
//	     boolean[] arrBool = new boolean[4];
//	     float[] arrFloat = new float[4];
	     
//	     String[] arrStr = new String[4];
//	     Object[] arrObj = new Object[4];
//	     
//	     System.out.println("arrat with long value :"+ Arrays.toString(arrLong));
//	     System.out.println("arrat with char value :"+  Arrays.toString(arrChar));
//	     System.out.println("arrat with boolean value :"+ Arrays.toString (arrBool));
//	     System.out.println("arrat with float value :"+ Arrays.toString (arrFloat));
//	     
//	     System.out.println("array with String :"+ Arrays.toString(arrStr));
//	     System.out.println("array with Object :"+ Arrays.toString(arrObj);
//	     
	     
//	     String[] arrStr = {"a","b","c","d","e"};
//	     System.out.println(arrStr[0]);
//	     System.out.println(arrStr[1]);
//	     System.out.println(arrStr[2]);
//	     System.out.println(arrStr[3]);
//	     System.out.println(arrStr[4]);
//	     
//
//	     
//	     for(int i=0;i<arrStr.length;i++)  {
//	    	 System.out.println(arrStr[i]);
//	    	 	
//	     
//		for(String s:arrStr) {
//			System.out.println("迭代"+s);
		
//	}
//	     String[][] array2D = {
//	             {"a", "b"},
//	             {"c", "d", "e"}
//	         };
//
//	         System.out.println("length of array2D is " + array2D.length);
//	         System.out.println(Arrays.toString(array2D[1]));
//	         System.out.println(array2D[1][0]);
//	         
//	         for(String[] outS : array2D) {
//	 			for(String inS : outS) {
//	 				System.out.println(inS);
//	 			}
//	         }
//	 		
//		String[][][] array3D = new String[3][2][2];
//		String[][][] array3DwithInitial = new String[][][] {
//			{},{{},{}},{{}}
//		};
//		
	 		
	       
//	     String[] arr1 = {"str1","str2","str3"};
//	     
//	     arr1[2] = "new str3";
//	     
//	     System.out.println(arr1[2]);
//	     
//	     String[][] arr2D = {{"s11","s12","s13"},{"s21","s22","s23"}};
//	     arr2D[1][1] = "ns22";
//	     
//	     System.out.println(arr2D[1][1]);
//	     System.out.println(Arrays.toString(arr2D[1]));
		
		int[] arr = {1,2,3};
		
		int[] arr1 = new int[4];
		
		for(int i=0;i<arr.length;i++) {
			arr1[i] = arr[i];
			
		}
		
		arr1[3] = 4;
		System.out.println(Arrays.toString(arr1));
		
		
		//数数组长度不可变，只能更改已有数组的值
	     
		int[] arr2 = new int[2];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr[i];
        }
        System.out.println("Arr2 (manual copy): " + Arrays.toString(arr2));

        System.out.println( Arrays.toString(Arrays.copyOf(arr, 4)));

        // 使用 Arrays.copyOf 方法来复制 arr 的前2个元素
        System.out.println( Arrays.toString(Arrays.copyOf(arr, 2)));
   
	 
        int[] newArr = Arrays.copyOf(arr, 4);
        System
        
        
        最后一问：二元数组累加累乘
        
	
	
	}
	    
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	       
	}
	
	
}
		 
	         
	         
	         
		 
		 
		 
		 
		 
		 
		 
		 
		
	


