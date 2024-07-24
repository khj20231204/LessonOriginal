package p2024_07_22;

// 예외 처리를 하지 않은 경우
public class DivideZeroException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 0;
		int b = 20;
		
		// 예외가 발생하면 프로그램이 비정상적으로 종료된다.
		// 그렇기 때문에 프로그램을 안전하게 종료 시키기 위해서 예외처리를 해야한다.
		int c = b / a;		// 예외발생	
		
		int total = a + b;
		int sub = b - a;		
	}

}
