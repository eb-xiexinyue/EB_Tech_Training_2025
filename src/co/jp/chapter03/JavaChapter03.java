package co.jp.chapter03;

public class JavaChapter03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

//		int a = 1;
//		int b = 2;
//		
//		if(a>b) {
//			System.out.println("a>b");
//		}
//		else { //a<=b
//			System.out.println("a<=b");
//		}
		
//		int c = 200;
//		int d = 300;
		
//		if(c>d) {
//			System.out.println("c>d");
//		}
//		else if(c==d) {
//			System.out.println("c==d");
//		}
//		else if(c==d-1) {
//			System.out.println("c==d-1");
//		}
//		else {
//			System.out.println("c<d");
//		}
		
//		int num = 15;
		
//		switch(num) {
//			case 1: 
//				System.out.println("num is 1");
//				break;
//			case 2: 
//				System.out.println("num is 2");
//				break;
//			case 3: 
//			case 4:
//			case 5:
//				System.out.println("num > 2");
//				break;
//			default:
//				System.out.println("num > 5 (default)");
//				break;
//		}
		
		
//		for(int i=0;i<0;i++) {
//			System.out.println("i is "+i);
//		}
		
//		int i= 0;
//		for(;i<10;i++) {
//			System.out.println("i is "+i);
//		}
		
//		int i= 0;
//		for(;i<10;) {
//			System.out.println("i is "+i);
//			i++;
//		}
		
//		int i= 0;
//		for(;;) {
//			if(i<10) {
//				System.out.println("i is "+i);
//				i++;	
//			}
//			else {
//				break;
//			}
//		}
		
//		int i = 0;
//		while(i<0) {
//			System.out.println("i is "+i);
//			i++;
//		}
		
//		int j=0;		
//		do {
//			System.out.println("j is "+j);
//			j++;
//		}while(j<0);
		
//		for(int i=0;i<10;i++) {
//			if(i%2==0) {
//				System.out.println(i);
//			}
//		}
		
//		for(int i=0;i<9;i++) {
//			for(int j=0;j<9;j++) {
//				if(i==4 || j==4 || i==j || i+j==8) {
//					System.out.print(i+""+j+"\t");
//				}
//				else {
//					System.out.print("\t");
//				}
//			}
//			System.out.print("\n");
//		}
		
//		for(int i=0;i<9;i++) {
//			for(int j=0;j<9;j++) {
//				if(Math.abs(i-4) + Math.abs(j-4) == 4) {
//					System.out.print(i+""+j+"\t");
//				}
//				else {
//					System.out.print("\t");
//				}
//			}
//			System.out.print("\n");
//		}
		
//		for(int i=0;i<10;i++) {
//			for(int j=0;j<10;j++) {
//				if(Math.abs(i-4.5) + Math.abs(j-4.5) == 5) {
//					System.out.print(i+""+j+"\t");
//				}
//				else {
//					System.out.print("\t");
//				}
//			}
//			System.out.print("\n");
//		}
		
		int len = 7;
		int div = 2;
		int startIndex = 0;
		float offset = 1.0f;
		String blank = "";
//		String tabStr = "\t";
//		String lineStr = "\n";
		char tabStr = '\t';
		char lineStr = '\n';
		
		
		float center = ((float)len - offset ) / div;
		int distance = len / div;
		
		for(int i=startIndex;i<len;i++) {
			for(int j=startIndex;j<len;j++) {
				if(Math.abs(i-center) + Math.abs(j-center) == distance) {
					System.out.print(i+blank+j+tabStr);
				}
				else {
					System.out.print(tabStr);
				}
			}
			System.out.print(lineStr);
		}
		
		for(int x=0;x<10;x++) {
			if(x==5) {
				System.out.println("x is 5");
				continue;
			}
			else {
				System.out.println("x is not 5, x is "+x);
			}
		}
	}
}
