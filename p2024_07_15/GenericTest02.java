package p2024_07_15;

class TestClass2{
	private Object member;		 // 필드
	
	public void setValue(Object value) {
		member = value;			
	}
	public Object getValue() {
		return member;
	}	
}
public class GenericTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestClass2 obj01 = new TestClass2();
		
		// Object value = new Integer(3);		//업캐스팅+박싱
		// Object value = 3;					//업캐스팅+자동박싱
		obj01.setValue(3);
		System.out.println("돌려 받은값:"+ obj01.getValue());
		
		
	}

}
