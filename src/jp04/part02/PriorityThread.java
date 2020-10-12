package jp04.part02;

/*
 *  Thread 우선 순위 제어
 */
public class  PriorityThread extends Thread{

	//Field
	private String name;

	//Constructor
	public PriorityThread(){
	}
	public PriorityThread(String name){
		this.name=name;
	}
	///Method
	public void run(){
		for(int i =0;i<3;i++){
			System.out.println(name + " 출력");
		}
	}
		public String getThreadName(){
			return name;
		}

      //Main Method
	public static void main(String[] args) {

		// 여기서는 스레드가 4개 돌고 있음 -> main, p1, p2, p3 총 4개
		PriorityThread p1, p2, p3;

        p1 = new PriorityThread("1.우선순위 MAX");
		p2 = new PriorityThread("2.우선순위 NORM");
		p3 = new PriorityThread("3.우선순위 MIN");

		p1.setPriority(Thread.MAX_PRIORITY); // setPriority(int priority); MAX_PRIORITY는 static field이기 때문에
																						// 클래스 명으로 접근!
		//p1.setPriority(8) 도 가능
		p2.setPriority(Thread.NORM_PRIORITY);
		p3.setPriority(Thread.MIN_PRIORITY);

		System.out.println(" :: Main Thread 1EA");

		//출력순서를 확인하자. (p1, p2, p3 or p3, p2, p1) ????
		p3.start();
		p2.start();
		p1.start();
		System.out.println(":: Main Thread 1EA + Thread 3EA");

		System.out.println("::" +p1.getThreadName()+"Thread의 우선순위"+p1.getPriority());
		System.out.println("::" +p2.getThreadName()+"Thread의 우선순위"+p2.getPriority());
		System.out.println("::" +p3.getThreadName()+"Thread의 우선순위"+p3.getPriority());

	}
}
