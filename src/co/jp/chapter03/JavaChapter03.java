package co.jp.chapter03;

public class JavaChapter03 {

	public static void main(String[] args) {
		//swtich可以写的if也可以写，但是用if写的不一定可以用switch写出来（switch的局限性）
		//If 文
		int a = 10;
		int b = 20;
		if (a>b) {
			System.out.println("a>b");
		}
		else if(a == b){ 
			System.out.println("a==b");
		}
		else if (a < b) {
			System.out.println("a<b");	
		}
		else if (a  == b-10) {
			System.out.println("a==b-10");	//只要if条件判断为true，则停止处理，后续处理忽视
		}
		
		
		//Swtich文 分支（case）文，只能判断一个值而不是If一样的范围
		int age = 2;
		switch (age) {
		case 30:
			System.out.println("30true");	
			break;//break属于swtich语法限制，意思为跳出当前分支，如果没有的话会继续执行

		case 20:
			System.out.println("20true");	
			break;
			case 1:
			case 2:
			case 3:
				//复数条件可用这种写法，不然会输出好几遍
				System.out.println("3岁以前");
			break;
			default://所有case都不匹配的情况转移到此，通常写在最后面，虽然不写也没问题，但一般都要写
			System.out.println("false");	
		}
		
		
		//for文（循环语法）for (初始化变量; 循环继续的条件; 每次循环所产生的变化)
		for (int i = 0; i < 10; i++) {
			System.out.println("i is "+ i);	
		}
		//尽量避免嵌套for
		for (int m= 0; m < 10; m++) {
			for (int n= 0; n < 10; n++) {
				if(m == n) {
			System.out.print(m+""+n+"  " );	
				}
			}
			System.out.println("\n");	
		}
		//  省略写法
		int j = 0;
		for( ; j < 10; j++) {
			System.out.println("j is "+ j);	
			}
		
		int k = 0;
		for( ; k < 10; ) {
			System.out.println("k is "+ k);	
			k++;
			}
		
		int l = 0;
		for( ; ; ) {
			if (l<10) {
			System.out.println("l is "+ l);	
			l++;
			}
			else {break;}//如果没有这个break，则コンソール右上角的红方块不会熄灭，程序不会停
			}
		//while循环 条件が満たされる限りループする時に使用
		int whil = 0;
		while (whil < 10) {
			System.out.println("whil is "+ whil);
			whil ++;
		}
		
		//do while 循环  先做一次处理然后再做一次判断 (先do再判断while)
		int dowhil = 0;
		do {
			System.out.println("dowhil is "+ dowhil);
		}
		while(dowhil < 0);

        for (int m = 0; m < 10; m++) {
            for (int n = 0; n < 10; n++) {
                if (m==n||m+n==9) {
                    
                    System.out.print(m + "" + n + "\t");
                }
                else {System.out.print("\t");}
            }
            System.out.print("\n");
        }
        System.out.println("范例");
        
        for (int m = 0; m < 9; m++) {
            for (int n = 0; n < 9; n++) {
                if (m==n||m+n==8||n==4||m==4) {
                    
                    System.out.print(m + "" + n + "\t");
                }
                else {System.out.print("\t");}
            }
            System.out.print("\n");
        }
        
        System.out.println("范例");
        
        for(int m=0;m<9;m++) {
			for(int n=0;n<9;n++) {
				if(m==4 || n==4 || m==n || m+n==8) {
					System.out.print(m+""+n+"\t");
				}
				else {
					System.out.print("\t");
				}

			}
			System.out.print("\n");    
		}
        
        System.out.println("范2");
        
        int length = 9;
        for(int m=0;m<length;m++) {
			for(int n=0;n<length;n++) {
				if(m+n==4 || m+n==12 || m-n==4 || n-m==4) {
					System.out.print(m+""+n+"\t");
				}
				else {
					System.out.print("\t");
				}

			}
			System.out.print("\n");    
		}

		
		//System.out.print(Math.abs(-5));   //绝对值 
		
		
		
		
		
		//continue 函数 跳过当前
		for(int x=0;x<10;x++) {
			if(x==5) {
				System.out.print("x=5"); 
				continue;
			}
			else {
				System.out.print("x=!5"); 
			}
			
		}
		
		
		
		
		}
	}


