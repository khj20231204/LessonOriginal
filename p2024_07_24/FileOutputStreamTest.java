package p2024_07_24;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileInputStream fis = new FileInputStream("read.txt");   //원본파일       
			FileOutputStream fos = new FileOutputStream("read1.txt");//복사본 파일
			
			int input = 0;
			
			// read(): 파일의 끝을 만나면 -1을 리턴한다.
			while((input = fis.read()) != -1) {
				System.out.print((char)input);
				fos.write(input);   // read1.txt 파일에 저장
			}
			fis.close();
			fos.close();			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
