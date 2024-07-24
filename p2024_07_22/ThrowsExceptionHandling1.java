package p2024_07_22;

public class ThrowsExceptionHandling1 {
	
	public void occurException() {
		try {
			 int result = 3/0;			// 예외 발생
			 System.out.println(result);
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌수 없습니다.");
		}		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowsExceptionHandling1 te = new ThrowsExceptionHandling1();
		
		te.occurException();
	}

}
