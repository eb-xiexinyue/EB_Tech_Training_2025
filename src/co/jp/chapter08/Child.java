package co.jp.chapter08;

public class Child extends Parent{
	
	public int id;
	
	public static void main(String[] args) {
		
	}

	private int money = 1500; 
	
	public Child() {
		super(0);
	}
	
	public Child(int age, int id) {
		super(age);
		this.id = id;
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public void init() {
		super.init();
		System.out.println("This is from Child class");
	}
	
	@Override
	public String toString() {
		return "Class:Child, id:"+this.id;	
	}
	
	@SuppressWarnings("finally")
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Child) {
			if(this.id == Child.class.cast(obj).id) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
    }
	
	public int getMoney() {
		return this.money;
	}
	
	public int getParentMoney() {
		return super.money;
	}
}
