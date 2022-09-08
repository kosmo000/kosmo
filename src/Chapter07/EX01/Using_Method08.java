package Chapter07.EX01;

import java.util.Arrays;

public class Using_Method08 {
	
	//가변 길이 배열 매개변수
	static void method1 ( int...values) {	//가변 길이 배열 입력 매개변수
		/*	For 문으로 출력
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i] + " ");
		} 
		System.out.println();
		*/
		
		/*	Enhanced For 문으로 출력
		for (int k : values) {
			System.out.print( k + " ");
		}
		System.out.println();
		*/
		
		System.out.println();
	}
	
	static void method2 (String...values) {
		//임의의 문자열을 입력 받아 출력
		//	For 문으로 출력
		/*
		for (int i = 0; i < values.length; i++) {
			System.out.print(values[i] + " ");
		} 
		System.out.println();
		*/
		
		/*	Enhanced For 문으로 출력
		for (int k : values) {
			System.out.print( k + " ");
		}
		System.out.println();
		*/
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		// 가변 길이 메소드 (FlexableSizeArray Argument )

		method1 (1,2);
		method1 (1,2,3,4,5);
		method1 (1,2,3,4,5,6,7,8,9,10);	
		
		System.out.println("=============");
		
		method2("강감찬", "이순신", "홍길동");
		method2("호랑이", "토끼");
		method2("금붕어", "가물치", "잉어", "악어", "붕어");
		
	}
		

}
