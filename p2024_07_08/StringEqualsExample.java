package p2024_07_08;

//p195
public class StringEqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// new연산자 없이 String객체를 생성하면, 처음 1번만 heap메모리상에 
		// 값(신민철)을 할당한다.
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		
		if(strVar1 == strVar2) {		// 참조하는 주소 비교
			System.out.println("같은 주소");		// 같은 주소
		}else {
			System.out.println("다른 주소");
		}
		if(strVar1.equals(strVar2)) {	// 참조하는 값 비교
			System.out.println("같은 값");		// 같은 값
		}else {
			System.out.println("다른 값");
		}
		
		// new연산자를 이용해서 String객체를 생성하면, 매번 새로운 heap메모리상에 
		// 새로운 공간을 할당 받는다.
		String strVar3 = new String("신민철");
		String strVar4 = new String("신민철");
		if(strVar3 == strVar4) {		// 참조하는 주소 비교
			System.out.println("같은 주소");
		}else {
			System.out.println("다른 주소");		// 다른 주소
		}
		if(strVar3.equals(strVar4)) {	// 참조하는 값 비교
			System.out.println("같은 값");       // 같은 값
		}else {
			System.out.println("다른 값");
		}
		
		
	}

}
