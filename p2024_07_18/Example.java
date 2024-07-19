package p2024_07_18;

// p422 ~ 423
interface InterfaceA{
	public void methodA();		// 추상 메소드
}
interface InterfaceB{
	public void methodB();		// 추상 메소드
}
// 인터페이스끼리 상속을 받을때는 extends로 상속 받는다.
interface InterfaceC extends InterfaceA, InterfaceB{
	public void methodC();		// 추상 메소드
}
class ImplementationC implements InterfaceC{
	@Override
	public void methodA() {		// 메소드 오버라이딩
		System.out.println("메소드 오버라이딩된 MethodA()실행");
	}
	@Override
	public void methodB() {		// 메소드 오버라이딩
		System.out.println("메소드 오버라이딩된 MethodB()실행");
	}
	@Override
	public void methodC() {		// 메소드 오버라이딩
		System.out.println("메소드 오버라이딩된 MethodC()실행");
	}
}
public class Example {
	public static void main(String[] args) {
		ImplementationC im = new ImplementationC();
		
		InterfaceA ia = im;      // 업캐스팅
//		InterfaceA ia = new ImplementationC();		
		ia.methodA();
		System.out.println();
		
		InterfaceB ib = im;		// 업캐스팅	
//		InterfaceB ib = new ImplementationC();		
		ib.methodB();
		System.out.println();
		
		InterfaceC ic = im;		// 업캐스팅
//		InterfaceC ic = new ImplementationC();		
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}
}
