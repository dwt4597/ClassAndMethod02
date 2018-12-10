package com.biz.classes.exec;

import java.util.*;

public class MyClass06 {
	List<Integer> intList;

	public MyClass06() {
		intList = new ArrayList();
	}

	public void add(int num) {
		intList.add(num);
	}

	void sum() {
		int siz = intList.size();
		int sum = 0;
		for (int i = 0; i < siz; i++) {
			int a = intList.get(i);
			sum += a;
		}
		/*
		 * intSum = 0;
		 * for(int i : intlist){
		 * intSum += i;
		 * }
		 */
		System.out.println(sum);

	}
}
