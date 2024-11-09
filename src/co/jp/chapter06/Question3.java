package co.jp.chapter06;


    /*
     * 質問３．以下メソッドの実施結果を教えてください。
     * */
    public class Question3 {
        private static void sayHello(String y) {
            y = "Hello world";
        }

        public static void main(String args[]) {
            String x = null;
            sayHello(x);

            System.out.println(x);
        }




    /*
    * A:null
    * */
}
