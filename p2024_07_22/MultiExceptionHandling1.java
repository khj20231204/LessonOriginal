package p2024_07_22;

// try ~ catch ~ finally
// 1. finally 안에 들어 있는 내용은 예외가 발생하든, 발생하지 않든 무조건 실행된다.
// 2. finally 안에 들어가는 내용은 주로 파일을 닫거나, 데이터베이스 연결을 끊는 내용이
//    주로 사용된다.

public class MultiExceptionHandling1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int value = 20;
		int div = 0;
		
		int[] intArray = {1, 2, 3};
//		intArray[0]=1, intArray[1]=2, intArray[2]=3
		
		try {
			int result = value / div;		// 예외발생
			System.out.println(result);		// 2
			
			int arrayValue = intArray[2];
			System.out.println(arrayValue); // 3
		}catch(ArithmeticException ae) {    
			ae.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException ai) {
			ai.printStackTrace();
		}finally {
			System.out.println("무조건 실행");
		}
		
	}

}
