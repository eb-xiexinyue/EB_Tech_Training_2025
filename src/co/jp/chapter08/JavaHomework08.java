package co.jp.chapter08;

public class JavaHomework08 {
	/*class SampleClass {
	    // 設問1: クラス定義
	    // クラスはオブジェクトの設計図であり、"class" キーワードで定義される

	    // 設問2: クラスメンバの種類
	    // 1. 属性・フィールド (Field)
	    private int field;
	    
	    // 2. 関数(Function)・メソッド(Method)・操作(Operator)
	    public void method() {
	        System.out.println("メソッドが呼ばれました");
	    }
	    
	    // 設問3: コンストラクタ
	    // 設問4: コンストラクタの特徴
	    // - 戻り値不要
	    // - 関数名＝クラス名称
	    
	    // 設問5: コンストラクタの作用 (クラス属性の初期化)
	    public SampleClass() {
	        this.field = 0;
	        System.out.println("デフォルトコンストラクタが呼ばれました");
	    }
	    
	    // 設問6: 複数のコンストラクタ (オーバーロード)
	    public SampleClass(int field) {
	        this.field = field;
	        System.out.println("引数付きコンストラクタが呼ばれました: " + field);
	    }
	    
	    public int getField() {
	        return field;
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        // デフォルトコンストラクタの呼び出し
	        SampleClass obj1 = new SampleClass();
	        System.out.println("obj1のフィールド: " + obj1.getField());
	        
	        // 引数付きコンストラクタの呼び出し
	        SampleClass obj2 = new SampleClass(10);
	        System.out.println("obj2のフィールド: " + obj2.getField());
	    }
	}
	class People {
	    private String name;
	    
	    public void setName(String name) {
	        this.name = name; // 設問7: this の使用方法
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        // 設問8, 9: インスタンス化と new 演算子
	        People obj = new People();

	        // 設問10: アクセス制御の3種類
	        // public, protected, private はそれぞれ異なるアクセス制御を提供する
	    }
	}

	// 設問11: 静的メンバ
	class StaticExample {
	    static int staticValue = 100;
	    public static void printValue() {
	        System.out.println("静的メンバの値: " + staticValue);
	    }
	}

	// 設問12: 静的メンバへのアクセス
	public class StaticTest {
	    public static void main(String[] args) {
	        StaticExample.printValue(); // クラス名.静的メンバ でアクセス可能
	    }
	}

	// 設問13: クラス「Animal」の定義とインスタンス化
	class Animal {
	    int age;
	    String name;
	    String type;
	    
	    public Animal(String name) {
	        this.name = name;
	    }
	    
	    public void sayHello() {
	        System.out.println("こんにちは、私は" + name + "です。");
	    }
	    
	    public String getName() {
	        return name;
	    }
	}

	public class AnimalTest {
	    public static void main(String[] args) {
	        Animal cat = new Animal("ミケ");
	        cat.sayHello(); // 変数catのsayHelloメソッドを呼び出す
	    }
	}

	// 設問15, 16: クラスの継承
	class Parent {
	    public void show() {
	        System.out.println("親クラスのメソッド");
	    }
	}

	class Child extends Parent {
	    public void display() {
	        System.out.println("サブクラスのメソッド");
	    }
	}

	// 設問17, 18, 19: クラスの継承とオーバーライド
	class AnimalParent {
	    public void sayHello() {
	        System.out.println("動物が鳴く");
	    }
	}

	class Cat extends AnimalParent {
	    @Override
	    public void sayHello() {
	        System.out.println("ニャー");
	    }
	}

	class Dog extends AnimalParent {
	    @Override
	    public void sayHello() {
	        System.out.println("ワン");
	    }
	}

	public class OverrideTest {
	    public static void main(String[] args) {
	        Cat cat = new Cat();
	        cat.sayHello();

	        Dog dog = new Dog();
	        dog.sayHello();
	    }
	}
	設問２０class Animal {
	    protected String name;
	    
	    public Animal(String name) {
	        this.name = name;
	    }
	    
	    public String getName() {
	        return name;
	    }
	}

	class Cat extends Animal {
	    public Cat(String name) {
	        super(name);
	    }
	}

	class Dog extends Animal {
	    public Dog(String name) {
	        super(name);
	    }
	}

	public class ISARelationship {
	    public static void main(String[] args) {
	        // 静的なメンバの使用
	        System.out.println("1234"); // 静的フィールドの使用
	        String value = String.format("%05d", 0); // 静的メソッドの使用
	        System.out.println(value);
	        
	        // IS-A関係の検証
	        System.out.println(new Animal("cat").getName());
	        
	        Animal v0 = new Animal("Animal"); // v0 は Animal 型
	        Animal v1 = new Cat("a cat"); // v1 は Cat 型 かつ Animal 型 (IS-A関係)
	        Animal v2 = new Dog("a dog"); // v2 は Dog 型 かつ Animal 型 (IS-A関係)
	        Cat v3 = new Cat("another cat"); // OK: Cat インスタンスを Cat 型に代入
	        Dog v4 = new Dog("another dog"); // OK: Dog インスタンスを Dog 型に代入
	        
	        // NG: Animal インスタンスを Cat 型に代入することはできない（IS-A関係がないため）
	        // Cat v5 = new Animal("some animal"); // コンパイルエラー
	    }
	}*/

}
