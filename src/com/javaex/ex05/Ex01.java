package com.javaex.ex05;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {
		
		Set<Integer> iset = new HashSet<Integer>();		//기본자료형은 사용불가
		
		//int i =12;
		Integer i01 = 4;
		Integer i02 = 5;
		Integer i03 = 6;
		
		iset.add(i01);
		iset.add(i02);
		iset.add(i03);
		
		System.out.println(iset.size());		//총 개수
		System.out.println(iset.toString());
		System.out.println("=============");
		
		for(Integer num : iset) {
			System.out.println(num.toString());
		}
		
	}

}
