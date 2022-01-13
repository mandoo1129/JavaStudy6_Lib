package com.iu.s2.util.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class SetStudy {
	
	public void study4() {
		HashSet<Integer> hs = new HashSet<>();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		
		//집어넣은 걸 하나씩 꺼내오고 싶을 때 Iterator 사용
		Iterator<Integer> it = hs.iterator(); //Set에 있는 1,2,3을 가지고 있음
		//Iterator 안에 요소가 있는지 검사
		while(it.hasNext()) {
			int num = it.next(); //다음 요소를 주세요
			System.out.println(num);
			
			
		}
	}

	public void study3() {
		
		Random random = new Random();
		HashSet<Integer> hs = new HashSet<>();
		
//		for(int i=0;i<6;i++) { 
//			int num = random.nextInt(45)+1;
//			hs.add(num);
			
//		}
		while(hs.size() !=6) {
			int num = random.nextInt(45)+1;
			hs.add(num);
		}
		System.out.println(hs);
		
	}

	public void study2() {
		// Random
		Random random = new Random();
		HashSet<Integer> hs = new HashSet<>();
		

		// Lotto 번호를 랜덤 1~45 6개를 모두 뽑고 List에 담아서
		ArrayList<Integer> ar = new ArrayList<>();

		for(int i=0;i<6;i++) {
			int num = random.nextInt(45)+1; // (45)=0~45
			ar.add(num);

		}

		System.out.println(ar);

	}

	public void study1() {
		HashSet<Integer> hs = new HashSet<>();
		hs.add(1);
		hs.add(2);
		hs.add(1);
		hs.remove(2);

		ArrayList<Integer> ar = new ArrayList<>();
		ar.add(100);
		ar.add(200);
		ar.add(100); // 중복 데이터를 허용하지 않음

		System.out.println(ar);
		System.out.println(hs);
		System.out.println(hs.size());

	}
}
