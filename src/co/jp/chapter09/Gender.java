package co.jp.chapter09;

public enum Gender {
	Male(0,"male"),Female(1,"female");
	
	int id;
	String str;
	
	Gender(int id, String str) {
		this.id = id;
		this.str = str;
	}
}
