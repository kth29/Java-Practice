package examples;

public class LoopControl {
	
	public static void main(String[] args) {
		
		int count = 0;
		while (count <=10) {
			
			if (count ==9)
				break;
			
			if (count %2 == 0)
				continue;
			else
				System.out.println("count");
		}
		
		System.out.println("We have exited the loop");
	}

}
