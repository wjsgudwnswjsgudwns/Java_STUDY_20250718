package chapter04_20250718;

public class Chapter04_02_20250718 {

	public static void main(String[] args) {
		//점수가 90점 이상이면 수, 80점 이상이면 우, ..., 60점 미만이면 가
		int score = 55;
		if (score>=90) {
			System.out.println("수");		
		} else if (score>=80) {
			System.out.println("우");
		} else if (score>=70) {
			System.out.println("미");
		} else if (score>=60) {
			System.out.println("양");
		} else {
			System.out.println("가");
		}
		
		//value 값이 10이상 20미만이면 통과를 출력
		int value = 15;
		if (10 <= value && value <20) {
		System.out.println("통과");
		}
	}

}
