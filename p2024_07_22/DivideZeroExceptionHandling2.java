package p2024_07_22;

public class DivideZeroExceptionHandling2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 0;
		int b = 20;
		int c = 0;
		
		try {
			c = b / a;		// 예외발생

			// 예외가 발생하면, 예외가 발생한 라인 아랫쪽은 실행되지 않는다.
			int total = a + b;
			int sub = b - a;
		}catch(Exception e) {
			// 예외 메세지를 출력하는 메소드
			
			// 예외 정보를 자세하게 출력
			e.printStackTrace();
//			System.out.println(e.printStackTrace()); // 에러발생
			
			// 예외 정보를 문자열로 반환해서 출력
			System.out.println(e.getMessage());
			
			// 예외 정보를 간단하게 출력
			System.out.println(e.toString());
			
			System.out.println("0으로 나눌 수 없습니다.");
		}
		
	}

}
