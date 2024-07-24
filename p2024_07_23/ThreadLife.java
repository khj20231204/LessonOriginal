package p2024_07_23;

// 멀티 스레드 프로그램
public class ThreadLife implements Runnable{

	@Override
	public void run() {  // 실행중인 상태
		for(int i=1; i<21; i++) {
System.out.println(Thread.currentThread().getName()+" number="+i);
		}		
	}	
	
	public static void main(String[] args) {
		ThreadLife tl = new ThreadLife();
		
		Thread first = new Thread(tl, "first1");
		Thread second = new Thread(tl, "second1");
		Thread third = new Thread(tl, "third1");
		
		second.start();		// 실행 가능한 상태
		first.start();
		third.start();
	}

	

}
