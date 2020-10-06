package jp04.part01;

public class AfterThreadRunnable implements Runnable {

	/// Field
	private String name;

	/// Constructor
	public AfterThreadRunnable() {
	}

	public AfterThreadRunnable(String name) {
		this.name = name;
	}

	/// Method ==> AfterThreadRunnable은 Runnable을 implements 한 클래스니까
	// Runnable 안의 추상메소드 run()을 만드시 오버라이딩 해주어야 한다!
	public void run() {
		for (int i = 1; i < 100; i++) {
			System.out.println(name + " : " + i);

//			sleep()==> API 확인
			try {
				Thread.sleep(100);
				// sleep() 메소드 자체는 exception 을 throw 하는 메소드
				// API 확인하면 throws InterruptedException (checked Exception) 하고 있음!
				// 그러므로 sleep() 는 try- catch 써주지 않으면 오류남 !
			} catch (InterruptedException e) {
				System.out.print(e);
			}

		}
	}

	/// main method
	public static void main(String[] args) {

		System.out.println("여기는 main start...");
		AfterThreadRunnable bt1 = new AfterThreadRunnable("1번째");
		// Runnable bt1 = new AfterThreadRunnable("1번째");
		// AfterThreadRunnable 은 Runnable 의 하위 클래스니까 이렇게 써도 가능!
		AfterThreadRunnable bt2 = new AfterThreadRunnable("2번째");

		// Thread 생성자 확인
		Thread t1 = new Thread(bt1); // API 확인해서 생성자를 보면 Thread(인자로 Runnable)임!
										// bt1은 Runnable의 하위 클래스니까 들어갈 수 있다!
		Thread t2 = new Thread(bt2);

		t1.start();
		t2.start();
		System.out.println("여기는 main end...");
	}
}
