package co.jp.chapter02;

public class JavaChapter02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String str = "This is a string";
		String a = "123";
		String b = "１２３";
		
//		
//		System.out.println(str);
//		System.out.println("文字列strの長さは"+str.length());
//		System.out.println("文字列aの長さは"+a.length());
//		System.out.println("文字列bの長さは"+b.length());
//		
//		System.out.println("文字Tのindexは"+str.indexOf("i"));
//		
//		System.out.println("文字列比較方法①"+"文字列"=="文字列");
//		
//		String strFromNew = new String("文字列");
//		System.out.println("文字列strFromNewの値は"+strFromNew);
//		System.out.println("文字列strFromNewと「文字列」の比較結果(==)は："+(strFromNew=="文字列"));
//		
//		
//		String strFromNew1 = new String("文字列");
//		System.out.println("文字列strFromNewとstrFromNew1の比較結果(==)は："+(strFromNew==strFromNew1));
//		
//		System.out.println("文字列比較方法（おすすめ）"+(strFromNew.equals(strFromNew1)));
//		System.out.println("文字列比較方法（おすすめ）"+("文字列".equals(strFromNew)));
		
		String nullStr = null;
		//String nullStr;
		System.out.println("文字列比較方法（おすすめ）"+("文字列".equals(nullStr)));
		//System.out.println("文字列比較方法（おすすめ）"+(nullStr.equals("文字列")));
		
		System.out.println("文字列1"+" and "+"文字列2");
		System.out.println(1+2);
		System.out.println("1"+2);//"1"+"2"
		System.out.println("1"+"2");
		System.out.println(Integer.parseInt("1")+2);
		
		System.out.println("1"+String.valueOf(2));
		

		System.out.println("\"1\"");
		System.out.println("1\t2");
		System.out.println("1\n2");
		System.out.println("1\\2");
		
		
		
		
		
		
		
		
	}

}
