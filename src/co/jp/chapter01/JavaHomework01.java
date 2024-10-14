package co.jp.chapter01;

public class JavaHomework01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

//	質問１：変数nの値は?
		
  
     int i =10;
     int n =i%5;
//     結果は０です
     System.out.println("n:"+n);
     
     
//  質問２： 式の解釈
//   例：aは整数５にする   
     int a =5;
     
     a = a > 10 ? 11: 0;
//　　a が 10より大きなら、結果は11。小さいなら０。
     System.out.println("a:"+a);
//　　aは５の場合は、５＜１０なので、結果は0
     
     
// 　質問３：変数値を比較する演算子は＝＝
     
// ①：＝　は代入演算子、以下のは例です。
   
     int num =5;
     int longnum=3000;
     num=longnum;
     
    System.out.println("num :"+num);
    System.out.println("longnum:"+longnum) ; 
    
// ②：関係演算子　＝＝　の例にする。
    int c =10;
    int b =12;
    System.out.println(c==b);//    結果はfalse

//   質問４：ブーリアン（boolean）変数に設定できる値はtrueとfalseの2つのみです。
    int h =3;
    int g =5;
    boolean m =h>=g;  //   h >=g の結果はfalse
    boolean w =(h < g || g ==h);//  結果はtrue
    boolean p =(h >g && g ==h);//    結果はfalse
    boolean z =!(h<g);//  結果はfalse
   
    
   if(m){
//		flase  
		System.out.println(m);  //		結果はfalse
   }
		
	if (w) {// true 
			 System.out.println("wの値は："+w); //結果は true 
		 }
	
		 if (z) { //true
			 System.out.println("zの値は："+z); // 結果はtrue 
		 } else 
			{
			 System.out.println("falseを出力する.");
		 }
		 
 }
}
