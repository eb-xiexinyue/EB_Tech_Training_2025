package co.jp.chapter02;

public class JavaHomework02 {

	public static void main(String[] args) {
//		質問１︓ System.out.println(“this is line1\tthis line2“); は何⾏出⼒しますか︖
//		1. １⾏
//		2. ２⾏
//		A：1行
//		質問２︓Stringを⽐較⽅法は︖
//		1. ==
//		2. equals
//		A:2
//		質問３︓Float値⇒String⽂字列変更する場合、どうなメソッドを利⽤しますか
//		1. String.valueOf(“1.0F“)
//		2. 1.0F + ““
//		A：1
//		質問４︓以下式の値を記載してください。
//		1. 1.0 + 2.0
//		2. 1.0 + “2.0“
//		A：1.  3.0		2.    1.02.0
//		質問５︓以下ステートメントの出⼒を記載してください。
//		public static void main(String[] args) {
//		int a = 10;
//		System.out.println("a");
//		}
//		A：a
		
//		質問１︓成績ランキング判断を作成する「90以上︓A, 80-90︓B, 70-80︓C, 60-70︓
//		D, 60以下︓E」
		int a = 56;
		System.out.println("成績ランキング判断。入力値=" + a);
		// 以下コードを完成してください。
		if(a>=90) {
			System.out.println("A");
		}else if(a<90&&a>=80) {
			System.out.println("B");
		}else if(a<80&&a>=70) {
			System.out.println("C");
		}else if(a<70&&a>=60) {
			System.out.println("D");
		}else {
			System.out.println("E");
		}
//		質問２︓⽇本のコインを１円、５円、１０円、１００円、５００円があります。３３４０
//		円のコイン数をもとめください。
//		以下のコードは最小枚数の場合
		int money = 3340;
		int[] coin= {500,100,10,5,1};
		int[] cnt = new int[coin.length];//枚数を格納する配列
		for (int i = 0; i < coin.length; i++) {
            cnt[i] = sum/ coin[i];//枚数計算
            sum %= coin[i];//余剰金
        }
		for (int i = 0; i < coin.length; i++) {
            System.out.println(coin[i] + "円が " + cnt[i] + "枚");
        }
		
	}

}
