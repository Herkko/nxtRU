import lejos.robotics.subsumption.Behavior;
import lejos.nxt.TouchSensor;


public class RobotBehavior_HittedWall implements Behavior {
	private boolean suppressed;
	
	public RobotBehavior_HittedWall() {
		suppressed = false;
		
	}
	
	public boolean takeControl() {
		return utils.touchPressed();
	}
	
	public void suppress() {
		suppressed = true;
	}
	
	public void action() {
		
	}
	
}
