package jp01.part05;
/*
  	1. Array : 같은 Data Type 의 묶음, 고정 길이
  	2. java.util.Vector : 다른 Data Type 도 묶음, 가변길이
 */

import java.util.*;

public class VectorTest01 {

	///Main Method
	public static void main(String[] args) {
		
		//Vector 생성 : API의 생성자를 확인, 인자로 전달된 10.0 의미 확인.
		Vector vector = new Vector(10, 10);
		
		//Vector에 Object 저장 ==> add(Object obj) : Object를 인자로 받는다는 의미는 ?
		//데이터 타입이 레퍼런스 타입이면 뭐든지 들어갈 수 있음! Object가 최상위 클래스라 묵시적 형변환이 되니까
		
		String s1 = new String("1.홍");
		vector.add(s1);
		vector.add(new String("2.동"));
		vector.add("3. 님 안녕하세요"); //스트링은 new 키워드 없이도 가능
		
		//Vector 저장된 값을 출력 :: vector.capacity() 무엇을 return 하는가.. (10을 리턴)
		for (int i = 0; i < vector.size(); i++) { //vector.size() : 3
			Object obj = vector.elementAt(i);
			//데이터 여러개가 들어있는 걸 꺼내오려면 일단 Object로 접근해야 함! 각각의 데이터 타입이 Object 으로 저장되어 있는 거니까
			String s = (String) obj; //그 다음에 원래 데이터 타입으로 명시적 형변환
			
			//String s = (String)vector.elementAt(i); //위의 두 line과 비교
			System.out.print(s);
//			System.out.print((String)vector.elementAt(i));
		}
		
		System.out.println("\n ==> API 확인");
		vector.insertElementAt("4.길", 1); //1번 index에 길을 넣고 한칸씩 미룸
		for(int i = 0; i < vector.size(); i++) {
			System.out.print((String)vector.elementAt(i));
		}
		
		System.out.println("\n ==> API 확인");
		vector.setElementAt("5. 홍길순", 3); //3번 index에 홍길순을 넣음
		for(int i = 0; i < vector.size(); i++) {
			System.out.print((String)vector.elementAt(i));
		}
		
		System.out.println("\n ==> API 확인");
		vector.removeElementAt(3); //3번 index 지우고 한칸씩 땡김
		for(int i = 0; i < vector.size(); i++) {
			System.out.print((String)vector.elementAt(i));
		}
	}
	/*
	 *  Copy & Paste가 너무 많이 발생함
	 *  for 문 돌려서 추출하는 행위도 메소드로 만들어버리고 싶음.
	 *  Vector를 상속받아서 메소드 추가하면 되지않을까 ?
	 */
}
