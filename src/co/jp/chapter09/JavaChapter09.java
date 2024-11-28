package co.jp.chapter09;

public class JavaChapter09 {
	
	public static class innerClass extends BaseDemo implements IDemo{

		@Override
		public void doInit() {
			// TODO 自動生成されたメソッド・スタブ
			System.out.println("doInit() from InnerClass");
		}

		@Override
		public void getString() {
			// TODO 自動生成されたメソッド・スタブ
			
		}

		@Override
		public void init() {
			// TODO 自動生成されたメソッド・スタブ
			
		}
		
	}
	//抽象函数：public abstract void basexxxx{}
	//一般为了好看名字里带base
	//BaseDemo demo=new BaseDemo();//不可实例化。不存在抽象函数method也不行
	public static void main(String[] args) {
	BaseDemo demo=new Demo();
	demo.test();//demo继承了basedemo的内容
	demo.init();
	
	//接口使用
	IDemo demo1 = new Demo1();
	IDemo demo2 = new Demo1();

	demo1.doInit();
	demo2.getString();
	
	Demo1 demo3 = new Demo1();
	//demo1.uniqueMethod(); 为什么报错：IDemo里没有此函数的定义
	demo3.uniqueMethod();
	IDemoP demo4 = new Demo1();
	demo4.p();//继承多个接口\
	
	//类中类 内部クラス
	innerClass innerClass = new innerClass();
	innerClass.doInit();
	
	//匿名クラス 不些分号直接大括号
	IDemo demo5 = new IDemo() {
		
		@Override
		public void getString() {
			// TODO 自動生成されたメソッド・スタブ
			System.out.println("get string from demo5");
		}
		
		@Override
		public void doInit() {
			// TODO 自動生成されたメソッド・スタブ
			System.out.println("doInit() from demo5");
		}
	};
	

	//demo5.doInit();
	//demo5.getString();
	
	//ラムダ式
	//为什么不用IDemo举例:因为ラムダ只能使用“只有一个抽象函数的接口”
	IDemoP demo6 = ()->{
		System.out.println("p() from demo6");
	};
	
	demo6.p();
	
	//枚举型使用switch文非常适合
	Gender g = Gender.Female;
	switch(g){
	case Male:
		System.out.println("this is male");
		break;
	case Female:
		System.out.println("this is female");
	break;
	default:
		System.out.println("what the hell is this?");
		break;
	}
	
	for(Gender gd:Gender.values()) {
		System.out.println(gd.name());//所有值都会打出来，强化型for文
		
	}
	System.out.println(Gender.valueOf("Male"));
	for(Gender gd:Gender.values()) {
		System.out.println(gd.id);//所有值都会打出来，强化型for文
		System.out.println(gd.str);
	}
	
	
	
	
	}
	}


















