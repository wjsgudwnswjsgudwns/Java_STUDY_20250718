package chapter04_20250718;

public class Chapter04_05_20250718 {

	public static void main(String[] args) {
		
//		System.out.println("안녕하세요");
//		System.out.println("안녕하세요");
//		System.out.println("안녕하세요");
//		System.out.println("안녕하세요");
//		System.out.println("안녕하세요");
		
		// 안녕하세요를 5번 출력
		for(int i=1; i<=5; i++) {			// 반복문이 멈추기 위한 조건을 생각해라
			System.out.println("안녕하세요");
		}
		
		System.out.println("------------------------------------------------------------------");
		
		//1부터 100사이의 짝수만 출력
		for(int i=2; i<=100; i += 2) {
			System.out.println(i);
		}
		
		System.out.println("------------------------------------------------------------------");
		
		//1부터 100사이의 홀수만 출력
		for(int i=1; i<=100; i += 2) {
			System.out.println(i);
		}
		
		System.out.println("------------------------------------------------------------------");
		
		int sum = 0;
		//1부터 100까지의 모든 수의 합을 구하시오.
		for(int i=1; i<=100; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		
		System.out.println("------------------------------------------------------------------");
		
		//1부터 100까지 사이의 짝수
		
		for(int i=1; i<=100; i++) {
			if (i%2 == 0) {
				System.out.println(i);
			}
		}
		
		System.out.println("------------------------------------------------------------------");
		
		//1부터 100까지 사이의 홀수
		
		for(int i=1; i<=100; i++) {
			if (i%2 == 1) {
				System.out.println(i);
			}
		}
		
	}

}
