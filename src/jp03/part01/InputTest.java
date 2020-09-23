package jp03.part01;

/*
 * 
 *  1. java.io.package : 프로그램 외부로 자원을 받거나 (?), 전달 (?) 경우에 사용
 *  2. keyboard 로 부터 data 를 읽어 들이면..
 */

import java.io.*;

public class InputTest {

	
	///Main Method
	public static void main(String[] args) {
		
		// InputStream :: 표준입력장치 추상화한 class
		InputStream inputStream = System.in;
		
		System.out.println("입력을 기다립니다.........");
		
		try {
			
			// 값을 읽어들이는 무한 loop 시작.
			while(true) {
				
				// 1. java.io 는 지연(block) 될 수 있다.
				int i = inputStream.read();
				char c = (char) i;
				
				// 2. java.io 는 FIFO 의 구조
				System.out.println("입력하신 값 : " + c);
				
				//==> char 'x'가 입력되면 while 종료
				if(c=='x' ) {
					inputStream.close();
					break;
				}
				// 한글 입력시 깨진다. 한글 1개당 2개 생기는 것을 확인하자
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
