package p2024_07_12;

public class SubStringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// substring(): 전체 문자열에서 특정 범위의 문자를 추출하는 메소드
		
		// substring(int beginindex): beginindex번호 부터 끝까지 문자를 추출
		// substring(int beginindex, int endindex)
		// : beginindex번호 부터 endindex-1번 까지 문자를 추출
		
		String message = "Java program creates many objects.";
		
		// 인덱스번호 13번부터 끝까지 문자를 추출
		String str1 = message.substring(13);
		System.out.println(str1);

		// 인덱스번호 13번 부터 15번까지 문자를 추출
		String str2 = message.substring(13, 16);
		System.out.println(str2);
	}
}



