package jp02.part02;
/*
 * 
 *   ==> java ExceptionTest 10 20 0 실행시 3번째 인자값이 0이면 실행시 문제 발생
 *   ==> 출력 결과 (실행시 에러) 읽고 출력 결과 확인
 *   ============================================
 *   ==> 해결 1. try {} catch()로 문제(Exception :: 예외)발생사항 처리, 정상 종료
 */
public class ExceptionTest02 {
	
	///Field
	private int sum;
	private int avg;
	
	///Constructor
	public ExceptionTest02() {
		
	}
	
	///Method
	public void sum(int x, int y) {
		System.out.println("1. ==> sum 시작");
		sum = x + y; 
		System.out.println("1. ==> 합 : " + sum);
		System.out.println("1. ==> sum 끝");
	}
	
	//인자값으로 0이 들어오면 문제 발생
	public void avg(int z) {
		System.out.println("2. ==> avg 시작");
		// try - catch 로 JVM에서 던지는 Exception 객체를 처리하자.
		// (예외가 났으니 해결하라고 JVM에서 Exception 객체를 던져줌)
		// ==> 출력결과를 확인하자
		try { // ExceptionTest04와 비교
		avg = sum / z; // 문제 발생 
		System.out.println("앞줄에서 문제 발생해서 catch로 넘어가기 때문에 이건 출력 안됨");
		} catch(ArithmeticException e) {
			System.out.println("1. >> ==========================");
			System.out.println("z값이 0인 모양 입니다. 나누기 불가");
			System.out.println("2. >> ==========================");
			System.out.println(e); //System.out.println(e.toString());
			// SOP 안에 클래스 객체를 찍으면 toString()이 생략되어 있는 구조
			// 쓰레기값이 찍히지 않았으니까 toString이 오버라이딩 된 것임을 알 수 있다!
			// toString() 메소드는 ArithmeticException 클래스에 있지 않고,
			// 상위 클래스인 java.lang.Throwable 안에 있으니 API 확인해서 보기!
			System.out.println("3. >> ==========================");
			e.printStackTrace(); // ★ 꼭 찍어주는 습관 들이기. 
								 // 에러 메세지의 발생 근원지를 찾아서 단계별로 에러 출력해준다!
								 // Stack 구조로 추적해줌 
			System.out.println("4. >> ==========================");
			
		}
		System.out.println("평균 : " + avg);
		System.out.println("2. ==> avg 끝");
	}
	
	///main method
	public static void main(String[] args) {
		
		int i = Integer.parseInt(args[0]); //10
		int j = Integer.parseInt(args[1]); //20
		int k = Integer.parseInt(args[2]); //0
		
		ExceptionTest02 et = new ExceptionTest02();
		et.sum(i, j);
		et.avg(k);
		
		System.out.println("main Method End...");
	}

}
