import lejos.robotics.subsumption.Behavior;


public class RobotBehavior_HittedWall implements Behavior {
	private boolean suppressed;
	
	public RobotBehavior_HittedWall() {
		suppressed = false;
	}
	
	public boolean takeControl() {
		return false;
	}
	
	public void suppress() {
		suppressed = true;
	}
	
	public void action() {
		
	}
	
}
