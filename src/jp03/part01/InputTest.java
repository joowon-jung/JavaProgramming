package jp03.part01;

/*
 *  1. java.io.package : 프로그램 외부로 자원을 받거나 , 전달의 경우에 사용
 *  2. keyboard 로 부터 data 를 읽어 들이면..
 */

// InputTest : 키보드로 읽고 내가 직접 형변환해서 System.out.println으로 출력했음 

import java.io.*;

public class InputTest {

	///Main Method
	public static void main(String[] args) {
		
		// InputStream :: 표준입력장치(키보드가 될 수도 있고, 파일들이 될 수도 있고.. 등등등) 추상화한 class
		InputStream inputStream = System.in; // System.in의 데이터 타입 : InputStream
		// System.in : 키보드를 추상화 & 캡슐화 한 것
		
		System.out.println("입력을 기다립니다.........");
		
		try {
			
			// 값을 읽어들이는 무한 loop 시작.
			while(true) {
				
				// 1. java.io 는 지연(block) 될 수 있다. => 아무것도 입력하지 않으면 커서 깜빡이면서 지연됨
				int i = inputStream.read(); // read() : 키보드에서 입력한 데이터를 int로 받아옴
				char c = (char) i; // int로 받아온 i를 char 타입으로 형변환
				
				// 2. java.io 는 FIFO 의 구조 (First In First Out)
				System.out.println("입력하신 값 : " + c);
				
				//==> char 'x'가 입력되면 while 종료
				if(c=='x') {
					inputStream.close(); // 다 썼으니 반납
					break; // while 문 빠져나감
				}
				// 한글 입력시 깨진다. 한글 1개당 2개 생기는 것을 확인하자
			}
		} catch (IOException e) {
			e.printStackTrace(); // 예의상 써줌
		}
	}
}
