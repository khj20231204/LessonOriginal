package p2024_07_23;

// sleep()메소드를 이용해서 강제로 running 상태에서 block상태로 
// Thread의 상태를 변경할 수 있다.
public class ThreadSleep implements Runnable{

	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
	System.out.println(Thread.currentThread().getName()+" : "+ i);		
		
			try {
				// sleep()메소드를 이용해서 프로그래머가 강제로 block상태로 상태를 변경 
				Thread.sleep(1000);  // 단위: 1/1000
			}catch(InterruptedException ie) {
				ie.printStackTrace();
			}			
		}		
	}	
	public static void main(String[] args) {
		ThreadSleep ts = new ThreadSleep();
		
		Thread first = new Thread(ts, "first1");
		Thread second = new Thread(ts, "second1");
		
		first.start();
		second.start();
	}

	

}
