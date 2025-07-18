package quiz_04;

public class Quiz_04_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while(true) {
			
			int i = (int) (Math.random()*6);
			int j = (int) (Math.random()*6);
			System.out.println( i +","+ j );
			
			if(i+j==5) {
			break;	
			}
		}
	}

}
