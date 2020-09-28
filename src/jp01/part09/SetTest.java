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
		boolean isAddOk = hs.add(str);
		System.out.println("저장유무 : " + isAddOk);
		
		isAddOk = hs.add("b");
		System.out.println("저장유무 : " + isAddOk);
		
		isAddOk = hs.add("B");
		System.out.println("저장유무 : " + isAddOk);
		
		isAddOk = hs.add("B"); // set은 중복 불가
		System.out.println("저장유무 : " + isAddOk);
		
		System.out.println("저장된 data 갯수 : " + hs.size());
		if (hs.contains("b")) {
			System.out.println("저장된 data b 를 삭제함.");
			hs.remove("b");
		}
		System.out.println("저장된 data 갯수 : " + hs.size());
	}
}
