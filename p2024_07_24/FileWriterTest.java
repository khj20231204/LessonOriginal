package p2024_07_24;

import java.io.FileReader;
import java.io.FileWriter;

public class FileWriterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileReader fr = new FileReader("data.txt");  //원본파일  
			FileWriter fw = new FileWriter("data1.txt"); //복사본 파일
//			FileWriter fw = new FileWriter("d:/data1.txt"); //복사본 파일
			
			int input = 0;
			
			// read(): 파일의 끝을 만나면 -1을 리턴한다.
			while((input = fr.read()) != -1) {
				System.out.print((char)input);
				fw.write(input);   // data1.txt 파일에 저장
			}
			fr.close();
			fw.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
