package p2024_07_23;

import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.InputVerifier;

public class InputStreamReaderTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InputStreamReader isr = new InputStreamReader(System.in);
		
		int intputValue = 0;		
		char[] temp = new char[10];
		
		System.out.print("데이터 입력:");
		try {
			// 키보드로 입력한 문자들은 temp 배열에 저장된다.
			intputValue = isr.read(temp);
		}catch(IOException io) {
			io.printStackTrace();
		}
		
		System.out.println("inputValue:"+ intputValue);
		for(int i=0; i<intputValue; i++) {
			System.out.print(temp[i]);
		}
		System.out.println();
		
		System.out.println("char[] -> Stirng:"+ new String(temp));
		
	}

}
