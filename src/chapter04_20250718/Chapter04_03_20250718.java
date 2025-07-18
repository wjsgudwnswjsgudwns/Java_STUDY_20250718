package chapter04_20250718;

public class Chapter04_03_20250718 {

	public static void main(String[] args) {
		// 주사위를 굴려서 만약에 3이 나오면 한글로 "3이 나왔습니다"로 출력
		System.out.println(Math.random());
		// 0~1 사이의 수중에서 소수점 16자리까지 가진 수를 랜덤으로 추출해주는 라이브러리
		System.out.println((int) (Math.random()*6) );

		int dice = (int) (Math.random()*6) + 1;
		if (dice==1) {
			System.out.println("1이 나왔습니다.");
		} else if (dice == 2) {
			System.out.println("2가 나왔습니다.");
		}	else if (dice == 3) {
			System.out.println("3이 나왔습니다.");
		}	else if (dice == 4) {
			System.out.println("4가 나왔습니다.");
		}	else if (dice == 5) {
			System.out.println("5가 나왔습니다.");
		}	else { 
			System.out.println("6이 나왔습니다.");
		}
	}

}
