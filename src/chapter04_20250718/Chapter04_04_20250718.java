package chapter04_20250718;

public class Chapter04_04_20250718 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dice = (int) (Math.random()*6) + 1;
		
		switch(dice) {
			case 1:
				System.out.println("1이 나왔습니다.");
				break;
			case 2:
				System.out.println("2가 나왔습니다.");
				break;
			case 3:
				System.out.println("3이 나왔습니다.");
				break;
			case 4:
				System.out.println("4가 나왔습니다.");
				break;
			case 5:
				System.out.println("5가 나왔습니다.");
				break;
			case 6:
				System.out.println("6이 나왔습니다.");
				break;
			default :
				System.out.println("주사위에서 나올 수 없는 숫자가 입력 되었습니다.");
		}
	}

}
