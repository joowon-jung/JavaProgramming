package jp02.part04;

/*
 *  1. Exception.class 상속, 새로운 Exception 구현 ==> User Definition Exception
 *  2. User Definition Exception : JRE 에서 예외를 생성 및 발생 불가.
 *  3. User Definition Exception : 프로그램에서 개발자가 필요시 생성, 발생 시켜야 한다.
 *    ( throw 의 사용 : User Definition Exception 발생시키기 ) 
 */
class FindOddException extends Exception {

	///Field
	
	///Constructor
	public FindOddException() {
		System.out.println("==> FindOddException Default Constructor");
	}
	public FindOddException (String msg) {
		super(msg);
		System.out.println("==> 인자가 있는 FindOddException Constructor");
	}
}

public class FindOddExceptionTest {
	
	///Field
	
	///Constructor
	public FindOddExceptionTest() {
		
	}
	
	/// Method
	// 홀수가 입력되면 FindOddException 발생 시키는 Method
	public void test (int number) throws FindOddException {
								  // throws : 호출한 곳으로 사용자 정의 예외 떠넘김
		
		System.out.println(":: " + this.getClass().getName() + " start. ");
		
		if (number % 2 == 0) {
			System.out.println("입력하신 수 : " + number);
		} else {
			System.out.println("내가 예외 생성해주고 동시에 예외 발생시켜줌");
			throw new FindOddException(); // 사용자 정의 예외 생성+발생 
		}
		
		System.out.println(":: " +this.getClass().getName()+ " end..\n");
	}
	
	/// Main Method
	public static void main(String[] args) {
		FindOddExceptionTest met = new FindOddExceptionTest();
		try {
			met.test(10);
			met.test(11); // test()에서 문제 발생, 
						  // but! throws로 던졌으니 test()를 호출한 곳으로 문제 위임됨
						  // 그러므로 여기서 예외처리! try-catch
		} catch (FindOddException e) {
			System.out.println("\n e : " +e); //toString() 생략되어 있음 
			e.printStackTrace();
		}
	}
}