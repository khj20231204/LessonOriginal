package p2024_07_23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BufferedReaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		BufferedReader br2 = 
			new BufferedReader(new InputStreamReader(System.in));	
		
		System.out.print("데이터 입력:");
		
		try {
			String input = br.readLine();
			
			System.out.println("입력한 데이터:"+ input);
		}catch(IOException io) {
			io.printStackTrace();
		}		
	}

}
