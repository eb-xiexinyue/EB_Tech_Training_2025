package co.jp.chapter07;

public class Test07 {
	int x = 0;

	private int y= 1;
	public static int static_x= 0;
	
	public String getStr() {
		return "This is from getStrofTest07";
	}
	
 public Test07(int x) {
	 //此为构造函数コンストラクタ，不需要void或其他型，名字需要和method一样
	 //明⽰的なコンストラクタ:写了这个构造函数后，系统默认优先走这个函数
	 //明示和暗示的区别：看有没有引数（int a）
	 this(x,10);//必须在第一行：Java 的规则明确要求在调用其他构造函数时，它必须是构造函数的第一行代码。
	 System.out.println("コンストラクタTest07");
	 //this.x =x;
	//构造函数中的构造函数
	 System.out.println("int x of Test07:"+this.x);
	 }
 
 private Test07(int origin,int offset) {
	 this.x=origin+offset;
 }
 
 public int getX() {
	return x;
}

public void setX(int x) {
	this.x = x;
}


 
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
}

