package jp01.part01;

/*
  FileName : A.java
  
  1. Java Class(API / 개발자정의 )의 최상위 class 
        ==> java.lang.Object :: 확인하면 
        :  API ==> Hierarchy
        :  개발자정의 ==>javap A   : Object.class는 자동 extends
		                                            :  Fully Qualified Class Name(FQCN) 
  2.  java.lang.Object 클래스는 자바의 모든 클래스들이 갖는 일반적인 행위와 속성을
       정의되어 있어, java 의 모든 클래스는 Object 클래스의 Method 와 Field 를 사용가능. 
  3. Object.class의 toString()의 의미을 이해
*/
public class A{
  
  ///Field
  
  ///Constructor
  public A(){
	  super(); //모든 생성자 첫 라인에는 super()가 생략되어 있다!
	  		   //java.lang.Object를 extends 받고 있기 때문에
  }
  
   //method
  //==> 아래의 toString()를 주석처리 하고 실행, 주석을 풀고 실행 결과확인
  
//  public String toString(){
//        return "최상위 Object 및 OverRiding 이해";
//   }
  
  
  ///main Method
  public static void main(String[] args){
	  
    A a = new A();
    String str = a.toString();
    String str1 = "5";

	//아래의 출력결과를 확인하면.....
    System.out.println("str ==> "+str);
    System.out.println("a.toString ==> "+a.toString());
	System.out.println("a ==> "+a); 
	//system.out.print로 레퍼런스 값을 찍으면 .toString이 다 생략된 구조이다!! 내부적으로 호출되어짐
	System.out.println(str1); //5가 찍히는 이유 : 오버라이딩 되었기 때문
	//String 클래스 안에서 자신의 상태값을 리턴하게끔 Object의 toString을 오버라이딩 한 것!
	
  }//end of main

}//end of class
/*
	1. 실행 1 : 위의 내용 compile 후 실행
	2. 실행 2 : toString Method 를 주석 처리후 compile 후 실행
    ==> 결과를 비교하면....
*/