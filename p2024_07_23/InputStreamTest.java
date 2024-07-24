package p2024_07_23;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class InputStreamTest {

	public static void main(String[] args)  {
//		public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		// InputStream : 1byte 데이터를 입력 받을 수 있는 입력 스트림
		// System.in은 표준입력 장치인 키보드로 입력 받는다는 의미를 가지고 있다.
		InputStream is = System.in; 
		int inputValue = 0;
		
		System.out.print("데이터 입력:");
		
		try {
			inputValue = is.read();
		}catch(IOException io) {
			io.printStackTrace();
		}
		
		System.out.println("입력한 데이터:"+ inputValue);
		System.out.println("입력한 데이터:"+ (char)inputValue);
	}

}
