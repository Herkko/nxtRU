import lejos.robotics.subsumption.Behavior;
import lejos.nxt.TouchSensor;


public class RobotBehavior_HittedWall implements Behavior {
	private boolean suppressed;
	private RobotUtils utility;
	
	public RobotBehavior_HittedWall() {
		suppressed = false;
		utility = new RobotUtils();
	}
	
	public boolean takeControl() {
		return utility.touchSensorIsPressed();
	}
	
	public void suppress() {
		suppressed = true;
	}
	
	public void action() {
		suppressed = false;
		
		utility.turnLeft(90);
		
	}
	
}
