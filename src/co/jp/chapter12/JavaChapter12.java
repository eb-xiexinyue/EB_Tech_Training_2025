package co.jp.chapter12;

public class JavaChapter12{
	public static void main(String[] args) throws MyException {
		//异常捕获
		try {
		System.out.println(20/0);//可能出现意外的处理
		String.valueOf(false);
		
		testException();


		}
		catch(ArithmeticException | NullPointerException e) {
			System.out.println("it‘s a shit");//出现算数意外怎么显示？
		}
		catch(Exception e) {//exception为上述的父类，大范围异常检测，但是第一个写的话后面就会エラー（到達不可能）
			System.out.println("エラー");//出现意外
		}
		finally {
			System.out.println("process end normally");
		}
		
		
		
		
		
		
	}
	public static void testException()throws MyException {
		throw new MyException();
	}

	}


