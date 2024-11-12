package co.jp.chapter07;

public class JavaChapter07 {
	public String str = "JavaChapter07 String";

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
//		String str = new String("hello from str");
//		
//		TestClass demo = new TestClass(78,22);
//				
//		System.out.println(demo.getX());
//		System.out.println(demo.static_x);
//		
//		System.out.println(TestClass.static_x);
		
//		demo.x = 17;
//		System.out.println(demo.x);	
		
//		JavaChapter07 jc07 =  new JavaChapter07();
//		System.out.println(jc07.str);
		
//		Pet cat = new Pet();
//		Pet dog = new Pet();
//		
//		cat.setName("cat");
//		cat.setAge(2);
//		
//		dog.setName("dog");
//		dog.setAge(5);
		
		TestClass tc1 = new TestClass(20);
		System.out.println(tc1.getX());
		
		TestClass.static_x = 120;
		
		TestClass tc2 = new TestClass(30);
		System.out.println(tc2.getX());
		
		TestClass.printHello();
	}

}

class Dummy{
	
}