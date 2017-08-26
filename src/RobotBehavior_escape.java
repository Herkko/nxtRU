
import lejos.robotics.subsumption.Behavior;

public class RobotBehavior_escape implements Behavior {
	private boolean suppressed = false;
	private RobotUtils utility = new RobotUtils();;

	public RobotBehavior_escape() {
	
	}

	public boolean takeControl() {
		return utility.escapeDown();
	}

	public void suppress() {
		suppressed = true;
	}

	public void action() {
		System.exit(0);
	}

}
