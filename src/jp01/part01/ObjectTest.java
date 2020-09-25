package jp01.part01;

/*
   FileName : ObjectTest.java
   
     1.  equals() method  이해
     2.  equals() Method  필요성 
      ㅇ instance 비교(식별성비교) ==> false
      ㅇ 상태를 비교하고 싶다면 ==> 이름(일정상태)이 동일한 경우 true 를 놓고 싶은경우는
     3. equeals(Object obj) ==> 인자로 Object Data Type  받는다는 의미는 ?
                                                       ( Object obj = new JavaAllClass() 을 다시한번 생각)  
     3. ObjectTest.java를 통해...
         : Method OverRidng, this, 묵시적, 명시적, 다형성등 OOP와 OOPL의 문법 확인
*/
class B{
	
    ///Field
    int no;
    String name;
    
    ///Constructor
    public B(){
    }
    public B(int no,String name){
      this.no = no;
      this.name = name;
    }
    
    ///method
	public String toString(){		
      return "no : "+no+" name : " +name+" 인 A class 입니다.";
    }

	//아래의 주석을 처리하고, 주석을 풀고 결과를 확인
	//==> equals(Object obj)의 의미를 다시한번 생각

	public boolean equals(Object obj){
		//equals를 사용하여 no를 비교하고 싶을 때 (오버라이딩!)
//		boolean equal = ( this.no == ( (B)obj ).no );
//		return equal;
		return this.no == ( (B) obj ).no; 
	}
	
	//Object.class안의 원래 equals 메소드
//    public boolean equals(Object obj) {
//        return (this == obj);
//    }
}//end of class


public class ObjectTest{
	
	///main method
	public static void main(String[] args){
		//Object 클래스 안의 인자를 두개 받는 생성자로 인스턴스 생성
		B b1 = new B(1,"홍길동");
		B b2 = new B(1,"홍길동");

        //equals / ==의 의미이해
        System.out.println("b1,b2는 같은 객체 인가");
		System.out.println("b1==b2() : "+ (b1==b2)); 
		//== : 비교하고자 하는 대상의 주소값을 비교 (reference type 일 때) / 값 비교 (primitive type 일 때)
        System.out.println("b1,b2는 같은 equals한 인가");
		System.out.println("b1.equals(b2) : "+b1.equals(b2));
		//b1.equals(b2)하면 ==와 다를 바가 없어 false 가 나옴
		//자바에서는 내용이 같은지를 모르기 때문에. 
		//name만 같으면 b1, b2를 같게 볼 수도 있고 no, name 둘 다 같아야 같다고 볼지 모른다. (개발자에 의도에 따름)
		//equals() 메서드를 오버라이딩해서 두 객체의 내용이 같은지를 정의해줘야 올바르게(의도한대로) 작동한다.

		//equals()는 상징적인 의미로 '상태비교'를 하기 위해서 만들었다.
		//Object 클래스 안에서는 허접하게 만들어져 있다. 알아서 재정의해서 쓰라는 것

		//우리가 B 클래스에서 equals 메소드를 오버라이딩 해서 새롭게 만들어 준다면
		//true가 나올 것이다. String 클래스도 equals메소드를 오버라이딩 해서 사용한다.
		
		System.out.println("========================");

//        참조값을 같게하자.
//		b1 = b2;
//        System.out.println("b1,b2는 같은 객체 인가");
//		System.out.println("b1==b2() : "+ (b1==b2));
//        System.out.println("b1,b2는 같은 equals한 인가");
//		System.out.println("b1.equals(b2) : "+b1.equals(b2));
	}//end of main
	
}//end of class