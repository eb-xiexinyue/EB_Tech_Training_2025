package co.jp.chapter02;

public class JavaChapter02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String  str1 = "this is a string1";
		String  str2 = "\t this is a string2";
		System.out.println(str1 + str2);
		System.out.println(str1.length() + str2.length());
		System.out.println(str2.indexOf("a"));//index:第几个文字
		System.out.println(str1.indexOf("T") );//存在しない場合は－1が出る

		//重要：文字列の比較
		System.out.println("moji"=="moji");
		System.out.println(" "+"moji"=="moji");//==を使った比較はおすすめしない
		//类的实例化
		String strFromNew = new String("mojiretsunew");  //new 是实例化的关键字
		//(String的情况，new其实可以省略)
		System.out.println(strFromNew);
		
		//单纯查看值的话，没有问题，问题在于通过new进行==比较
		//的时候(下面的出力为False)
		System.out.println(strFromNew=="mojiretsunew");
		//原因：new的话不在スコープ（常量值）的池子里面，
		//需要在JVM中开辟新地址，而==比较的是地址（值相同，地址也相同才会变为true）
		//正确用法:文字列.equals↓
		System.out.println(strFromNew.equals("mojiretsunew"));
		
		//空String,第32行正常，33行会错误：null是空的，空对象不能调用函数
		String nullString = null;
		System.out.println(strFromNew.equals(nullString));
		//System.out.println(nullString.equals(nullString));

	}

}
