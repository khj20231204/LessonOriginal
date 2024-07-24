package p2024_07_23;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BufferedReaderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 키보드로 구구단 1개단을 입력 받아서, 해당 구구단을 출력하는 
		// 프로그램을 작성하세요?
		
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("원하는 단을 입력하세요?");
		
		try {
			String input = br.readLine();
			int dan = Integer.parseInt(input);
			
			for(int i=1; i<=9; i++)
				System.out.println(dan+"*"+i+"="+dan*i);
			
		}catch(Exception e) {
//			e.printStackTrace();
			
			System.out.println("숫자만 입력 하세요.");
		}

	}

}
