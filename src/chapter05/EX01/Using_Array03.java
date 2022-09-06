package chapter05.EX01;

import java.util.Arrays;

public class Using_Array03 {

	public static void main(String[] args) {
		//한국을 빛낸 5명의 위인들만 s String 배열에 저장 후 4가지로 출력
		

	
	//2. 배열의 값을 할당.
	String[] s = new String[5];
	s[0] ="이순신";
	s[1] ="장보고";
	s[2] ="강감찬";
	s[3] ="단군";
	s[4] ="박혁거세";
	
	
	//3. 배열 방의 값을 출력
		//3-1 직접 출력
	System.out.println(s[1]);
	System.out.println(s.length); 	//배열 방의 갯수 : 6
	
	System.out.println("==for 문을 사용해서 출력==");
	for(int i=0; i < s.length ; i++) {
		System.out.println(s[i]);
	}
	System.out.println("======");
	//for 문을 사용하면 원하는 바의 값만 출력할 수 있다.
	for ( int i=0 ; i < 5 ; i++) {
		System.out.println(s[i]);
	}
	
	System.out.println("3-3. 향상된 for 문 ");
	for ( String k : s) {
		System.out.println(k);
	}
	
	System.out.println("3-4. Arrays.toString(s)");
	System.out.println(Arrays.toString(s));
	
	}

}
