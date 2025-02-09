package co.jp.chapter09;

public class javahomework09 {
/*質問１public class ArrayIndexExceptionExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        try {
            // 配列の範囲外をアクセス
            System.out.println(numbers[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("エラー: 配列の範囲外をアクセスしました。");
            e.printStackTrace();
        }

        System.out.println("プログラムは正常に続行されます。");
    }
}
*/
	/*質問２// カスタム例外クラス
class ValidationException extends Exception {
    public ValidationException(String message) {
        super(message);
    }
}

// 入力を検証するクラス
class UserValidator {
    public static void validateUserInput(String username, int age) throws ValidationException {
        if (username == null || username.trim().isEmpty()) {
            throw new ValidationException("ユーザー名は空白にできません。");
        }
        if (age < 18) {
            throw new ValidationException("年齢は18歳以上である必要があります。");
        }
    }
}

public class ValidationExceptionExample {
    public static void main(String[] args) {
        try {
            // ユーザー入力を検証
            UserValidator.validateUserInput("田中", 17);
        } catch (ValidationException e) {
            System.out.println("入力エラー: " + e.getMessage());
        }

        try {
            UserValidator.validateUserInput("", 25);
        } catch (ValidationException e) {
            System.out.println("入力エラー: " + e.getMessage());
        }

        try {
            // 正常な入力
            UserValidator.validateUserInput("山田", 25);
            System.out.println("ユーザー入力が正常です。");
        } catch (ValidationException e) {
            System.out.println("入力エラー: " + e.getMessage());
        }
    }
}
*/
}
