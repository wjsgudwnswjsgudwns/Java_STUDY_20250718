package chapter04_20250718;

public class Chapter04_10_20250721 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i =1;i<=10;i++) {
			if(i%2==0) {
				continue;	// continue를 만나게 되면 밑에 있는 것들은 실행이 안되고, 처음으로 돌아가게 된다. ex)i=2면 출력이 안되고 i=3 
			}
			System.out.println(i);
		}
		
	}

}
