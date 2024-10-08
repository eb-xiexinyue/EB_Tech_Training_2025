package co.jp.chapter01;

public class JavaChapter01 {
	final static int fixedNum= 99;//static 関数、無法変換
	//fixedNum = 100; staticの変数の変換はエラーとなる　解決法：finalを消す
	

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int num = 20;
		long numLong = 20000000;
		float floatNum = 20.01f;
		int num1 = 20;//没被使用过会有黄色波浪线
		num1 = 100;//被覆盖
		num1 = (int)100.3f;//強制転換

		
		System.out.println("int:"+num);
		System.out.println("Long:"+numLong);
		System.out.println("float:"+floatNum);
		System.out.println("num1:"+num1);
		System.out.println("final int value:"+fixedNum);
		//强制转换
		
		int sum = 1 + 1;
		int a = 10;
		int b = 20;
		int c = a + b;//没被使用过会有黄色波浪线
		
		System.out.println(a != b );

		
		System.out.println("sum:"+sum);
		System.out.println("10>9 ?1 ：0 [条件論理演算子]");
		System.out.println(10 >9 ? 1 :0);
		
		
				

	}

}
