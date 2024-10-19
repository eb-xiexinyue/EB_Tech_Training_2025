package co.jp.chapter02;

public class JavaChapter02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String  str1 = "this is a string1";
		String  str2 = "\t this is a string2";
		System.out.println("两个文字列合并相加:"+str1 + str2);
		//System.out.println(str1 - str2);减号不能用
		System.out.println("两个文字列的长度相减:"+(str1.length() - str2.length()));
		System.out.println(str2.indexOf("a"));//indexOf:第几个文字（限第一次出现）
		System.out.println(str2.indexOf("i"));
		//第二个及以后
		int firstIndex = str1.indexOf('i');
		int secondIndex = str1.indexOf('i', firstIndex + 1);
		System.out.println("str1第二个i的位置："+secondIndex);
		
		int firstIndextwo = str2.indexOf('i');
		int secondIndextwo = str2.indexOf('i', firstIndextwo + 1);
		System.out.println("str2第二个i的位置："+secondIndextwo);

		
		System.out.println("不存在的："+str1.indexOf("T") );//存在しない場合は－1が出る

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
		
		//文字列运算
		System.out.println("一加文字的\"一\"输出的是String的11：" +(1+"1"));
		System.out.println("将字符转换为int Integer.parseInt（但是输出的还是11）："+Integer.parseInt("1")+1);
		System.out.println("将int转换为字符String.valueOf（但是输出的还是11）："+("1"+String.valueOf(1)));
		
		//转义字符
		System.out.println("\"1\"");
		
		
	}
	}

