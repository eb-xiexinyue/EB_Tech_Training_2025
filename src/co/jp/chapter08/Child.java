package co.jp.chapter08;

public class Child extends Parent{
	//所有的都是默认继承Object,只不过省略了
	public int id;
	protected int money =1500;
//	public Child() {
//		super(0);
//	}

	
	public Child(int age) {
		super(age);
		this.id=id;
		// super：代指父类的构造函数
	}

	@Override
	public void init() {
		super.init();//不会影响父类函数，调用
		System.out.println("this is from Child class without int x");
		//这里是复写，如果没有上面的super就会复写掉parentsclass
		
	}
	
	@Override
	public String toString() {
		return "Class:Child,age:"+this.age;
	}
	
//	public boolean equals(Object obj) {
//	try {
////		boolean isEqual =false;
//		Child target = Child.class.cast(obj);
//		
//		if(target.id ==this.id) {
//			return true; 
//		}
//		else {return false;}
//	}
//	}
//	catch(Exception e) {return false;}
//	finally{return false;}
//	}
	
	
	public  int getMoney() {
		return this.money;
	}
	
	public int getParentMoney() {
		return super.money;
	}



}
