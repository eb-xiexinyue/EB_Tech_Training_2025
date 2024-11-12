package co.jp.chapter06;

public class JavaChapter06 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

//		System.out.println("static int sum(int a.int b)の戻り値は"+sum(1, 2)); 
//		
//		JavaChapter06 demo =new JavaChapter06();
//		
//		System.out.println("int sum(int a.int b)の戻り値は"+"+demo.sum1(1, 2)); 
//    }
//		System.out.println("
//		
//		String[] arr = {"a","b","c"};
//		
//		test(arr);
//		System.out.println("----------");
//		
//		test1("a","b","c");
//		
//        System.out.println("----------");
//		
//		test1("a","b","c","d","e");

	
		
		
		
//		void sum() {
//		}
//		
		
		
//		int sum() {
//			return 0;
//		}
		
//		static int sum(int a,int b) {
//			return a+b;
//		}
		
//		int sum(int a,int b) {
//				return a+b+1;
//				
//		static String combine(String str1,String str2) {
//			String res = str1 + str2;
//			
//			return res;
//		}
//		static void testVoid(String str) {
//			System.out.println(str);
//			return;
//		}
//		
//		static void test(String[] arr) {
//			for(String str : arr) {
//				System.out.println(str);
//			}
//		}
//
//		static void test1(String...str)	 {
//			System.out.println("可変長引数の長さ"+str.length);
//			
//			for(String s: str) {
//				System.out.println(s);
//				
//			}
//			sumOverload();
//			sumOverload(4,5);
//			sumOverload("7","8");
//			
//			float sum = sumOverload(3.0f,4.0f);
//			System.out.println("output from sumOverload(float a,float b)"+sum);
//			
//	}
//	
//	    static void sumOverload() {
//				System.out.println("output from void sumOverload()");
//			}
//		static void sumOverload(int a,int b) {
//				System.out.println("output from sumOverload(int a,int b) is"+(a+b));
//		    }
//	    static void sumOverload(String a,String b) {
//				System.out.println("output from sumOverload(String a,String b) is"+(Integer.valueOf(a)+Integer.valueOf(b)));
//			}
//		 static float sumOverload(float a,float b) {
//		    	return a+b;
//		 }
//		  
//		 sumOverload();}
//		 sumOverload(4,5);
//		 sumOverload("7","8");
//				
//		float sum = sumOverload(3.0f,4.0f);
//	    System.out.println("output from sumOverload(float a,float b)"+sum);
	
//	        sumOverload();
//	        sumOverload(4, 5);
//	        sumOverload("7", "8");

	        float sum = sumOverload(3.0f, 4.0f);
	        System.out.println("output from sumOverload(float a, float b): " + sum);
	        }

	        
	        static void sumOverload() {
	            System.out.println("output from void sumOverload()");
	        }

	        static void sumOverload(int a, int b) {
	            System.out.println("output from sumOverload(int a, int b) is: " + (a + b));
	        }

	        static void sumOverload(String a, String b) {
	            System.out.println("output from sumOverload(String a, String b) is: " + (Integer.valueOf(a) + Integer.valueOf(b)));
	        }

	        static float sumOverload(float a, float b) {
	            return a + b;
	        }
	       
	        
	        System.out.println(fact(5));
}
	        
	        static int fact(int n) {
	        	if(n == 0) {
	        		return 1;
	        	}
	        	else {
	        		return fact(n-1)*n;
	        		
	        	
	        		
	        }

			 	
	        }	
		
	

}
