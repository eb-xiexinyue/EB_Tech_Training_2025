package co.jp.chapter03;

public class JavaHomework03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//質問1
		int a = 56;
		System.out.println("成績ランキング判断。入力値=" + a);
		if (a >= 90) {
			System.out.println("A");
		} else if (a < 90 && a >= 80) {
			System.out.println("B");
		} else if (a < 80 && a >= 70) {
			System.out.println("C");
		} else if (a < 70 && a >= 60) {
			System.out.println("D");
		} else if (a < 60) {
			System.out.println("E");
		}
		//質問2
		int total = 3340;
		int[]coins = {500, 100, 10, 5, 1};
		int[]coinCount = new int[coins.length];
		
		for(int i = 0; i<coins.length;i++) {
			coinCount[i] = total / coins[i];
			total %= coins[i];
		}
		
		System.out.println("500円玉"+ coinCount[0]);
		System.out.println("100円玉"+ coinCount[1]);
		System.out.println("10円玉"+ coinCount[2]);
		System.out.println("5円玉"+ coinCount[3]);
		System.out.println("1円玉"+ coinCount[4]);
		
		//500円 = ６枚
		//100円 = ３枚
		//10円 = ４枚
		//5円 = ０枚
		//1円 = ０枚



	}

}
