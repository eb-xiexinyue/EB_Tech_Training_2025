package co.jp.chapter08;

public class JavaChapter08 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Child child = new Child(20, 77);
		
//		System.out.println(child.familyName);
//		//System.out.println(child.givenName); //アクセス不可
//		System.out.println(child.money);
//		System.out.println(child.age);
//		
//		child.init();
		
//		Son son = new Son(5);
		
//		System.out.println(son instanceof Son);
//		System.out.println(son instanceof Child);
//		System.out.println(son instanceof Parent);
		
//		System.out.println(child.getMoney());
//		System.out.println(child.getParentMoney());
//		String strFromChild = child.toString();
//		
//		System.out.println(strFromChild);
//		System.out.println(child);
		Child target1 = new Child(35, 77);
		
		Child target2 = new Child(35, 78);
		
		System.out.println(child);
		System.out.println(target1);
		System.out.println(target2);
		
		System.out.println(child.equals(target1));
		System.out.println(child.equals(target2));
		
		Object str = new String("DCNET"); 
		String value1 = (String)str; 
		String value2 = String.class.cast(value1); 
		
		System.out.println(value1);
		System.out.println(value2);		 
	}

}
