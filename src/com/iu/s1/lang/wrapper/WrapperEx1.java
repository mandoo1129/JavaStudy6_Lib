package com.iu.s1.lang.wrapper;

public class WrapperEx1 {
	
	public void ex2() {
		//키보드로 부터 주민등록번호 입력
		// 9  7  1 2  2  4 - 1 2  3  4  5  6       7 - 마지막 번호는 체크용 번호
		//*2  3  4 5  6  7   8 9  2  3  4  5
		// 18 21 4 10 12 28  8 18 6  12 20 24
		// 결과를 모두 더함 ex) 	122
		
		//2. 모두 더한 결과값을 11로 나누어서 나머지를 구함
		//   122/11  -> 11 ....1
		
		//3. 11로 나눈 나머지값을 11에서 빼고 그 값을 체크용 번호와 같은지 비교
		//   11-1 =10 == 7
		//4. 만약에 결과값이 두자리면 결과값을 다시 10으로 나누어서 그 나머지값을
		//   체크용번호랑 같은지 비교
		//   10 /10 --- 0 == 7
		// 같으면 정상적인 주민번호, 아니면 잘못된 번호
		System.out.println("주민번호 입력");
		String jumin = sc.next();
		System.out.println(jumin);
		jumin = "971224-1234567";
		
		for(int i=0,i<jumin.length();i++) {
		String result = jumin.substring(i, i+1);
		System.out.println(result);
		
	
	}
	
	
	public void ex1() {
		
		//나이를 대충 계산
		//이번년도 - 출생년도
//		age = 2022 - 출생년도
		// 남자? 여자?
		String se = "Woman";
		if(ss%2==1) {
			se ="Man";
		}
		
		//3-5 : 계절 봄
		//6-8 :     여름
		//9-11:     가을
		//12-3:     겨울
		
		String result = "";
		int season = Integer.parseInt(jumin.substring(2. 4))
				
		
		String jumin = sc.next();
		System.out.println(jumin);
		jumin = "971224-1234567";
		int age = 0;
		int year= 0;
		//키보드로 부터 주민등록 번호 입력
		// 011224-1234567
		String y = jumin.substring(0, 1);
//		char ch1 = jumin.charArt(0); 
//		char ch2 = jumin.charArt(1);
//		String y = ""+ ch1 + ch2;
		year = Integer.parseInt(y);
		System.out.println(year+1);
		
		
	}

}