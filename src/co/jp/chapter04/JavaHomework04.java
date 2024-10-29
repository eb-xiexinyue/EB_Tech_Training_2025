package co.jp.chapter04;

public class JavaHomework04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//問題1: 0 0 0 0
		//問題2: 5 6
		/*問題3: 0 0 0
				0 0 0
		*/
		//問題4: 配列の各要素を一行ずつ出力する
		//問題５: 100 0
		//問題6: 0
		//問題7: 
		int[][] arr = {{1,2,3}, {1,2,3}};
		int sum = 0, mul = 1;
		for (var e1 : arr) {
			for (var e2 : e1) {
				sum += e2;
				mul *= e2;
			}
		}
		System.out.println("和は:" + sum);
		System.out.println("積は:" + mul);
		
	}

}
