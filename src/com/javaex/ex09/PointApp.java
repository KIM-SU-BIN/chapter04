package com.javaex.ex09;

import java.util.HashMap;
import java.util.Map;

public class PointApp {

	public static void main(String[] args) {
		
		Map<String, Point> pMap = new HashMap<String, Point>();
		
		Point p01 = new Point(3, 3);
		Point p02 = new Point(5, 5);
		Point p03 = new Point(14, 32);
		
		
		pMap.put("정우성", p01);
		pMap.put("이효리", p02);
		pMap.put("박명수", p03);
		
		System.out.println(pMap);						//pMap 전체 출력
		System.out.println(pMap.size());				//개수 출력 : 3
		System.out.println(pMap.toString());			//전체 출력과 동일
		
		//박명수의 x값 출력-> 이전에는 (몇 번째)번호로 출력했지만 여기선 이름을 써야함
		System.out.println(pMap.get("박명수").getX());	
		
		//같은 키값으로 추가
		Point p04 = new Point(100,200);
		pMap.put("정우성", p04);
		System.out.println(pMap.toString());
		
		//전체출력
		//1. 키 목록을 만든다. ["정우성","이효리","박명수"]
		//2. pMap.get("이름")
		
		
		
		
		
		
		
	}

}