package p2024_07_08;

public class ArrayEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 배열에 저장된 데이터 중에서 최대값과 최소값을 구하는 프로그램을
		// 작성하세요?
		
		double[] data = {9.5, 7.0, 13.6, 7.5, 10.5};
		
		double max, min;
		
		max = data[0];		// 9.5
		min = data[0];		// 9.5
		
		for(int i=1; i<data.length; i++) {
			if(data[i] > max)  max = data[i];
			if(data[i] < min)  min = data[i];
		}
		System.out.println("max:"+ max);
		System.out.println("min:"+ min);
	}

}
