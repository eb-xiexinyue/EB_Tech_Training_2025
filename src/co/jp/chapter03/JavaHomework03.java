package co.jp.chapter03;

public class JavaHomework03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// question 1
		int a = 56;
		System.out.println("質問1");
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
        
        // question 2
        int amount = 3340;
        int[] coins = {500, 100, 10, 5, 1};
        int[] count = new int[coins.length];

        // 大きい額のコインから順に使用していく
        for (int i = 0; i < coins.length; i++) {
            count[i] = amount / coins[i]; // コインの枚数
            amount %= coins[i]; // 残りの金額
        }

        // 結果を表示
        System.out.println("質問2");
        System.out.println("3340円を作るためのコインの枚数:");
        for (int i = 0; i < coins.length; i++) {
            System.out.println(coins[i] + "円: " + count[i] + "枚");
        }
	}
}
