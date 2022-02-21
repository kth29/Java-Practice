package examples;

public class ArraysExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] firstArray = new int[3]; //creates new size-3 array--must declare each index
		firstArray[0]=2;
		firstArray[1]=4;
		firstArray[2]=6;
		
		int [] secondArray = {1, 2, 3}; //creates new size-3 array while defining index values
		
		System.out.println("The value in firstArray[2] is " + firstArray[2]);
		System.out.println("The length of secondArray is " + secondArray.length);

	}

}
