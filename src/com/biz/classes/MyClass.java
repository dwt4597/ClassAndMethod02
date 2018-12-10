package com.biz.classes;

public class MyClass {

	// 실제로 만들지 않아도
	// 자동으로 생성되는 method (안보이게 선언돼있음)
	// 단순히 (자신)객체를 초기화하는 용도로 주로 사용됨.
	public MyClass() {
		System.out.println("빈 생성자");
	}

	// 매개변수가 있는 생성자는
	// 특별히 어떤 변수나 명령을 실행하고자 할 때 사용함.
	public MyClass(String s) {
		System.out.println(s + " 생성자");
	}

	// 1번 method
	public void hello() {
		System.out.println("Hi");
	}

	// 2번 method
	public void hello(String name) {
		System.out.println(name + "야 안녕???");
	}

}
