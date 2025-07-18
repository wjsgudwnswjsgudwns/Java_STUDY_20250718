package chapter04_20250718;

public class Chapter04_09_20250718 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 1; i<=5; i++) {	// 반복 횟수가 포인트
			System.out.println(i);
		}
		
		int i=1;
		while(i<=5) {	// 반복 조건이 포인트
			System.out.println(i);
			i++;
		}
		
		
		int kor=80;
		do {	// 일단 1번은 실행시키고 조건문을 볼때 사용, 자주 쓰진 않음
			System.out.println("코리아 파이팅");
		} while(kor>=100);
		
	}

}
