package com.iu.s4.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionMain1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력");
		int num = 200;
		try { //문제가 발생할 것 같은 영역
			int age = sc.nextInt();
			//throw new InputMismatchException();

			int result = num / age;
			//throw new InputMismatchException();

			System.out.println("Age: " + age);
			System.out.println("Result: " + result);

		}catch(InputMismatchException exception) {
			System.out.println("숫자만 입력하세요");
		}catch(ArithmeticException exception) {
			System.out.println("0으로 나눌 수 없어요");
		}catch(Exception exception) { //둘 다 아니면 여기서 받아라
			System.out.println("알 수 없는 예외 발생");
		}catch(Throwable exception) { //이것도 아니면 제일 부모인
			System.out.println("모든 예외는 여기서 처리");
		}
	}
}

