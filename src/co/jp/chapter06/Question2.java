package co.jp.chapter06;

public class Question2 {
    /*
     * 質問２．配列の和、MAX値、MIN値を求める処理を関数化してください、main関数に呼び出してください。
     *
     * */

    //max method
    public static int max(int[] datas) {
        int max = datas[0];
        for (int i = 1; i < datas.length; i++) {
            if (max <= datas[i]) {
                max = datas[i];
            }

        }
        return max;
    }

    //min method
    public static int min(int[] datas) {
        int min = datas[0];
        for (int i = 1; i < datas.length; i++) {
            if (min >= datas[i]) {
                min = datas[i];
            }

        }
        return min;
    }
}
