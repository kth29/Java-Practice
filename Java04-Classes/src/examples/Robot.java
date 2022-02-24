package examples;

public class Robot {
	
	//no main method indicates this is NOT the starting point of the app
	
	public Robot() { //a constructor 
		this.maxSpeed = 1;
	}
	
	private int maxSpeed; //instance variable = each Robot object will have its own personal max speed, which is only viewable to the object class
	
	public int getMaxSpeed() { //getter method
		return maxSpeed;
	}
	
	public void setMaxSpeed(int maxSpeed) { //setter method; allows developer to set the range of max speeds
		if (maxSpeed >= 0)
			this.maxSpeed = maxSpeed;
		else
			this.maxSpeed = 0;
		
	}
	
	public void travel() {
		System.out.println("The robot moves a distance of " + maxSpeed + " units.");
	}

}
