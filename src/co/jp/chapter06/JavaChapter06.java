package co.jp.chapter06;

public class JavaChapter06 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//public static 修饰子
		//void：返却值 
		//main：函数名字
		//(String[](引数の型) args（引数名）) {
		System.out.println(args);
		//不是void的情况需要return
		System.out.println(sum(1,2));
		System.out.println(" static String combine(String str1,String str2) の戻り値"+combine("aaa","bbb" ));
		sumOverload();
		System.out.println("sumOverload(1,3):"+sumOverload(1,3));
		sumOverload("11","22");
		sumOverload(1.0f,2.3f);
		 System.out.println(fact(3));

	}
	//void sum改成int
	static int sum(int a, int b) {

		return a+b;
		//在retune后面写其他代码，会变成dead code，因为已经结束了
	
	}
 static String combine(String str1,String str2) {
	String res= str1 + str2;
	return res;
 }
 static void testVoid(String str) {
		System.out.println(str);
		return;
 }
 //オーバーロード検証
 static void sumOverload() {
	 System.out.println("sumOverload:");
 }
 
 static int sumOverload(int a,int b) {
	 System.out.println("sumOverload(int a,int b):"+(a+b));
	 return a +b;
 }
 
 static void sumOverload(String a,String b) {
	 System.out.println("sumOverload(String a,String b):"+(Integer.valueOf(a)+Integer.valueOf(b)));
 }

 static float sumOverload(float a,float b) {
	 System.out.println("sumOverload(float a,float b):"+(a+b));
	 return a+b;
 }
 
 //再帰
 //再帰は普通Forと比べてあまり便利でないため、あまり使わない
 static int fact(int n) {
	 if (n == 0) return 1; /* 脱出条件。0! は 1 である ,{}は省略している*/
	 else return fact(n - 1) * n; /* n! は (n-1)! に n を乗じたもの。再帰呼出し */
	}

 
 
 
 
 
 
}
