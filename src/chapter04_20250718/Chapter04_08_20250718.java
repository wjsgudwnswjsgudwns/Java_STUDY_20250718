package chapter04_20250718;

public class Chapter04_08_20250718 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1; i<=5; i++) {
			System.out.println("*");
		}
		
		System.out.println("================================================================================");
		
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("================================================================================");
		
		for(int i=1;i<=4;i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("================================================================================");
		
		for(int i=4;i>=1;i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
