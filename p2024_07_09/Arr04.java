package p2024_07_09;

public class Arr04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 2차원 배열
		// 행: 학생번호(1~5번)
		// 열: 과목(국어, 영어, 수학)
		//                 국어   영어  수학
		int[][] score = { { 85,  60,  70},   // 0행 
						  { 90,  95,  80},   // 1행
						  { 75,  80,  100},  // 2행
						  { 80,  70,  95},   // 3행
						  { 100, 65,  80},   // 4행
						 };
		// subject[0]=0, subject[1]=0, subject[2]=0
		int[] subject = new int[3];		// 과목별 총점 	
		int[] student = new int[5];		// 학생별 총점
		
		System.out.println("각 과목별 총점구하기");
		for(int c=0; c<3; c++) {			// 과목
			for(int r=0; r<5; r++) {        // 학생
				subject[c] += score[r][c];
			}   // subject[c] = subject[c] + score[r][c]
			System.out.println(subject[c]);
		}
		
		System.out.println("학생별 총점 구하기");
		for(int r=0; r<5; r++) {			// 학생
			for(int c=0; c<3; c++) {		// 과목
				student[r] += score[r][c];
			}// student[r] = student[r] + score[r][c];  
			System.out.println(student[r]);
		}
		
		
	}

}
