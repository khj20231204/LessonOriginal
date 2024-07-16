package p2024_07_15;

public class WrapperEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Integer클래스는 기본 생성자를 제공하지 않기 때문에
		// 기본 생성자로 객체를 생성할 수 없다.
		// Integer num = new Integer(); // 에러발생
		
		
		// 박싱(boxing)
		// heap메모리를 박스로 생각하고, stack메모리에 저장된 10을
		// heap메모리에 복사 하는것.(heap메모리 박스에 집어 넣는다.)
		int n = 10;						// 지역변수: stack영역에 저장
		Integer num01 = new Integer(n); // 박싱(boxing)
		
		// 언박싱(unboxing)
		// heap메모리에 있는 데이터를 stack메모리로 가져 오는것
		int n01 = num01.intValue();		// 언박싱(unboxing) 
		
		
		// 자료형 변환: "20" ---> 20
		String s = "20";
		Integer num02 = new Integer(s);	// 박싱(boxing)
		int n02 = num02.intValue();     // 언박싱(unboxing)		
	}

}


