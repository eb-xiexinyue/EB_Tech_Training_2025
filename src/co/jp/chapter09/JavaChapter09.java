package co.jp.chapter09;

public class JavaChapter09 {
	
	public static class InnerClass extends BaseDemo implements IDemo{

		@Override
		public void init() {
			// TODO 自動生成されたメソッド・スタブ
			
		}

		@Override
		public void doInit() {
			// TODO 自動生成されたメソッド・スタブ
			System.out.println("doInit() from innerClass");
		}

		@Override
		public void getString() {
			// TODO 自動生成されたメソッド・スタブ
			
		}
		
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		BaseDemo demo = new Demo();
//		Demo dm = new Demo();
//		demo.test();
//		demo.init();
		
		IDemo demo1 = new Demo1();
		
//		Demo1 demo2 = new Demo1();
//		demo1.doInit();
//		demo1.getString();
		
		//demo1.uniqueMethod();
		
		IDemoP demo2 = new Demo1();
//		demo2.p();
		
		InnerClass innerClass = new InnerClass();
//		innerClass.doInit();
		
		IDemo demo3 = new IDemo() {

			@Override
			public void doInit() {
				// TODO 自動生成されたメソッド・スタブ
				System.out.println("doInit() from demo3");
			}

			@Override
			public void getString() {
				// TODO 自動生成されたメソッド・スタブ
				System.out.println("getString() from demo3");
			}
			
		};
		
		//demo3.doInit();
		
		IDemoP demo4 = () -> {
			System.out.println("p() from demo4");
		};
//		demo4.p();
		
//		IDemo demo5 = () -> {
//			System.out.println("p() from demo4");
//		};
		
		Gender g = Gender.Male;
		
//		switch(g) {
//			case Male:
//				System.out.println("This is male.");
//				break;
//			case Female:
//				System.out.println("This is female.");
//				break;
//			default:
//				System.out.println("Wrong Gender!");
//				break;
//		}
		
//		for(Gender gd : Gender.values()) {
//			System.out.println(gd.name());
//		}
		
		//System.out.println(Gender.valueOf("Female"));
		
		for(Gender gd : Gender.values()) {
			System.out.println(gd.id);
			System.out.println(gd.str);
		}
	
	}

}

