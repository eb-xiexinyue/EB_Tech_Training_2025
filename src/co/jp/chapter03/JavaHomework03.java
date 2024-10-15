package co.jp.chapter03;

public class JavaHomework03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a = 56; 
		System.out.println("成績ランキング判断。入力値=" + a);
		if (a >= 90) {
		    System.out.println("A");
		} else if (a >= 80) {
		    System.out.println("B");
		} else if (a >= 70) {
		    System.out.println("C");
		} else if (a >= 60) {
		    System.out.println("D");
		} else {
		    System.out.println("E");
		}
		int total = 3340;
		int[] coins = {500, 100, 10, 5, 1}; // コインの額面
		int[] coinCount = new int[coins.length]; // コインの枚数

		for (int i = 0; i < coins.length; i++) {
		    coinCount[i] = total / coins[i]; // 各コインの枚数を計算
		    total %= coins[i]; // 残りの金額を更新
		}

		// 結果の表示
		for (int i = 0; i < coins.length; i++) {
		    System.out.println(coins[i] + "円コイン: " + coinCount[i] + "枚");
		}

      
	}

}
