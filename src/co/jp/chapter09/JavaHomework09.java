package co.jp.chapter09;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class JavaHomework09 {
//質問１︓以下ソースにラムダ式の使う場所を解釈してください。
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		JFrame window = new JFrame("DCNet Java 教育");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(800, 600);
		JButton btn = new JButton("hello world");
		window.getContentPane().add(btn);
		btn.addActionListener((ActionEvent e) -> {
			System.out.println("ボタンクリックしました。");//Answer:このラムダ式の役割は、匿名内部クラスを作成して ActionListener インターフェースを実装することです。ボタンがクリックされたイベントを検知すると、「ボタンクリックしました。」を出力します。
		});
		window.setVisible(true);

//質問２︓以下ソースに匿名クラスの利⽤する⾏は︖

			new Thread() {
				@Override
				public void run() {
					System.out.println("thread running...");
				}
			}.start();//Answer:このコードでは、Thread クラスを継承した匿名クラスを作成しています。具体的に、new Thread() によって匿名クラスのインスタンスが生成され、その内部で run メソッドがオーバーライドされています。この匿名クラスのインスタンスは、.start() メソッドを呼び出すことでスレッドとして実行されます。
		}



}
