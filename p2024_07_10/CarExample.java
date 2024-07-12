package p2024_07_10;

//p278 ~ 279
class Car{
	// 필드
	int gas;			// 0 으로 초기화
	
	// 메소드
	void setGas(int gas) {	// int gas = 5
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		System.out.println("gas가 있습니다.");
		return true;
	}
	
	void run() {
		while(true) {	// 무한루프
			if(gas > 0) {
				System.out.println("달립니다.(gas잔량:"+gas+")");
				gas -= 1;
			}else {
				System.out.println("멈춤니다.(gas잔량:"+gas+")");
				return;		// run()메소드를 빠져 나가도록 해준다.
			}
		}
	}
}

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car mycar = new Car();
		
		mycar.setGas(5);
		
		boolean gasState = mycar.isLeftGas();
		if(gasState) {
			System.out.println("출발 합니다.");
			mycar.run();
		}
		
		if(mycar.isLeftGas()) {
			System.out.println("gas를 주입할 필요가 없습니다.");
		}else {
			System.out.println("gas를 주입하세요.");
		}
	}

}
