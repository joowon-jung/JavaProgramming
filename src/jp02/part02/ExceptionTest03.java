package jp02.part02;
/*
 * 
 *   ==> java ExceptionTest 10 20 0 실행시 3번째 인자값이 0이면 실행시 문제 발생
 *   ==> 출력 결과 (실행시 에러) 읽고 출력 결과 확인
 *   ============================================
 *   ==> 해결 1. try {} catch()로 문제(Exception :: 예외)발생사항 처리, 정상 종료
 *   ============================================
 *   ==> 해결 2. throws 로 JVM 에서 던지듯 호출한(문제를 발생시킨)곳으로 발생한
 *             Exception 을 던진다(위임). (어디로 : 호출한 곳(문제 유발한 곳))
 */
public class ExceptionTest03 {
	
	///Field
	private int sum;
	private int avg;
	
	///Constructor
	public ExceptionTest03() {
		
	}
	
	///Method
	public void sum(int x, int y) {
		System.out.println("1. ==> sum 시작");
		sum = x + y; 
		System.out.println("1. ==> 합 : " + sum);
		System.out.println("1. ==> sum 끝");
	}
	
	//JVM에서 던진 ArithmeticException을 다시 자신을 호출한 곳으로 던진(위임) 다
	public void avg(int z) throws ArithmeticException{
		System.out.println("2. ==> avg 시작");
		// z = 0 인 경우 불능
		avg = sum / z; // 여기서 문제가 터졌으니 이 메소드를 호출한 곳으로 문제를 위임함
		System.out.println("평균 : " + avg);
		System.out.println("2. ==> avg 끝");
	}
	
	///main method
	public static void main(String[] args) {
		
		int i = Integer.parseInt(args[0]); //10
		int j = Integer.parseInt(args[1]); //20
		int k = Integer.parseInt(args[2]); //0
		
		ExceptionTest03 et = new ExceptionTest03();

		// ==> 어떤 Exception 이 발생하는지 확인
		et.avg(k); // 여기로 문제 떠넘겨짐(위임)! ExceptionTest01 에서는 avg() 메소드 안에서
				   // 문제가 터졌다면 여기서는 avg() throws 했으니까 avg()안에서 문제가 발생하면
				   // avg()를 호출한 곳에서 문제가 터짐! 01과 문제 터진 부분이 다르다!!
		
		System.out.println("main Method End...");
	}

}
