package co.jp.chapter07;//这里是package的路径
//如果其他java文件里package不是这个路径，需要使用import
import java.util.Date;
public class JavaChapter07 {
	//class名和ファイル名需要一模一样、开头大写
	protected String str = "Java chapter 07";

	public static void main(String[] args) {
		//import现在时刻使用
		Date date = new Date();
		System.out.println(date);
		// TODO 自動生成されたメソッド・スタブ
		String string = new String("hello from chapter07.str");
		Test07 demo = new Test07(78);//インスタンス化
		System.out.println(demo.getStr());//クラスタイプの変数名 . 属性
		//クラス型を利⽤するために、インスタンス化（instance）の必要があります。
		//インスタンス⽣成するには new 演算⼦を使⽤します。
		//クラス名 インスタンス名 = new クラス名();
		System.out.println("Yの値"+demo.getY());
		System.out.println("xの変換の値"+demo.getX());
		System.out.println("static_x:"+demo.static_x);//有波浪线
		System.out.println("static_x:"+Test07.static_x);//没有波浪线
		JavaChapter07 jc07 =new JavaChapter07();
		System.out.println(jc07.str);
		Dummy obj = null;
		System.out.println(obj);
		//getter setter(Petクラスを例として) 
		
		Pet cat=new Pet();
		Pet dog=new Pet();
		
		cat.setName("cat1");
		dog.setName("dog1");
		cat.setAge(2);
		dog.setAge(3);
		
		
		
		System.out.println();

	}
	

}

class Dummy{
	//可以全新写一个class，写在这一般是用于内部调用
}
