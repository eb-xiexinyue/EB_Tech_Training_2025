package co.jp.chapter08;

public class Kicker {
    public static void print(Parent v) {
        v.hello();
    }//引数の型をChildからParentに変更しました

    public static void main(String... args) {
        print(new Parent());
        print(new Child());
    }
}
