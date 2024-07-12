package p2024_07_12;

public class SubStringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 아래와 같은 주민번호가 있을때, 남자인지 여자인지를 판변하는 프로그램을
		// 작성하세요?
		
		String jumin = "950101-2234567";
		
		char c = jumin.charAt(7);
		
		if(c == '1' || c == '3') {
			System.out.println("남자");
		}else if(c == '2' || c == '4') {
			System.out.println("여자");
		}else {
			System.out.println("잘못된 정보 입니다.");
		}
		
//		String gender = jumin.substring(7, 8);
//		
//		if(gender.equals("1") || gender.equals("3")) {
//			System.out.println("남자");
//		}else if(gender.equals("2") || gender.equals("4")){
//			System.out.println("여자");
//		}else {
//			System.out.println("잘못된 정보 입니다.");
//		}
		
	}

}
