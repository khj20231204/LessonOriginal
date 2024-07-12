package p2024_07_10;

// p287
class Calculator3{
	//메소드 오버로딩(Method Overloading)
	//: 한 개의 클래스 안에 동일한 이름을 가진 메소드를 여러개 정의 하는것.
	//  메소드 오버로딩 조건: 매개변수의 자료형, 갯수, 순서
	
	// 정사각형 넓이
	double areaRectangle(double width) {
		return width * width;
	}
	
	// 직사각형 넓이
	double areaRectangle(double width, double height) {
		return width * height;
	}
}

public class CalculatorExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator3 mycal = new Calculator3();
		
		double result1 = mycal.areaRectangle(10);
		double result2 = mycal.areaRectangle(10, 20);
		
		System.out.println("정사각형 넓이:"+ result1);
		System.out.println("직사각형 넓이:"+ result2);
	}

}
