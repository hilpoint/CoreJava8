package ch01;

import java.util.ArrayList;

public class HelloWorld {
	public static double max(double first, double... rest) {
		// ���� �Ķ���ʹ� �׻� �������� �;� �Ѵ�.
		
		double result = first;
		for (double v : rest) result = Math.max(v, result);
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println("Hello world!".length());
		
		// ���׸��� ���������� �� ���� ����
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(1);
		
		// �⺻ Ÿ�԰� ���۷��� Ÿ�԰� ��ȯ�� ���ǻ���
		// !=, == �����ڴ� ��ü ������ ���Ѵ�.
		// ���ڿ� ���� equals ó�� ���ؾ��Ѵ�.
		// if (numbers.get(0) == numbers.get(1))
		
		System.out.println("git test");
	}

}
