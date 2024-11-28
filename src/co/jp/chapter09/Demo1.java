package co.jp.chapter09;

public class Demo1 implements IDemo,IDemoP {

	@Override
	public void doInit() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("doInit()");

	}

	@Override
	public void getString() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("getString()");

	}
	
	public void uniqueMethod() {
		System.out.println("uniqueMethod()");
	}

	@Override
	public void p() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("p() from IDemoP");
	}

}
