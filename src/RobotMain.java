import lejos.nxt.Button;
import lejos.nxt.LCD;
import lejos.robotics.subsumption.Arbitrator;
import lejos.robotics.subsumption.Behavior;

public class RobotMain {

	public static void main(String[] args) {
		Button.waitForAnyPress();
		RobotUtils utils = new RobotUtils();

		utils.showMessage();
		Behavior b1 = new DrivetestBehaviour();
		Behavior b2 = new RobotBehavior_Kauhatesti();
		Behavior b3 = new RobotBehavior_HittedWall();
		Behavior[] bArray = { b2, b3 };
		Arbitrator arby = new Arbitrator(bArray);
		arby.start();

	}

}
