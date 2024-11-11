package co.jp.chapter06;

public class JavaHomework06 {
/*質問１修飾子: public static
返却型: void
関数名: main
引数: String[] args
引数の型: String[] (文字列の配列)
引数の名称: args
質問２public class ArrayOperations {
    
    // 配列のMax値を求めるメソッド
    public static int max(int[] datas) {
        int max = datas[0];
        for (int data : datas) {
            if (data > max) {
                max = data;
            }
        }
        return max;
    }

    // 配列のMin値を求めるメソッド
    public static int min(int[] datas) {
        int min = datas[0];
        for (int data : datas) {
            if (data < min) {
                min = data;
            }
        }
        return min;
    }

    // 配列の和を求めるメソッド
    public static int sum(int[] datas) {
        int sum = 0;
        for (int data : datas) {
            sum += data;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        int maxValue = max(numbers);
        int minValue = min(numbers);
        int sumValue = sum(numbers);

        System.out.println("配列のMax値: " + maxValue);
        System.out.println("配列のMin値: " + minValue);
        System.out.println("配列の和: " + sumValue);
    }
}
質問３null
質問４value2
質問５true
質問６-0public class ArrayPrinter {

    // 既存の printArray メソッド
    public static void printArray(Object[] objs) {
        if (objs == null) {
            System.out.println("null");
            return;
        }
        String prefix = "";
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Object obj : objs) {
            sb.append(prefix);
            sb.append(String.valueOf(obj));
            prefix = ", ";
        }
        sb.append("]");
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        // サンプル配列
        Object[] array1 = {"apple", "banana", "cherry"};
        Object[] array2 = {1, 2, 3, 4, 5};
        Object[] array3 = null;

        // printArray メソッドを呼び出して配列を印刷
        printArray(array1); // 出力: [apple, banana, cherry]
        printArray(array2); // 出力: [1, 2, 3, 4, 5]
        printArray(array3); // 出力: null
    }
}
質問6-1public class ArrayUtils {

    // mergeArray メソッド
    public static int[] mergeArray(int[] left, int[] right) {
        // 新しい配列を作成し、長さは left 配列と right 配列の合計
        int[] merged = new int[left.length + right.length];

        // left 配列の要素を merged 配列にコピー
        System.arraycopy(left, 0, merged, 0, left.length);

        // right 配列の要素を merged 配列にコピー
        System.arraycopy(right, 0, merged, left.length, right.length);

        return merged;
    }

    
   }
質問6-2public class ArrayUtils {

    // subArray メソッド
    public static int[] subArray(int[] array, int startIndex, int length) {
        // パラメータが有効かどうかを確認
        if (array == null || startIndex < 0 || length < 0 || startIndex + length > array.length) {
            throw new IllegalArgumentException("無効なインデックスまたは長さです");
        }

        // 指定された長さの新しい配列を作成
        int[] subArray = new int[length];

        // array の指定された部分を subArray にコピー
        System.arraycopy(array, startIndex, subArray, 0, length);

        return subArray;
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60};

        // サブ配列を取得
        int[] result = subArray(array, 2, 3);

        // 結果を表示
        printArray(result); // 出力: [30, 40, 50]
    }
  }
質問７public class CharArrayUtils {

    // trim メソッド
    public static char[] trim(char[] chars) {
        if (chars == null) {
            return null;
        }

        int start = 0;
        int end = chars.length - 1;

        // 先頭の空白をスキップ
        while (start <= end && Character.isWhitespace(chars[start])) {
            start++;
        }

        // 末尾の空白をスキップ
        while (end >= start && Character.isWhitespace(chars[end])) {
            end--;
        }

        // 空白のみの配列の場合、空の配列を返す
        if (start > end) {
            return new char[0];
        }

        // トリムされた範囲を新しい配列として返す
        char[] trimmedArray = new char[end - start + 1];
        System.arraycopy(chars, start, trimmedArray, 0, end - start + 1);

        return trimmedArray;
    }
}
質問８public class SortUtils {

    // bubbleSort メソッド
    public static int[] bubbleSort(int[] array) {
        if (array == null) {
            return null;
        }

        // バブルソートアルゴリズム
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // 隣接する要素が順序違反なら交換
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        return array; // ソート済みの配列を返す
    }

    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11};

        // bubbleSort メソッドを呼び出し、結果を表示
        int[] sortedArray = bubbleSort(array);
        printArray(sortedArray); // 出力: [11, 12, 22, 25, 64]
    }
}
質問９-1public static void main(String[] args) {
        int[] left = {1, 2, 3};
        int[] right = {4, 5, 6};

        int[] mergedArray = mergeArray(left, right);

        // 結果を表示
        printArray(mergedArray); // 出力: [1, 2, 3, 4, 5, 6]
    }
    
    質問9-2public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11};

        // bubbleSort メソッドを呼び出し、結果を表示
        int[] sortedArray = bubbleSort(array);
        printArray(sortedArray); // 出力: [11, 12, 22, 25, 64]
    }

 
 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}

}
