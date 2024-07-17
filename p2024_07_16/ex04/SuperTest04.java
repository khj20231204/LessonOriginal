package p2024_07_16.ex04;

class Point2D{					// 부모 클래스		
	protected int x = 10;       // 은닉 변수 or 쉐도우 변수
	protected int y = 20;
}
class Point3D extends Point2D{	// 자식 클래스
	protected int x = 40;	
	protected int y = 50;

	protected int z = 30;	
	
	public void print() {
		System.out.println(x+", "+ y +", "+z); // 40, 50, 30
	}
	
//	super : 부모 클래스를 의미하는 레퍼런스 변수
//  super.x 는 부모클래스의 은닉 필드를 접근할때 사용한다.	
//  super.x 는 자식클래스의 메소드 안에서 사용할 수 있다.	
//	System.out.println(super.x); // 에러발생

	int a = super.x;	         // 사용 가능
	
	public void print02() {		 // 10, 20, 30
		System.out.println(super.x+", "+ super.y +", "+z);
	}	
}
public class SuperTest04 {

	public static void main(String[] args) {
		Point3D pt = new Point3D();
		pt.print();
		pt.print02();
	}

}
