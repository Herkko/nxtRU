import lejos.robotics.subsumption.Behavior;


public class RobotBehavior_HittedWall implements Behavior {
	private boolean suppressed = false;
	private RobotUtils utility = new RobotUtils();
	 
	
	public RobotBehavior_HittedWall() {
		
	}
	
	public boolean takeControl() {
		return utility.touchSensorPressed();
	}
	
	public void suppress() {
		suppressed = true;
	}
	
	public void action() {
		suppressed = false;
		
		utility.turnLef(90);
		
	}
	
}
