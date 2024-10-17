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
		System.out.println(" "+"moji"=="moji");//おすすめしない
		//类的实例化
		String strFromNew = new String("mojiretsu");  //new 是实例化的关键字
		//(String的情况，new其实可以省略)
		System.out.println(strFromNew);

	}

}
