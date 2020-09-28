package jp01.part09;

import java.util.Stack;
import java.util.*;

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
		stack.push(value);
		stack.push(new String("2 : 이순신"));
		stack.push("3 : 주몽");

		System.out.println("==> 지정된 Data 갯수 : " + stack.size());
		String str1 = stack.pop();
		System.out.println(str1);

		System.out.println("==> 지정된 Data 갯수 : " + stack.size());
		String str2 = stack.peek(); // ==> pop(), peek() 의 차이점은...
		System.out.println(str2);

		System.out.println("==> 지정된 Data 갯수 : " + stack.size());
		while (!stack.isEmpty()) {
			String str3 = (String) stack.pop();
			System.out.println(str3);
		}
	}

}
