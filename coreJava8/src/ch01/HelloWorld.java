package ch01;

import java.util.ArrayList;

public class HelloWorld {
	public static double max(double first, double... rest) {
		// 가변 파라미터는 항상 마지막에 와야 한다.
		
		double result = first;
		for (double v : rest) result = Math.max(v, result);
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println("Hello world!".length());
		
		// 제네릭은 원시형으로 만 선언 가능
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(1);
		
		// 기본 타입과 레퍼런스 타입간 변환시 주의사항
		// !=, == 연산자는 객체 참조를 비교한다.
		// 문자열 비교인 equals 처럼 비교해야한다.
		// if (numbers.get(0) == numbers.get(1))
		
		System.out.println("git test");
	}

}
