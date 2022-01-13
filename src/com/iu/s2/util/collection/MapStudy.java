package com.iu.s2.util.collection;

import java.util.HashMap;

public class MapStudy {
	
	public void study1() {
		//HashMap
		HashMap<String, Integer> map = new HashMap<>();
		
		//put
		map.put("f1", 1);
		map.put("f2", 2);
		map.put("f3", 1); //V는 중복 혀용
		
		System.out.println(map);
		
		Integer num = map.get("f2");
		System.out.println(num);
		
		map.remove("f3");
		System.out.println(map);
		
		map.put("f1", 100); //똑같은 데이터로 넣으면 수정이 됨
		System.out.println(map);
		
		//없는 키로 꺼내면 null이 출력
		Integer n = map.get("test");
		System.out.println("N: "+ n);
		
		map.clear();
		System.out.println(map);
		
		String name="k5";
		map.put(name, null); //Integer 타입이라 null 입력 가능
		System.out.println(map);
		
		
		
		
	}

}
