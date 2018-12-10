package com.biz.classes.exec;

public class ClassExec14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyClass09 m = new MyClass09();
		m.add("이준수", 200);
		m.add("삼준수", 300);
		m.add("사준수", 400);

		int sz = m.intList.size();
		for (int i = 0; i < sz; i++) {
			System.out.println(m.intList.get(i));
		}
	}

}
