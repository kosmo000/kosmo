package Chapter07.EX01;

import java.util.Arrays;

public class Using_Method05 {
	
	//배열을 매개변수로 가지는 메소드
	static void printArray(int [] a ) {
		System.out.println(Arrays.toString(a));
	}
	
	static void printArrString(String[] s) {
		//메소드의 매개변수로 들어온 배열을 출력
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i] + "");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// 배열을 매개변수로 가지는 메소드
		
		// 배열을 매개변수로 가지는 메소드 호출
		int [] a = new int[] {1,2,3};
		
		printArray (a);		//1. 메소드 호출시 배열 변수에 값을 할당
		
		printArray (new int [] {4,5,6});  //2. 객체 생성시 배열 변수에 값을 인풋
		
		//String 배열을 선언후 초기화 값을 할당후 메소드 호출
		System.out.println("==========");
		String [] ss = new String[] {"안녕", "하세요", "내일은", "연휴", "입니다"};
		printArrString(ss);
		
		printArrString(new String[] {"내일", "부터", "추석", "연휴", "입니다"});
	}

}
