package com.javaex.ex04;

import java.util.ArrayList;

public class MyListApp {

	public static void main(String[] args) {
		
		 ArrayList<Point> pList = new ArrayList<Point>();
		
		Point p01 = new Point(3, 5);
		Point p02 = new Point(13, 15);
		Point p03 = new Point(113, 115);
		
		Point p04 = new Point(100, 101);
		
		//Circle c01 = new Circle(5);
		
		pList.add(p01);
		pList.add(p02);
		pList.add(p03);
		//pList.add(c01);  => Circle 담을 수 없음
		
		System.out.println(pList.size());		//갯수 의미
		
		System.out.println(pList.get(0).getX()); 			//(0)은 방 번호를 의미함
		System.out.println(pList.get(0).getY());
		System.out.println(pList.get(0).toString()); 	
		
		System.out.println("=============================");
		for(int i=0; i<pList.size(); i++) {
			System.out.println(pList.get(i).toString());
		}
		
		pList.remove(1); 		//(1)방번호이며, 해당 방을 삭제후 출력
		//pList.remove(p02);		//이렇게 써도 됨. 그러나 번호 알기 어려우므로 위의 방식을 더 많이 사용!
		
		System.out.println("=============================");
		for(int i=0; i<pList.size(); i++) {
			System.out.println(pList.get(i).toString());
			}
		
		System.out.println("---------------------------------");
		System.out.println(pList.toString()); 		//Point toString() 과 구분할것
		
		System.out.println("=============================");
		//for의 다른 표현법 ==>> 향상된 for문
		for(Point p : pList) {
			System.out.println(p.toString());
			System.out.println(p.getX());
			System.out.println(p.getY());
		}
		
		System.out.println("---------------------------------");
		//p04 를 2번째 방번호 1번 [1]째 추가
		//pList.add(p04)
		pList.add(1, p04);
		System.out.println(pList.toString());
		
		
	}

}
