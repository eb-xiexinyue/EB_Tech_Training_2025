package co.jp.chapter06;

public class Question5 {
    /*
    * 質問５︓以下メソッドの実施結果を教えてください。
    *
    * */

        private static void fillArray(String[] array) {
            array = new String[]{"1", "2"};
        }
        public static void main(String args[]) {
            String[] array = null;
            fillArray(array);
            System.out.println(array == null);
        }
/*
* A:true
* */
}
