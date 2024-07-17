package p2024_07_16.ex12;

class Parent {					// 부모 클래스
	public void parentPrn() {
		System.out.println("슈퍼클래스: parentPrn메소드");
	}
}
class Child extends Parent {	// 자식 클래스
	public void childPrn() {
		System.out.println("서브클래스: childPrn메소드");
	}
}

//강제 형변환(다운 캐스팅)
// 1. 부모클래스에서 자식클래스로 형변환 하는 것이다.
// 2. 참조 가능한 영역이 확대가 된다.
// 3. 컴파일러에 의해서 자동 형변환이 되지 않기 때문에 프로그래머가 직접 강제 형변환을
//    해야 하며, 강제 형변환시 자료형을 생략할 수 없다.
public class RefTest03 {
	public static void main(String[] args) {
		
		Parent p = new Child();		// 업캐스팅
		p.parentPrn();              // 상속해준 메소드만 호출할 수 있다.
//		p.childPrn();               // 에러발생
		
		Child c;
		c = (Child)p;				// 다운 캐스팅(강제 형변환)
		
		Child c1 = (Child) p;       // 다운 캐스팅(강제 형변환)
		
		// 다운캐스팅이 되면 참조 가능한 영역이 확대된다.
		c.parentPrn();
		c.childPrn();

	}

}
