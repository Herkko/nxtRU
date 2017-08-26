import lejos.nxt.LCD;
import lejos.nxt.Motor;
import lejos.nxt.Button;


public class RobotUtils {
	
	public RobotUtils(){
		
		
	}

	
	
	
	public void liikuEteen() {
		Motor.A.forward();
		Motor.B.forward();
	}
	
	public void liikuTaakse() {
		Motor.A.backward();
		Motor.B.backward();
		
	}
	
	public void kaannyVasemmalle(int astemaara) {
		Motor.A.forward();
		
	}
	
	public void kaannyOikealle(int astemaara ) {
		Motor.B.forward();
	}
	
	public void kauhaKiinni() {
		Motor.C.rotate(90);
		
	}
	public void kauhaAuki() {
		Motor.C.rotate(90);
	}
	
	
}
