package jp01.part07;

// ArrayListTest03 을 List로 객체 생성하는 걸로 바꿔 보기 !

import java.util.*;

public class ArrayListTest04 {

	///Main Method
	public static void main(String[] args) {
		
		//ArrayList 생성시 관리(저장, 추출)될 객체의 DataType 선언
		List<String> arrayList = new ArrayList<String>(10); // List <String> arrayList = new ArrayList<String>(10); 가능!
		
		// add(E obj) : E를 인자로 받는다는 의미는 ? :: Generic 사용으로 묵시적 형변환 불필요
		String s1 = new String("1.홍");
		arrayList.add(s1); // list 안의 메소드가 오버라이딩 된 것
		arrayList.add(new String("2.길"));
		arrayList.add("3. 님 안녕하세요");
		
		//ArrayList 저장된 값을 출력
		for (int i = 0; i < arrayList.size(); i++) {
			//Generic 사용으로 명시적 형변환 불필요
			System.out.print(arrayList.get(i));
		}
		
		System.out.println("\n JDK 1.5 추가기능 :: Generic, Enhanced For Loop 사용");
		//==> 위의 for 문과 비교하여 이해하자. / JDk1.5에 추가 가능 :: Enhanced For Loop
		//ArrayList 내부에 저장된 값을 size() 만큼 반복, 1개씩 추출 String 준다. (Generic 사용으로..)
		for (String value : arrayList ) {
			System.out.print(value);
		}
		
		System.out.println("\n ==> API 확인");
		arrayList.add(1, "4.길"); // // list 안의 메소드가 오버라이딩 된 것
		for(int i = 0; i < arrayList.size(); i++) {
			System.out.print(arrayList.get(i)); // list 안의 메소드가 오버라이딩 된 것
		}
		
		System.out.println("\n ==> API 확인");
		arrayList.set(3, ", 4. 홍길순"); // list 안의 메소드가 오버라이딩 된 것
		for(int i = 0; i < arrayList.size(); i++) {
			System.out.print(arrayList.get(i));
		}
		
		System.out.println("\n ==> API 확인");
		arrayList.remove(3); // list 안의 메소드가 오버라이딩 된 것
		for(int i = 0; i < arrayList.size(); i++) {
			System.out.print(arrayList.get(i));
		}
	}
}
