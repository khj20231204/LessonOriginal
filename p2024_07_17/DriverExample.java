package p2024_07_17;

// 매개변수의 다형성

// p368 ~ 369
class Vehicle{				 // 부모 클래스
	public void run() {
		System.out.println("차량이 달립니다.");
	}
}
class Driver{       // 매개변수의 다형성
	public void drive(Vehicle vehicle) {
		vehicle.run();
	}
}
class Bus extends Vehicle{	 // 자식 클래스
	@Override
	public void run() {      // 메소드 오버라이딩
		System.out.println("버스가 달립니다.");
	}
}
class Texi extends Vehicle{  // 자식 클래스
	@Override
	public void run() {		 // 메소드 오버라이딩
		System.out.println("택시가 달립니다.");
	}
}
public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		Bus bus = new Bus();
		Texi texi = new Texi(); 
		
		// 매개 변수의 다형성     // 업캐스팅(자동 형변환)
		driver.drive(bus);   // Vehicle vehicle = new Bus();
		driver.drive(texi);	 // Vehicle vehicle = new Texi();	
	}
}




