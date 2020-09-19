package jp01.part03;

/*
*	 FileName : StringTest02.java
*
*    1.  String.class  :   immutable (정적인 문자열 Object Modeling)
*    2.  StringBuffer.class  : mutable (동적인 문자열 Object Modeling)
*         StringBuilder.class  : mutable (동적인 문자열 Object Modeling)
*         
*         ==> StringBuilder / StringBuffer 는 동적인 문자열을 다루며, API 도 동일
*         ==> 차이점은 StringBuiler 는 동기화(synchronize :: Thread 학습 후 다시 언급)
*                 를 지원하지 않아 StringBuffer 보다 속도면에서 나은 성능을 보장.
*/
public class  StringTest02{

	///Main method
	public static void main(String[] args)	{

		//String.class 이용 문자열 생성
		String s1 = "홍";
		String s2 = "길";
		String s3 = "동";
		s1 = s1+s2; //불변! +를 하면 새로 만들어짐 원래 레퍼런스 연결은 끊김
		s1 = s1+s3; //그래서 쓸때마다 쓰레기값(가비지) 가 계속 생김!!
		
		//동적인 StringBuffer / StringBuiler 사용 문자열 생성
		StringBuffer sb = new StringBuffer("홍");
		//StringBuilder sb = new StringBuilder("홍");
		sb.append(s2);
		sb.append(s3);

		System.out.println(s1); //toString() 생략된 구조
		//System.out.println(s1.toString());
		//String.class 안에서 Object.class의 toString() 오버라이딩 한 것!
		System.out.println(sb); //toString() 생략된 구조
		//System.out.println(sb.toString());
		//StringBuffer.class 안에서 Object.class의 toString() 오버라이딩 한 것!

		//출력결과는 동일하게 홍길동
		//정적인 String, 동적인 StringBuffer는 내부적으로
		//처리하는 과정은 garbage 발생 등 차이점을 발생이해

	}//end of main

}//end of class