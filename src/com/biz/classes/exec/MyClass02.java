package com.biz.classes.exec;

import java.util.*;

public class MyClass02 {
	// member 변수 영역
	List<String> stList;

	// 생성자 부분에 각종 변수나 초기값을 설정하는
	// 코드를 작성하는 부분
	public MyClass02() {
		stList = new ArrayList();
	}

	public void hello(String strName) {
		// stList는 생성자에서 초기화가 되어
		// MyClass02 클래스의 어떤 위치에서나
		// 읽고 쓰기가 가능한 상태가 된다.
		// -> 여기에도 new ArrayList(); 할 필요 x
		stList.add(strName);

	}

	public void view() {
		int intLen = stList.size();
		for (int i = 0; i < intLen; i++) {
			System.out.println(stList.get(i));
		}
		/*
		 * for(String s : stList){ sysout(s); }
		 */
	}

}
