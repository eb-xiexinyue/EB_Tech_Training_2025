package co.jp.chapter09;

public enum Gender {
	//枚举型
		Male(0,"Male"),
		Female(1,"Female");
		
		int id;
		String str;
		
		private Gender(int id,String str) {//只能是private
			this. id = id;
			this.str =str;
			
		}
		
	
	

}
