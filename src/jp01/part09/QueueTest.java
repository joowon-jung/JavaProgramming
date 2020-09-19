package jp01.part09;

import java.util.LinkedList;
import java.util.Queue;

/*
 * :: java.util.Queue (First In First Out)
 * 각각의 Queue(interface) / LinkedList 를 확인, 각각의 Method 의미 확인
 * 아래의 출력결과를 이해 및 확인
 */

public class QueueTest {

	///Main Method
	public static void main(String[] args) {
		
		Queue<String> queue = new LinkedList<String>();
		
		String value = new String("1 : 홍길동");
		queue.offer(value);
		queue.offer(new String("2 : 이순신"));
		queue.offer("3 : 주몽");
		
		String str1 = (String)queue.poll();
		System.out.println(str1);
		
		String str2 = (String)queue.peek(); //==> poll(), peek() 차이점은...
		System.out.println(str2);
		
		//==> peek() 이 null을 return 하는 시점은.../ null을 return 하는 시점을 이용 반복문...
		while (queue.peek() != null) {
			String str3 = (String)queue.poll();
			System.out.println(str3);
		}
		
	}
}
