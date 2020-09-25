package jp01.part02;

/*	
	FileName :  ProductTest.java  
	
	  1. Reference Data Type 의미 다시 확인
	  2. 실행결과를 에측하고,  실행하여 예측한 결과와 맞는지 확인 
	  	   ::  Reference Data Type 이해도 확인 
*/
class Product{	
  //Field
  String product ="콜라";
 }//end of class


public class ProductTest{
	
	  //main method	
	  public static void main(String[] args){

		  	// 그림 그리면서 구조 파악해보기
			Product p01 = new Product();
			System.out.println("p01.product : "+p01.product);

			Product p02 = new Product();
			System.out.println("p02.product : "+p02.product);

			Product p03 = p01;
			System.out.println("p01.product : "+p01.product);
			System.out.println("p03.product : "+p03.product);
			
			p03.product="사이다";
			System.out.println("p01.product : "+p01.product);
			System.out.println("p02.product : "+p02.product); // 잘 알기!
			System.out.println("p03.product : "+p03.product);

			p02 = p03;
			System.out.println("p01.product : "+p01.product);
			System.out.println("p02.product : "+p02.product);
			System.out.println("p03.product : "+p03.product);
		}//end of main

}//end of class