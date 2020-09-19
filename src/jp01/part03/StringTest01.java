package jp01.part03;

/*
	FileName : StringTest01.java
	
	 1. 문자열을 Object Modeling 한 String 특징
	 2. 실행결과를 에측하고,  예측한 결과와 맞는지 확인
	 3. 인스턴스 비교시 == 과 equals() Method 다시 이해 
*/

public class  StringTest01{
    
	///main method
	public static void main(String[] args)	{
		
		String s1 = "홍길동";
		String s2 = "홍길동";
		String s3 = new String("홍길동");
		String s4 = new String("홍길동");
		
		// == 비교 (== : 비교하고자 하는 대상의 주소값을 비교)
		// 레퍼런스는 주소값을 가지기 때문에 원래 다 f가 나와야 함
		// 근데 맨 위는 왜 true ?
		// new 라는 키워드를 쓰지 않으면 메모리를 가볍게 쓰기 위해서
		// 가벼운 공간 (fly weight fool) 에 만든다.
		// 그래서 s1, s2는 메모리를 공유해서 사용함! 걍 있다는 거만 알고 잊어버리기,,
		System.out.println("s1==s2 : "+(s1==s2)); //t
		System.out.println("s1==s3 : "+(s1==s3)); //f
		System.out.println("s1==s4 : "+(s1==s4)); //f
		System.out.println("s2==s3 : "+(s2==s3)); //f
		System.out.println("s2==s4 : "+(s2==s4)); //f
		System.out.println("s3==s4 : "+(s3==s4)); //f

		// equals() 비교
		// String 안에 equals() 메소드가 상태값을 비교 하게끔
		// 오버라이딩 되어 있음
		
		// 레퍼런스는 절대 == 사용해서 비교하지 말고 equals를 사용해서 비교하자!!!
		// 하위 클래스에서 오버라이딩 되어있지 않으면 Object 안의 equals로 동작하는 것.
		System.out.println("s1.equals(s2) : "+s1.equals(s2));
		System.out.println("s1.equals(s3) : "+s1.equals(s3));
		System.out.println("s1.equals(s4) : "+s1.equals(s4));
		System.out.println("s2.equals(s3) : "+s2.equals(s3));
		System.out.println("s2.equals(s4) : "+s2.equals(s4));
		System.out.println("s3.equals(s4) : "+s3.equals(s4));
		
	}//end of main

}//end of class