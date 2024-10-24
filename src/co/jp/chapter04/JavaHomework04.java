package co.jp.chapter04;

public class JavaHomework04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				if(i==4 || j==4 || i==j || i+j==8) {
					System.out.print(i+""+j+"\t");
				}
				else {
					System.out.print("\t");
				}

			}
			System.out.print("\n");
		}
}
}
