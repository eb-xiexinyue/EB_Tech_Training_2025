package co.jp.chapter03;

		public class JavaHomework03 {
		    public static void main(String[] args) {

				// TODO 自動生成されたメソッド・スタブ
		    	
		    	
		        // 質問１︓成績ランキング判断を作成する「90以上︓A, 80-90︓B, 70-80︓C, 60-70︓D, 60以下︓E」
		        int score =57; 
		        String grade;

		        if (score >= 90) {
		            grade = "A";
		        } else if (score >= 80) {
		            grade = "B";
		        } else if (score >= 70) {
		            grade = "C";
		        } else if (score >= 60) {
		            grade = "D";
		        } else {
		            grade = "E";
		        }

		        System.out.println("成績のランキングは: " + grade);
		        
		        

		        // 質問２︓⽇本のコインを１円、５円、１０円、１００円、５００円があります。３３４０円のコイン数をもとめください。

		        //	説明:大きい金額のコインから順に使用
		        
		        int amount = 3340;// コインの総金額
		       
		        int[] coins = {500, 100, 10, 5, 1};//コインを１円、５円、１０円、１００円、５００円があります
		        for (int a = 0; a < coins.length; a++) {
		        	int coin = coins[a];//コインの額面	（500円から）	 
		        	int count = amount / coin;//支払える枚数の計算
		            amount %= coin;// 残りの金額
		            System.out.println((coin + "円: ") +( count + "枚"));
		        }
		    }
		}

		

		
		
		
		
	


