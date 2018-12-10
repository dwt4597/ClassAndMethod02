package com.biz.classes.exec;

public class ClassExec12 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass07 m = new MyClass07();

		/*
		for (int i = 0; i < 10; i++) {
			int intNum = (int) (Math.random() * 100) + 1;
			m.add(intNum);
		}
		*/
		m.add(10);
		m.add(20);
		m.add(40);
		m.add(60);

		System.out.println(m.sum());
	}

}
