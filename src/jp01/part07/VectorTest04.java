package jp01.part07;

// VectorTest03 을 List로 객체 생성하는 걸로 바꿔 보기 !

import java.util.*;

public class VectorTest04 {

	///Main Method
	public static void main(String[] args) {
		
		//Vector 객체 생성시 관리(저장, 추출)될 인스턴스 DataType 명시
		//Vector<String> vector = new Vector<String>(10, 10);
		List <String> vector = new Vector <String>(10); 

		//Vector에 String 저장
		//add(E obj) : E를 인자로 받는다는 의미는 ? :: Generic 사용으로 묵시적 형변환 불필요
		//E : element 라는 뜻 !
		String s1 = new String("1.홍");
		vector.add(s1);
		vector.add(new String("2.동"));
		vector.add("3. 님 안녕");
		
		//Vector 저장된 값을 출력
		for (int i = 0; i < vector.size(); i++) {
			//Generic 사용으로 명시적 형변환 불필요
			String s = vector.elementAt(i); //list에 없고 VECTOR만 있는 구체적인 메소드
			System.out.print(s);
//			System.out.print(vector.elementAt(i));
		}
		
		System.out.println("\n JDK 1.5 추가기능 :: Generic, Enhanced For Loop 사용");
		//==> 위의 for 문과 비교하여 이해하자. / JDk1.5에 추가 가능 :: Enhanced For Loop
		//Vector 내부에 저장된 값을 size() 만큼 반복, 1개씩 추출 String 준다. (Generic 사용으로..)
		for (String value : vector ) {
			//vector.size() 만큼 돌려서 value안에 집어넣어 준다.
			//generic 사용으로 명시적 형변환 불필요
			System.out.print( value);
		}
		
		System.out.println("\n ==> API 확인");
		vector.insertElementAt("4.길", 1); //list에 없고 VECTOR만 있는 구체적인 메소드
		for(int i = 0; i < vector.size(); i++) {
			System.out.print(vector.elementAt(i)); //list에 없고 VECTOR만 있는 구체적인 메소드
		}
		
		System.out.println("\n ==> API 확인");
		vector.setElementAt("5. 홍길순", 3); //list에 없고 VECTOR만 있는 구체적인 메소드
		for(int i = 0; i < vector.size(); i++) {
			System.out.print(vector.elementAt(i)); //list에 없고 VECTOR만 있는 구체적인 메소드
		}
		
		System.out.println("\n ==> API 확인");
		vector.removeElementAt(3); //list에 없고 VECTOR만 있는 구체적인 메소드
		for(int i = 0; i < vector.size(); i++) {
			System.out.print(vector.elementAt(i)); //list에 없고 VECTOR만 있는 구체적인 메소드
		}
	}
}