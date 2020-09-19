package jp01.part05;

/*
*	FileName : CalendarTest.java  
*
*     1. 시간과 날짜를 객체모델링한 java.util.Calendar 
*     2. 시간과 날짜를 객체모델잉한 java.util.Data를 확인하여 deprecation 의미 확인
*     3.  static 의 활용
*     4.  wrapper class 사용
*     5.  java.lang package 이외 다른 package 사용
*/
import java.util.*;

public class CalendarTest{ //달력 
	
	///Main method
	public static void main(String args[])	{
		
		// ==>1. 객체생성 할 수 없다면 Calendar.class는 어떻게 사용할 것인가.. (static Method 활용)

		//Calendar cld = new Calendar(); // Calendar.class는 abstract class 이기 때문에 인스턴스 생성 불가
		Calendar cld = Calendar.getInstance(); // Calendar.class 안의 getInstance() 는 static Method
		// 그러므로 인스턴스를 생성하지 않아도 클래스이름.메소드명() 으로 접근 가능하고, Calendar 인스턴스를 받아올 수 있다.
		// ==> API 사용법에서 new를 쓰지 않고 클래스 이름으로 접근 하는 것을 본다면 static인걸 유추할 수 있다!
		
		System.out.println(cld);
		// SOP로 레퍼런스 값을 출력할 때, .toString()이 생략된 구조이다!! 내부적으로 호출되어짐
		// cld를 출력했는데 쓰레기 값이 안 나온 이유는 toString 메소드가 Calendar 클래스 안에서 오버라이딩 되어 있다는 것
		// 오버라이딩 하기 전 toString() 메소드는 Object.class에 있음
		
		// ModifierTest01~04 참고 *
		
		//==> 2. 다름 방법은... ( Generalization / ~ is a ~ / 묵시적 형변환 / Hierarchy 이해..)
//		Calendar cld = new GregorianCalendar();

		
		// Calendar.class 안의 field : information hiding된 정보가 들어감 (private 선언)
		// 직접 가져올 수 없으니 필드들을 get 메소드로 가져온다.
		System.out.println("년 : "+cld.get(Calendar.YEAR));
		// static 활용 : 각 각의 static Field | API에서 확인하자 -> calendar 클래스 안의 필드는 다 final static이다!
		// 대문자이니 상수라고 유추할 수 있음. 대문자는 가독성이 떨어지니까 snake case를 사용했다 ex) WEEK_OF_YEAR
		System.out.println("월 : "+cld.get(Calendar.MONTH)); //MONTH는 0부터 시작!
		System.out.println("일 : "+cld.get(Calendar.DATE));
		System.out.println(cld.get(Calendar.YEAR)+"년의: "+
				                                                           cld.get(Calendar.WEEK_OF_YEAR)+"번째주");
		System.out.println(cld.get(Calendar.YEAR)+"년의: "+
                                                                           cld.get(Calendar.WEEK_OF_MONTH)+"번째달");
		System.out.println("이번달의 : "+cld.get(Calendar.DAY_OF_MONTH)+"번째일");
		System.out.println(cld.get(Calendar.YEAR)+"년의: "+
                                                                          cld.get(Calendar.DAY_OF_YEAR)+"번째일");
		System.out.println("이번주의 : "+cld.get(Calendar.DAY_OF_WEEK)+"번째일");
		System.out.println("오전,오후 : "+cld.get(Calendar.AM_PM));
		System.out.println("시간 : "+cld.get(Calendar.HOUR));
		System.out.println("24시간 : "+cld.get(Calendar.HOUR_OF_DAY));
		System.out.println("분 : "+cld.get(Calendar.MINUTE));
		System.out.println("초 : "+cld.get(Calendar.SECOND));
		System.out.println("밀리초 : "+cld.get(Calendar.MILLISECOND));

		// wrapper class  이해 및 사용
		// equals(Object obj) ==> 인자를 Object 로 받는다는 의미는... => Reference 타입만 인자로 받을 수 있음!
		// java 의 모든 class 는 equals Method 의 인자로 전달 될 수 있으나
		// 인자로 전달될수 없는 8EA의 Data Type 이 있다(Primitive Data Type)
		//==> Primitive Data 를 Reference Data 로 사용할수 있게 한다.
		
		int i = 100;
		Integer integer = new Integer(i);  
		System.out.println(" 1 : "+integer.toString()); //toString() 안 써도 상관없음
		System.out.println(" 2 : "+integer.intValue());
		System.out.println(" 3 : "+integer.doubleValue());
	}//end of main
}//end of class