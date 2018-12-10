package com.biz.classes.exec;

import java.util.*;

public class MyClass08 {

	List<String> intList;

	public MyClass08() {
		intList = new ArrayList();
	}

	public void add(int num) {
		intList.add(num + "");
	}

	public int sum() {
		int siz = intList.size();
		String sum = "";
		for (int i = 0; i < siz; i++) {
			String a = intList.get(i);
			sum += a;
		}
		/*
		 * intSum = 0; for(int i : intlist){ intSum += i; }
		 */
		return Integer.valueOf(sum);

	}
}
