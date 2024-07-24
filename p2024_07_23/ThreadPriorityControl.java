package p2024_07_23;

public class ThreadPriorityControl implements Runnable {

	@Override
	public void run() {
		for(int i=1; i<11; i++) {
System.out.println(Thread.currentThread().getName()+" number="+i);
		}		
	}
	
	public static void main(String[] args) {
		ThreadPriorityControl tl = new ThreadPriorityControl();
		
//		프로그램에서 우선 순위를 지정하지 않으면 우선 순위가 5로 설정되어 있다.
//		▪ 최고순위 - MAX_PRIORITY : 10
//		▪ 순위 미지정 - NORM_PRIORITY : 5
//		▪ 최저순위 - MIN_PRIORITY : 1	
		
		Thread first = new Thread(tl, "first1");
		first.setPriority(Thread.MIN_PRIORITY);    // 1
		System.out.println("first priority="+ first.getPriority());
		
		Thread second = new Thread(tl, "second1");
		second.setPriority(Thread.MAX_PRIORITY);   // 10
		System.out.println("second priority="+ second.getPriority());
		
		Thread third = new Thread(tl, "thread1");  // 5
		System.out.println("third priority="+ third.getPriority());
		System.out.println();
		
		first.start();
		second.start();
		third.start();		
	}
}
