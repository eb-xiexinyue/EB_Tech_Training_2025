package co.jp.chapter07;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

//質問２︓Mathクラスを作成してください。以下メソッドを定義します。
//
//        1. 配列のMAXを求める静的メソッドを定義。（引数は int 配列）
//
//        2. 配列のMINを求める静的メソッドを定義。（引数は int 配列）
//
//        3. 配列の平均値を求める静的メソッドを定義。（引数は int 配列）
//
//        4. mainメソッドで上記それぞれメソッドを呼び出してください。
//以下はメソッドの定義のソースの抜枠です。
public class Question2 {

    public static int max(int[] x) {
        return Arrays.stream(x).max().getAsInt();
    }

    public static int min(int[] x) {
        return Arrays.stream(x).min().getAsInt();
    }

    public static double average(int[] x) {
        return Arrays.stream(x).average().getAsDouble();
    }

    public static void main(String[] args) {
        int[] x={1,2,3,4,5,6,7,8};
        System.out.println(Question2.max(x));
        System.out.println(Question2.min(x));
        System.out.println(Question2.average(x));
    }
}
