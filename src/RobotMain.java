import lejos.nxt.Button;
import lejos.nxt.LCD;
import lejos.robotics.subsumption.Arbitrator;
import lejos.robotics.subsumption.Behavior;

public class RobotMain {

	public static void main(String[] args) {

		RobotUtils utils = new RobotUtils();
		
		Behavior b1 = new DrivetestBehaviour();
		// Behavior b2 = new BatteryLow(6.5f);
		// Behavior b3 = new HitWall(SensorPort.S2);
		Behavior[] bArray = { b1 };
		Arbitrator arby = new Arbitrator(bArray);
		arby.start();


	}

}
