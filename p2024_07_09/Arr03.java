package p2024_07_09;

public class Arr03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2차원 배열
		// 정수를 저장할 수 있는 5행 3열 구조의 기억공간을 생성한다.
		int[][] score = new int[5][3];
		
		// 행과 열의 위치에 값을 할당
		score[0][0]=85;  score[0][1]=60; score[0][2]=70;
		score[1][0]=90;  score[1][1]=95; score[1][2]=80;
		score[2][0]=75;  score[2][1]=80; score[2][2]=100;
		score[3][0]=80;  score[3][1]=70; score[3][2]=95;
		score[4][0]=100; score[4][1]=65; score[4][2]=80;
		
		for(int row=0; row<5; row++) {		// 학생: 1 ~ 5번
			for(int col=0; col<3; col++) {  // 과목:국어, 영어, 수학
				System.out.print(score[row][col]+"\t");
			}
			System.out.println();
		}
		
		
		
	}

}
