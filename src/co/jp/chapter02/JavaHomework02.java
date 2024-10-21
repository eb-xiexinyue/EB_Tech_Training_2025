package co.jp.chapter02;

public class JavaHomework02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

//		質問 1: System.out.println("this is line1\tthis line2");これは何行出力しますか？
		//	　　　答え：　一行だけです。

		//      　説明：  \t　の意味はTabなので、出力された結果は　this is line1　this line2　です。
//　以下は例です。
	      String str =("this is line1");
	      String str1 =("this line2");
	      
	      System.out.println("this is line1\tthis line2 ");
	      
//	      質問２:Stringを比較する方法は？
//	      答え：equalsです

	  //　　　　　説明：equalsの場合は文字例のvalueの比較だけ行います。
//　以下は例です。	      
	      String str2 =new String ("this is line1");
	      System.out.println("strとstr2の比較は:"+str.equals(str2));
	      
//	     (==)の場合は、valueだけではなく、addressも比較されます。
//　以下は例です。	      
	      System.out.println("strとstr2の比較は:"+(str==str2));
	      
//		違うaddressで比較できないので、正しい結果は得られません。


//        質問 3: Float値をStringに変換する場合、どのようなメソッドを利用しますか？		
//　答え：　両方でも利用します。

//	      1. String.valueOf(“1.0F“)	      
//	      2. 1.0F + ““      
//	１の説明は以下です：
//	     String.valueOf() は任意の数値を文字列に変換するメソッドです。
	      System.out.println(String.valueOf(1.0F));
//	  	結果は文字列です。		      
	      
	      
//	2の説明は:数値型＋文字列＝文字列 　　　　  
//1.0F （数値型）+ ““（文字列）＝文字列　
		
	      System.out.println(1.0F + "abc");
//	結果は文字列です。	
//		質問4:以下式の値を記載してください。
//	      1. 1.0 + 2.0
//	      2. 1.0 + “2.0“	      
	      
	      
	      float c =1.0f;
	      float b =2.0f;
	      //１：  1.0 + 2.0＝3.0  　　
//	      数値型＋数値型＝数値型
	     
	      System.out.println("1.0 + 2.0 の結果は:"+(c+b));
	      
	      
//	      2. 1.0 + “2.0“＝"1．02．０"
//	      数値型＋文字列＝文字列
	      
    System.out.println("1.0 + 2.0 の結果は:"+(c+"2.0"));
//    文字列は出力されます。
		
//          質問５︓以下ステートメントの出⼒を記載してください。

         int a = 10;
         System.out.println("a");
//          aは変数ではなく、文字列です。
		
		
		
	}

}
