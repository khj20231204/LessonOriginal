package p2024_07_22;

public class ThrowException {

	public void exceptionMethod() throws ArrayIndexOutOfBoundsException{
		int[] intA = {1, 2, 3, 4};
		
		for(int i=0; i<10; i++) {
			if(i == 2)	// 프로그래머가 강제로 직접 예외를 발생시킴
				throw new ArrayIndexOutOfBoundsException();
			System.out.println(intA[i]);
		}		
	}		
	public static void main(String[] args) {
		ThrowException te = new ThrowException();
		
		try {
			te.exceptionMethod();
		}catch(ArrayIndexOutOfBoundsException ab) {
			ab.printStackTrace();
		}	
	}

}
