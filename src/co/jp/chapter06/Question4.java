package co.jp.chapter06;

public class Question4 {

    /*
    * 質問４︓以下メソッドの実施結果を教えてください。
    * */
        private static void fillArray(String[] array) {
            array[0] = "value2";
        }
        public static void main(String args[]) {
            String[] array = new String[]{"value1"};
            fillArray(array);
            System.out.println(array[0]);
        }

   /*
   * A:value2
   * */

}
