package co.jp.chapter06;
/*
* 質問９︓メソッドの呼び出す練習。
1. 質問６-１を⽤い、２つ配列をマージします。
2. 質問８を⽤い、ステップ１のマージした配列をソートする。
3. 注意︓コードを１⾏にしてください。
*
* */
public class Question9 {
    public static void main(String[] args) {
        int[] left={6,34,654,23,43,12,43,323,42,34,1,6,4,98};
        int[] right={32,545,23,534,66,43,22,324,564,23,123,1};

        Question8.bubbleSort(Question6.merge(left, right));
    }
}
