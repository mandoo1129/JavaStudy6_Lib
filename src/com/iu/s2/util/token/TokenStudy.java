package com.iu.s2.util.token;

import java.util.ArrayList;
import java.util.StringTokenizer; //어느 패키지에 있는 클래스인지를 지정해줌

public class TokenStudy {
	
	public static void main(String[] args) {
		String str = "봄, 16, 여름, 32, 가을, 20, 겨울, -15";
		String [] s = str.split(",");
		
		StringTokenizer st = new StringTokenizer(str, ","); //쉼표 기준으로 자르기
		
		ArrayList<SeasonDTO> ar = new ArrayList<>(); //<> 뒷부분은 생략 가능
		
		
		while(st.hasMoreTokens()) { //자를 토큰이 더 있으면 True
			SeasonDTO seasonDTO = new SeasonDTO();
			String token = st.nextToken().trim();
			seasonDTO.setName(token); //봄
			
			token = st.nextToken(); //16
			seasonDTO.setGion(Integer.parseInt(token.trim()));
			
			ar.add(seasonDTO);
			System.out.println(seasonDTO.getName());
			System.out.println(seasonDTO.getGion());
			
			
		}
		
		for(int i=0;i<ar.size();i++) {
			SeasonDTO seasonDTO = ar.get(i);
			System.out.println(seasonDTO.getName());
			System.out.println(ar.get(i).getGion());
			
		}
		
		
	}

}
