import lejos.robotics.subsumption.Behavior;
import lejos.robotics.navigation.DifferentialPilot;
import lejos.nxt.Motor;

public class RobotBehavior_MonolithFindButton implements Behavior {
	private boolean suppressed = false;
	private RobotUtils utility = new RobotUtils();
	private boolean done = false;
	DifferentialPilot pilot = new DifferentialPilot(5.5, 14.0, Motor.A, Motor.B);

	public RobotBehavior_MonolithFindButton() {
		
	}

	public boolean takeControl() {
		return !done;
	}

	public void suppress() {
		suppressed = true;
	}

	public void action() {
		suppressed = false;
		pilot.travel(90);
		pilot.rotate(90);
		pilot.travel(30);
		pilot.steer(20, 90, false);
		
		//Aja kunnes  alue
		
		//ajele ympäriinsä
		
		//find grey
		
		//push button
		
		
		
		done = true;
		
	}
		
}
