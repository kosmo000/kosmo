package chapter04.EX06;

public class Using_do_while {

	public static void main(String[] args) {
		//while : 조건을 비교후 실행문을 실행;
		
		/* do {
		 *		실행문
		 *	} while (조건)
		 */
		// do while : 1번은 실행후 조건을 비교후 실행;
		
		/*	do {
		 * 		실행문 ;
		 * 		} while (조건);
		 */
		//1. while vs do while 비교
		int a;
		a = 11;
		System.out.println("====while 문 (조건이 참일때만 실행문 실행)========");
		while (a < 10) {
			System.out.println(a + " ");
			a++;
		}
		System.out.println();
		
		System.out.println("===do while : 조건과 상관없이 실행문을 1번 실행후"
				+ ", 조건이 참이면 반복");
		a = 11;
		do {
			System.out.println(a + " ");
			a++;
		}while (a < 10);

		System.out.println();
		// while 문과 do while 문 10번 실행
		
		a = 0;
		while ( a < 10 ) {
			System.out.println(a + " ");
			a++;
		}
		System.out.println();
		System.out.println("====do while======");
		
		a = 0;
		do {
			System.out.println(a + " ");
			a++;
		}while (a < 10);
	}

}
