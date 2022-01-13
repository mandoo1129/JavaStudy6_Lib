package com.iu.s3.ex1.member;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

import com.iu.s2.util.token.SeasonDTO;
import com.iu.s3.ex1.MemberDTO;

public class MemberData {
	
	private String data;
	private Scanner sc;
	
	//기본 생성자 선언
	public MemberData() {
		this.sc = new Scanner(System.in);
		this.data="id1-pw1-name1-id1@gmail.com-20-";
		this.data=this.data+"id2 - pw2 - name2 - name2@naver.com-42-";
		this.data=this.data+"id3 - pw3 - name3 - name3@daum.net-36-";
		this.data=this.data+"id4 - pw4 - name4- name4@daum.net-17-";
		System.out.println(this.data);
	}
	
	public MemberDTO removeMember(ArrayList<MemberDTO> ar) {
		//삭제하고 싶은 ID 입력 받아서
		//ArrayList에서 삭제

		MemberDTO memberDTO = null;
		System.out.println("삭제할 ID 입력");
		String id = this.sc.next();
		//int index=-1;
		
		for(int i=0;i<ar.size();i++) {
			if(ar.get(i).getId().equals(id))	{
				//index=i;
				break;
				

			}
		
		memberDTO = ar.remove(i);
		
		
		return memberDTO;
		
	}
	public void addMember(ArrayList<MemberDTO> ar) {
		//새로 추가할 MemberDTO 생성
		//키보드로부터 id, pw, name, email, age 입력 받아서 출력
		//MemberDTO의 멤버변수 값으로 대입
		//매개변수로 받은 ar에 MemberDTO 추가
		MemberDTO memberDTO = new MemberDTO();
		System.out.println("ID 입력");
		memberDTO.setId(sc.next());
		System.out.println("PW 입력");
		memberDTO.setPw(sc.next());
		System.out.println("Name 입력");
		memberDTO.setName(sc.next());
		System.out.println("Email 입력");
		memberDTO.setEmail(sc.next());
		System.out.println("Age 입력");
		memberDTO.setAge(sc.next());
	}
		
	public ArrayList<MemberDTO> init()	{
		//data에 있는 문자열을 StringTokenizer로 파싱해서
		//MemberDTO를 생성해서 멤버변수값으로 대입
		//MemberDTO들을 ArrayList에 담아서 리턴
		System.out.println("Main Branch");

		StringTokenizer st = new StringTokenizer(this.data, "-");
		ArrayList<MemberDTO> ar = new ArrayList<>();
		
		while(st.hasMoreTokens()) {
			MemberDTO memberDTO = new MemberDTO();
			memberDTO.setId(st.nextToken());    
			memberDTO.setPw(st.nextToken());    
			memberDTO.setName(st.nextToken());  
			memberDTO.setEmail(st.nextToken()); 
			memberDTO.setAge(Integer.parseInt(st.nextToken().trim());
			ar.add(memberDTO);
		
		return ar;
	}
		
//		for(int i=0;i<members.length;i++) {
//			MemberDTO memberDTO = new MemberDTO();
//			memberDTO.setId(datas[index++]);    //datas[0] 4  8
//			memberDTO.setPw(datas[index++]);    //datas[1] 5  9
//			memberDTO.setName(datas[index++]);  //datas[2] 6  10
//			memberDTO.setEmail(datas[index++]); //datas[3] 7  11
//			memberDTO.setAge(Integer.parseInt(datas[index++]));
//			members[i]=memberDTO;
//			//index++;
		
		}
		
//		return members;
	}

}