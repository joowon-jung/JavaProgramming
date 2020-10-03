package jp01.part09;

import java.util.Stack;

/*
 * :: java.util.Stack (Last In First Out)
 * 각각의 API 를 확인하고 각각의 Method 의미를 확인
 * 아래의 출력결과를 이해 및 확인
 */
public class StackTest {

	/// Main Method
	public static void main(String[] args) {

		Stack<String> stack = new Stack<String>();
		// List<String> stack = new Stack<String>(); => 인덱스를 Stack 구조로 관리하겠다는 얘기

		String value = new String("1 : 홍길동");
		stack.push(value); // push() : 객체 집어넣음
		stack.push(new String("2 : 이순신"));
		stack.push("3 : 주몽");

		System.out.println("==> 저장된 Data 갯수 : " + stack.size()); // size() : 저장되어있는 객체 수
		String str1 = stack.pop();  // pop() : 데이터를 아예 뽑는 것 (제거)
		System.out.println(str1);

		System.out.println("==> 저장된 Data 갯수 : " + stack.size());
		String str2 = stack.peek(); // peek() : 데이터 반환만 하고 제거는 안 함
		System.out.println(str2);

		System.out.println("==> 저장된 Data 갯수 : " + stack.size());

		while (!stack.isEmpty()) { // boolean isEmpty() : 비어있니? true 안 비어있으면 false
			String str3 = (String) stack.pop(); // pop() : 데이터를 아예 뽑는 것 (제거)
			System.out.println(str3);
		}
		
		System.out.println("==> 저장된 Data 갯수 : " + stack.size());
	}

}
