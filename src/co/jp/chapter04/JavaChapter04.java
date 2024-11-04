package co.jp.chapter04;

import java.util.Arrays;

public class JavaChapter04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] arr = new int[4];
		int [] arrini = new int[] {1,2,3,4};
		int [] arrini1 =  {1,2,3,4};//new int[]可以省略
		System.out.println(arr);//只会打印出地址
		System.out.println(Arrays.toString(arr));//正确输出方法
		//long,char,boolean,float,String都可以用数组
		long[] arrLong = new long[8];
		char[] arrChar = new char[8];
		boolean[] arrBool = new boolean[4];
		Object[] arrObjects = new Object[4];
		String[] arrStr = {"a","b","c","d","e","f","g","h"};
		
		System.out.println("arrLong"+Arrays.toString(arrLong));
		System.out.println("arrChar"+Arrays.toString(arrChar));
		System.out.println("arrBool"+Arrays.toString(arrBool));
		System.out.println("arrObjects"+Arrays.toString(arrObjects));
		System.out.println("arrStrOf1:"+arrStr[0]);//选择其中一个输出
		//System.out.println("arrStrOf5:"+arrStr[5]);//因为超出报错
		
		//使用for进行全部输出
		for(int i = 0;i<arrStr.length;i++) {

			System.out.print(arrStr[i]);
		}
        System.out.println();       // 换行，便于按行输出
		//强化型for （迭代）
		for(String s:arrStr) {
			System.out.print("迭代写法"+s);
		}
		//次元配列（中文：多维数组）
		int [] [] int2d = {{1,2,3,4},{11,22,13,14}};
		System.out.println("次元配列总体长度："+int2d.length);
		System.out.println("访问2元配列中个别要素"+Arrays.toString(int2d[0]));
		System.out.println("访问2元配列中个别要素"+int2d[1][0]);
        for (int[] row : int2d) {       // 外层循环遍历每一行
            for (int num : row) {       // 内层循环遍历该行中的每个数字
                System.out.print(num + " ");
            }
            System.out.println();       // 换行，便于按行输出
        }

        int[] arr84 = {1,2,3};
        //arr84[3] = "4"; 数组长度不可变 ，如果想变，只能重新宣言一个新的数组
      //用for把之前的数组的每个要素取出来
        int[] arr88 = new int[4];
        for(int i2=0;i2<arr84.length;i2++) {
        	arr88[i2]=arr84[i2];//代入，注意不能写反
        }
        arr88[3]=4;

        System.out.println(Arrays.toString(arr88));  
        
        
        //减一位的话，i的长度要使用新数组的长度，因为原来的长度超出
        int[] arr97 = new int[2];
        for(int i3=0;i3<arr97.length;i3++) {//或者i3<arr84.length-1也行
        	arr97[i3]=arr84[i3];
        }
        System.out.println(Arrays.toString(arr97));
        
        
        //不使用For用Arrayscopy
        Arrays.copyOf(arr84, 4);//重新宣言长度
        System.out.println(Arrays.toString(Arrays.copyOf(arr84, 4)));//输出为[1230]
      //特定范围(数组名称，起始处，结束处)，如果结束处超过长度会自动赋值0
        System.out.println(Arrays.toString(Arrays.copyOfRange(arr84, 0,7)));
        //正常情况不这么写，可读性很差，正确写法：重新创建一个函数 int[] newarr = Arrays.copyOf(arr,4);
        
        

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
