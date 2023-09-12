package car;
import tire.Tire;
public class Car {
	public Tire fronLeftTire = new Tire("앞 왼쪽",5);
	public Tire fronRightTire = new Tire("앞 오른쪽",1);
	public Tire backLeftTire = new Tire("뒤 왼쪽",4);
	public Tire backRightTire = new Tire("뒤 오른쪽",3);
	
	public int run() {
		System.out.println("자동차가 달립니다.");
		if(fronLeftTire.roll()== false) {stop(); return 1;};
		if(fronRightTire.roll()== false) {stop(); return 2;};
		if(backLeftTire.roll()== false) {stop(); return 1;};
		if(backRightTire.roll()== false) {stop(); return 1;};
		return 0;
	}
	
	void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
