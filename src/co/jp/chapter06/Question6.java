package co.jp.chapter06;
/*
* 質問６-０︓配列は直接に印刷できません。下記メソッドを利⽤して、配列をprintしま
す。以下メソッドを呼び出してください。
* */
public class Question6 {
    public static void printArray(Object[] objs) {
        if(objs == null) {
            System.out.println("null");
            return;
        }
        String prefix = "";
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(Object obj : objs) {
            sb.append(prefix);
            sb.append(String.valueOf(obj));
            prefix = ", ";
        }
        sb.append("]");
        System.out.println(sb.toString());
    }
/*
* A:
* */
    public static void main(String[] args) {
        Object[] a={1,2,3,4,5,6,7};
        printArray(a);
    }


    /*
    * 質問６-１︓以下静的なメソッドを定義してください。
    * 1. メソッド名: megerArray
      2. 引数１︓intの配列 left
      3. 引数２︓intの配列 right
      4. 戻り値︓intの配列
      5. 処理内容︓引数left と 引数right をマージして、新しい配列を作成して返却する。
    * */
    public static int[] merge(int[] left,int[] right){
        int length=left.length+right.length;
        int[] x=new int[length];
        System.arraycopy(left, 0, x, 0, left.length);
        for (int i = left.length; i <length; i++) {
            x[i]=right[i-left.length];
        }
        return x;
    }

    /*
    * 質問６-２︓以下静的なメソッドを定義してください。
    1. メソッド名: subArray
    2. 引数１︓intの配列 array
    3. 引数２︓開始のstartIndex
    4. 引数３︓⻑さlength
    5. 戻り値︓intの配列
    6. 処理内容︓startIndexからstartIndex + lengthまでサブ配列を取得する
    * */
    public static int[] subArray(int[] array,int startIndex,int length){
        int[] x=new int[length];
        for (int i = 0; i < length; i++) {
            x[i]=array[startIndex+i];
        }
        return x;
    }
}
