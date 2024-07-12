package p2024_07_12;

public class StringBufferTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb1 = new StringBuffer("gemini is beautiful");
		System.out.println(sb1);	//gemini is beautiful
		
		//인덱스 10번 위치에 very문자를 삽입 시킨다.
		sb1.insert(10, "very");
		System.out.println(sb1);	//gemini is verybeautiful

		//인덱스 0번 위치에 1004숫자를 삽입 시킨다.
		sb1.insert(0, 1004);
		System.out.println(sb1);	//1004gemini is verybeautiful
	}

}
