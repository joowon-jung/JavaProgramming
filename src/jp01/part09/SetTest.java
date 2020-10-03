package jp01.part09;

import java.util.HashSet;
import java.util.Set;
/*
 * 
 *  :: java.util.HashSet : data의 중복을 허용하지 않는 자료 저장
 *     각각의 Set(interface) / HashSetAPI를 확인하고 각각의 Method 의미를 확인
 *     아래의 출력결과를 이해 및 확인
 */
public class SetTest {

	///Main Method
	public static void main(String[] args) {
		
		Set<String> hs = new HashSet<String> ();
		
		String str = new String("A");
		boolean isAddOk = hs.add(str); // boolean add(E e)
									   // 객체가 저장되면 true, 중복되있는 객체가 있어 저장되지 않으면 false
		System.out.println("저장유무 : " + isAddOk);
		
		isAddOk = hs.add("b");
		System.out.println("저장유무 : " + isAddOk);
		
		isAddOk = hs.add("B");
		System.out.println("저장유무 : " + isAddOk);
		
		isAddOk = hs.add("B"); // B가 이미 저장되어 있음. Set은 중복 불가!
		System.out.println("저장유무 : " + isAddOk); // false
		
		System.out.println("저장된 data 갯수 : " + hs.size()); // int size() : 저장되어있는 객체 수 리턴
		if (hs.contains("b")) { // boolean contains(Object o) : 주어진 객체가 저장되어있는지 여부
			System.out.println("저장된 data b 를 삭제함.");
			hs.remove("b"); // boolean remove(Object o) : 주어진 객체 삭제
		}
		System.out.println("저장된 data 갯수 : " + hs.size());
	}
}
