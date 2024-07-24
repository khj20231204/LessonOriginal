package p2024_07_22;

public class ExceptionEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int var = 50;
						// args[0] = "5"   예외발생 안됨
						// args[0] = "a"   예외발생
						// args[0] = "0"   예외발생
		try {
			int data = Integer.parseInt(args[0]);
			
			System.out.println(var / data);
			
		// Exception 예외 클래스는 하위 예외 클래스들의 예외를 모두 받을 수 있기
		// 가장 마지막에 사용을 해야한다.	
//		}catch(Exception e) {
//			System.out.println("Exception 발생함");
			
		}catch(NumberFormatException ne) {
			System.out.println("숫자가 아닙니다.");
		}catch(ArithmeticException ae) {
			System.out.println("0으로 나눌수 없습니다.");
		}
		catch(Exception e) {
			System.out.println("Exception 발생함");
		}
	}

}
