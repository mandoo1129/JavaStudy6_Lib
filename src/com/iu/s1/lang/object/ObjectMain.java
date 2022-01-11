package com.iu.s1.lang.object;

public class ObjectMain {

	public static void main(String[] args) {
		
		ObjectStudy1 objectStudy1 = new ObjectStudy1();
		//참조변수: 객체를 가리키는 주소를 담고 있는 변수
		//참조변수명.멤버
		
		//참조변수명.멤버메서드명 = 호출
		objectStudy1.study1();
		
		Car car = new Car();
		System.out.println("Car: "+ car);
		System.out.println(car.toString());
		
		Object obj = car;
		//모든 클래스의 부모 타입이다.
		//모든 클래스는 object 타입이다.
		
		FireCar fc = new FireCar();
		fc.hashCode();
		obj = fc;
		
		boolean check = car.equals(fc);
		System.out.println(check);
		
		
		
		
		
	

	}

}
