package co.jp.chapter03;

public class JavaHomework03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//質問１
		int a = 56;
		System.out.println("成績ランキング判断。入力値=" + a);
		if (a >= 90) {
			System.out.println("A");
		} else if (a >= 80 && a < 90 ) {
			System.out.println("B");
		}
		else if (a >= 70 && a < 80 ) {
			System.out.println("C");
		}
		else if (a >= 60 && a < 70 ) {
			System.out.println("D");
		}else {
			System.out.println("E");
		}
		
		//質問2: 最も少ないコイン数は13です。
		int total = 3340;
		int cnt = 0;
		int[] arr = {1,5,10,100,500};
		for (int i = arr.length - 1, temp ; i >= 0 ; i--) {
			cnt += total / arr[i];
			temp = total %  arr[i];
			if (temp == 0) break;
			total = temp;
		}
		System.out.println(cnt);

	}

}
