package p2024_07_10;

class Singleton{

	// 싱글톤(singleton): 객체 생성을 한번만 수행하는것.
	private static Singleton s = new Singleton();   // 정적 필드
	
	private Singleton() {		// 직접 클래스로 생성하는 것을 막아주는 역할		
	}	
	
	public static Singleton getInstance() {			// 정적 메소드
		return s;
	}
	
	public void check() {
		System.out.println("메소드 호출 성공1");
	}
	
	public void check1() {
		System.out.println("메소드 호출 성공2");
	}
}

public class SingletonEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// private 접근 제어자 때문에 외부 클래스에서 접근할 수 없다.
		// System.out.println(Singleton.s);   // 오류 발생
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		System.out.println(obj1);
		System.out.println(obj2);
		
		if(obj1 == obj2) {		// 주소값 비교
			System.out.println("같은 주소");
		}else {
			System.out.println("다른 주소");
		}
		
		// 기본생성자의 접근 제어자가 private이기 접근할 수 없다.
		//Singleton s = new Singleton();	//  오류발생
		
		obj1.check();
		obj1.check1();
		obj2.check();
		obj2.check1();
	}

}





