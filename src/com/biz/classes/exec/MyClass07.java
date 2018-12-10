package com.biz.classes.exec;

import java.util.*;

public class MyClass07 {

	List<Integer> intList;

	public MyClass07() {
		intList = new ArrayList();

	}

	public void add(int num) {
		intList.add(num);
	}

	public int sum() {
		int siz = intList.size();
		int sum = 0;
		for (int i = 0; i < siz; i++) {
			int a = intList.get(i);
			sum += a;
		}
		return sum;
	}
}
