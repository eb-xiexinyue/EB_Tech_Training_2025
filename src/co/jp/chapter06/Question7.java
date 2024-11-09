package co.jp.chapter06;
/*質問７︓以下静的なメソッドを定義してください
1. メソッド名︓trim
2. 引数１︓charの配列
3. 戻り値︓charの配列
4. 処理内容︓引数１のcharの配列先頭と末尾の空⽩⽂字列を削除してください。

* */
public class Question7 {
    public static char[] trim(char[] array){
        int startIndex = 0;
        int endIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]!=' '){
                startIndex=i;
                break;
            }
        }

        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] != ' ') {
                endIndex = i + 1;
                break;
            }
        }

        int newArrayLength=endIndex-startIndex;
        char[] newArray=new char[newArrayLength];
        System.arraycopy(array, startIndex, newArray, 0, newArrayLength);
        return newArray;
    }
}
