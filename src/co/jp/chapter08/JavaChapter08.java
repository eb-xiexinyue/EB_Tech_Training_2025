package co.jp.chapter08;

public class JavaChapter08 {

	public static void main(String[] args) {

		Child child = new Child(20);
		System.out.println("age："+child.age);
		System.out.println("familyname:"+child.familyName);
		System.out.println("money："+child.money);
		
		child.init();
		//child.init(5); 如果里面有数字那就是要用到public void init(int x) 
		Son son = new Son(5);
		
		//is a 关系递进 instanceof：型判断
		System.out.println(son instanceof Child);
		System.out.println(son instanceof Parent);
		
		System.out.println(child.getMoney());
		System.out.println(child.getParentMoney());
		System.out.println(child);//如果没有复写，会打印地址
		String strFromChild=child.toString();
		System.out.println(strFromChild);//调用tostring函数的返回值
		child.equals(strFromChild);
	}

}
