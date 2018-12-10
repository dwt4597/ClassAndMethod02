package com.biz.classes.exec;

public class ClassExec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass myc = new MyClass();
		int aa = myc.hello(10, 10);
		double bb = myc.hello(30.0, 30.0);
		double cc = bb + aa;
		System.out.println(cc);
		
	}

}
