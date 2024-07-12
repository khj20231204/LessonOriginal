package p2024_07_11;

public class StringTest01 {

	// toUpperCase(): 대문자로 변환 해주는 메소드
	// toLowerCase(): 소문자로 변환 해주는 메소드
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// String 클래스
		//1. String객체를 생성한 후에 메소드에 의해서 값의 변화가 일어나면
		//   변경된 값은 heap메모리 영역에 다시 저장된다.
		//2. 쓰레기 수집 기능(Garbage Collection 기능)
		//   재활용할 수 없는 heap메모리 영역의 데이터를 모아서 지워주는 기능		

		String str1 = "Java Programming";
		
		str1.toUpperCase();
		System.out.println(str1);	// Java Programming 출력
		System.out.println(str1.toUpperCase());//JAVA PROGRAMMING
		
		String str2 = str1.toUpperCase();
		System.out.println(str2);
	}

}
