package co.jp.chapter03;

public class JavaHomework03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//質問１︓成績ランキング判断を作成する「90以上︓A, 80-90︓B, 70-80︓C, 60-70︓
		int a = 56;
		System.out.println("成績ランキング判断。入力値=" + a);
		// 以下コードを完成してください。
		if(a>=90) {
		 System.out.println("A");
		} 
		else if(a<90&&a>=80) {
		 System.out.println("B");
		} 
		else if(a<80&&a>=70) {
		 System.out.println("C");
		} 
		else if(a<70&&a>=60) {
		 System.out.println("D");
		} 
		else {
		 System.out.println("E");
		}
		
		//質問２：⽇本のコインを１円、５円、１０円、１００円、５００円があります。３３４０円のコイン数をもとめください。
        int total = 3340; 

        int fiveHundredYen = 0;
        int hundredYen = 0;
        int tenYen = 0;
        int fiveYen = 0;
        int oneYen = 0;

        // 500円コインの枚数
        for (int i = 0; total >= 500; i++) {
            fiveHundredYen++;
            total -= 500;
        }

        // 100円コインの枚数
        for (int i = 0; total >= 100; i++) {
            hundredYen++;
            total -= 100;
        }

        // 10円コインの枚数
        for (int i = 0; total >= 10; i++) {
            tenYen++;
            total -= 10;
        }

        // 5円コインの枚数
        for (int i = 0; total >= 5; i++) {
            fiveYen++;
            total -= 5;
        }

        // 1円コインの枚数
        for (int i = 0; total >= 1; i++) {
            oneYen++;
            total -= 1;
        }

        // 結果の表示
        System.out.println("500円コイン: " + fiveHundredYen + "枚");
        System.out.println("100円コイン: " + hundredYen + "枚");
        System.out.println("10円コイン: " + tenYen + "枚");
        System.out.println("5円コイン: " + fiveYen + "枚");
        System.out.println("1円コイン: " + oneYen + "枚");
        
        //出力結果：500円コイン: 6枚
        //100円コイン: 3枚
        //10円コイン: 4枚
        //5円コイン: 0枚
        //1円コイン: 0枚
		
		
	}


}

