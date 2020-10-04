package jp02.part02;
/*
 *   ==> java ExceptionTest 10 20 0 실행시 3번째 인자값이 0이면 실행시 문제 발생
 *   ==> 출력 결과 (실행시 에러) 읽고 출력 결과 확인
 *   
 *   avg() 에서 인자값이 0으로 들어와서 나눌 수 없게 되어 프로그램이 !강제 종료!가 됨
 */
public class ExceptionTest01 {
	
	///Field- information hiding
	private int sum;
	private int avg;
	
	///Constructor
	public ExceptionTest01() {
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
		//sum은 0으로 나눌 수 없음 => 문제 발생! 강제 종료됨!
		avg = sum / z; // 여기서 문제가 터짐! ExceptionTest03과 비교
		System.out.println("2. ==> 평균 : " + avg);
		System.out.println("2. ==> avg 끝");
	}
	
	///main method
	public static void main(String[] args) {
		
		int i = Integer.parseInt(args[0]); //10
		int j = Integer.parseInt(args[1]); //20
		int k = Integer.parseInt(args[2]); //0
		
		ExceptionTest01 et = new ExceptionTest01();
		et.sum(i, j); // 실행됨
		et.avg(k); // 실행해야 하는데 avg() 안의 avg = sum / z; 에서 문제가 발생 => 강제 종료
		
		System.out.println("main Method End..."); // 출력 안 됨. 프로그램이 정상적으로 종료되지 않았음 
	}

}
