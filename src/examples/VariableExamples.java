package examples;

public class VariableExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean myBoolean = false;
		byte myByte = 2;
		short myShort =3;
		char myChar = 'b';
		int myInt = 5;
		float myFloat = 0.25f;
		long myLong = 9999999999L;
		double myDouble = 5.999d;
		
		String myString = new String("This is a String object created by a constructor");
		
		System.out.println("2 + 3 = " + (myByte+myShort));
		myBoolean = myInt < 6;
		System.out.println("Is myInt < 6? " + myBoolean);
		System.out.println("Here's some floating point math! " + (myDouble/myFloat));
		System.out.println("Here's what happens when we divide integers: 5 / 2 = " + (myInt/myByte));
		System.out.println("There's no decimal and no remainder!");
		
		System.out.println("The value of myChar is : " + myChar);
		System.out.println(myString);

	}

}
