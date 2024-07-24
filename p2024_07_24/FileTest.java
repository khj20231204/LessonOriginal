package p2024_07_24;

import java.io.File;

// File 클래스
// 파일이나 디렉토리를 관리하는 클래스: 폴더 생성, 폴더 삭제, 파일삭제
public class FileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			File temp = new File("c:/java01","temp");// c:/java01/temp
			File tempFile = new File("test");
			
			// mkdirs(): 실제 디렉토리를 생성하고 true를 리턴
			System.out.println("temp객체:" + temp.mkdirs());
			System.out.println("tempFile객체:" + tempFile.mkdirs());
			
			//1. 디렉토리 삭제: 비어있는 디렉토리 
//			tempFile.delete();  // test 디렉토리가 삭제된다.
			
			//2.비어있지 않는 디렉토리 삭제(과제)
			File[] f = tempFile.listFiles();
			for(int i=0; i<f.length; i++) {
				f[i].delete(); // test 디렉토리 안의 모든 파일을 삭제 
			}			
			tempFile.delete(); // 비어있는 test디렉토리 삭제된다.	
			
			
			//3.자식 디렉토리 삭제 
			temp.delete();     // temp 디렉토리가 삭제된다.
			
			//4.부모 디렉토리 삭제
			temp.getParentFile().delete();  // c:/java01 디렉토리 삭제된다.
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}	

	}

}
