package com.biz.classes.exec;

import java.util.*;

import javax.management.*;

/*
 * List<String> stList 선언
 * 생성자에서 stList 초기화
 * add(String strName, int num)
 * 메서드에서 strName:num 형식의 문자열로 
 * 변환 후 stList에 추가
 */
public class MyClass09 {
	List<String> intList;

	public MyClass09() {
		intList = new ArrayList();
	}

	public void add(String strName, int num) {
		/*
		 * String _t = strName + ":" + num;
		 * stList.add(_t);
		 */
		String.valueOf(num);
		intList.add(strName + ":" + num);
	}
}
