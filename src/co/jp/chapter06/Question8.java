package co.jp.chapter06;

import java.util.Arrays;

/*
* 質問８︓バブルソート⽤メソッドを作成してください。
1. メソッド名︓bubbleSort
2. 引数１︓intの配列
3. 戻り値︓ソート済みの配列
4. 処理内容︓bubbleSortアルゴリズムを⽤い、⼊⼒した引数の配列をソートしてくださ
い。
* */
public class Question8 {
    public static int[] bubbleSort(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1-i; j++) {
                if (array[j]>array[j+1]){
                    int a=array[j];
                    array[j]=array[j+1];
                    array[j+1]=a;
                }
            }
        }
        return array;
    }


}
