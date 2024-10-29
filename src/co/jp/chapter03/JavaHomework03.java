package co.jp.chapter03;

public class JavaHomework03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	//質問１:成績ランキング判断を作成する「90以上:A, 80-90:B, 70-80:C, 60-70:D, 60以下:E」	
//		int a = 56;
//		System.out.println("成績ランキング判断。入力値=" + a);
//
//		if (a >= 90) {
//		    System.out.println("A");
//		} else if (a >= 80) {
//		    System.out.println("B");
//		} else if (a >= 70) {
//		    System.out.println("C");
//		} else if (a >= 60) {
//		    System.out.println("D");
//		} else {
//		    System.out.println("E");
//		}
		//成績ランキング判断。入力値=56 E
		
		
		//質問２︓日本のコインを１円、５円、１０円、１００円、５００円があります。３３４０円のコイン数をもとめください
		
		int total = 3340;
		int[] coins = {500, 100, 10, 5, 1}; 
		int[] Count = new int[coins.length]; 

		for (int i = 0; i < coins.length; i++) {
		   Count[i] = total / coins[i]; 
		   total %= coins[i]; 
	    }


		for (int i = 0; i < coins.length; i++) {
		System.out.println(coins[i] + "円: " + Count[i] + "枚");
		}
		   
//		500円: 6枚
//		100円: 3枚
//		10円: 4枚
//		5円: 0枚
//		1円: 0枚
				
	}

}
