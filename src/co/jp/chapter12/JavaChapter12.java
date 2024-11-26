package co.jp.chapter12;

public class JavaChapter12 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try {
			//System.out.println(20/0);
			
			testException();
		}
		catch(ArithmeticException | NullPointerException e) {
			System.out.println("ArithmeticException occur! Catch succeed!");
		} catch (MyException e) {
			// TODO 自動生成された catch ブロック
			System.out.println("MyException occur! Catch succeed!");
		}
		finally {
			System.out.println("Process end normally.");
		}
	}
	
	public static void testException() throws MyException {
		throw new MyException();
	}

}
