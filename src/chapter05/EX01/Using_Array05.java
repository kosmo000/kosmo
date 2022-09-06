package chapter05.EX01;

import java.util.Arrays;

public class Using_Array05 {

	public static void main(String[] args) {
		// 1 ~ 500 까지의 3의 배수를 배열에 저장
		// 출력 : 1. 직접 출력, 2. for 출력, 3.Enhanced For, 4. toString()
		// 합계 :		평균 :
		
		int a[] = new int [166];
		for (int i = 0 ,  j = 3 ; i < 166 ; i++ , j+=3) {	// i : index (0,1,2,3,4 )
			a[i] = j;
		}
		for (int i =0 ; i < 166 ; i++) {
			System.out.println(a[i]);
		}
		int count =0;
		for (int i = 0 ,  j = 3; i < a.length ; i++ , j+=3) 	// i : index (0,1,2,3,4 )
			if(j <=500) {
				
			a[i] = j;
			count++;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("===향상된 for 문을 사용해서 출력");
		for (int k : a) {
			System.out.println(k);
		}
		
		System.out.println("== Arrays.toString()를 사용");
		System.out.println(Arrays.toString(a));
		
		int sum2 ;
		int i ;
		for (i = 1, sum2 = 0 ; i <=166; i+=3) {
			sum2 += i ;
			System.out.println("sum2 : " + sum2 +", i: " +i );
		}
		System.out.println("3의 배수의 합계 : " + sum2);
		System.out.println("평균 : "+ sum2/ (double) count);
	}
	

}
