package p2024_07_24;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

// DataInputStream, DataOutputStream
// 기본 자료형값을 유지 하면서 데이터 입,출력을 처리해주는 클래스
public class DataIOTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			// 출력 스트림으로 출력한 내용을 iodata.txt 파일에 저장
			FileOutputStream fos = new FileOutputStream("iodata.txt");
			DataOutputStream dos = new DataOutputStream(fos);
			dos.writeBoolean(true);
			dos.writeChar('j');
			dos.writeInt(1234);
			dos.writeFloat(3.14F);
			dos.writeDouble(123.4567);
			dos.writeUTF("자바");
			
			// iodata.txt 파일의 내용을 읽어온다.
			FileInputStream fis = new FileInputStream("iodata.txt");
			DataInputStream dis = new DataInputStream(fis);
			System.out.println(dis.readBoolean());
			System.out.println(dis.readChar());
			System.out.println(dis.readInt()+1);
			System.out.println(dis.readFloat());
			System.out.println(dis.readDouble());
			System.out.println(dis.readUTF());
			
			fis.close();
			fos.close();
			dis.close();
			dos.close();			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
