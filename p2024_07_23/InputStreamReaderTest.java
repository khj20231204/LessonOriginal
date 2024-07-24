package p2024_07_23;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// InputStreamReader : 2byte문자 1글자를 입력 받을수 있는 입력 스트림
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		
		InputStreamReader isr2 = new InputStreamReader(System.in);
		
		System.out.print("데이터 입력:");
		int inputValue = 0;
		try {
			inputValue = isr.read(); //입력한 문자는 유니코드로 처리된다.
		}catch(IOException io) {
			io.printStackTrace();
		}
		System.out.println("입력한 데이터:"+ inputValue);
		System.out.println("입력한 데이터:"+ (char)inputValue);
	}

}
