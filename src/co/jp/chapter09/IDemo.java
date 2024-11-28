package co.jp.chapter09;

public interface IDemo {
	int id= 1;
	String memo = "IDemo1";
abstract void doInit() ;
void getString();
//void getString() {};实体会报错
//为什么没有实体不会报错？：省略了abstract
//默认是public和abstract，所以可以省略







}
