package quiz_04;

public class Quiz_04_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		for(int i=1; i<=100; i++) {
			if (i%3==0) {
				sum = sum + i;
			}
		}
		System.out.println("1부터 100까지 3의 배수의 총합 : " + sum);
	}

}
