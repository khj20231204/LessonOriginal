package p2024_07_10;

// p282
class Calculator2{
	int plus(int x, int y) {
		int result = x + y;		
		return result;				    // 17
	}
	
	double avg(int x, int y) {
		double sum = plus(x, y);		// plus() 메소드 호출
		double result = sum / 2;
		return result;				    // 8.5
	}
	
	void execute() {
		double result = avg(7, 10);		// avg() 메소드 호출
		println("실행결과:"+ result);	    // println() 메소드 호출
	}
	
	void println(String message) {
		System.out.println(message);
	}
	
}

public class CalculatorExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator2 mycal = new Calculator2();
		
		mycal.execute();		
	}
}
