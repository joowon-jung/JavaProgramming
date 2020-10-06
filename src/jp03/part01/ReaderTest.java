package jp03.part01;

/*
 
  1. java.io package : 프로그램 외부로 자원을 받거나, 전달 경우에 사용
  2. keyboard 로 부터 data 를 읽어 들이면...
  ========================================================
  InputStream 은 한글처리(2byte)가 되지 않는다. => 1byte 처리 
  문자를 처리하는 Reader 계열로 바꾸면...
  
  1234 입력했는데 6번 for문이 도는 이유 : \r, \n이 숨어있음
 */
import java.io.*;

public class ReaderTest {

	//Main Method
	public static void main(String[] args) {
		
		try {
			
			// InputStream :: 표준입력장치(키보드가 될 수도 있고, 파일들이 될 수도 있고.. 등등등)  추상화한 class
			InputStream inputStream = System.in; // System.in : 키보드 추상화 & 캡슐화 한 것 
			// System.in의 데이터 타입 : InputStream
			
			// InputStream 타입으로 처리하면 문자열 깨짐 | InputStream => 1byte 처리
			// Reader 사용! (byte 처리 (InputStream) ==> 문자처리 변경 (Reader) )
			Reader reader = new InputStreamReader(inputStream);
			//Reader reader = new InputStreamReader(System.in);
			
			System.out.println("입력을 기다립니다......");
			
			// 값을 읽어들이는 무한 loop 를 시작.
			while (true) {
				
				// 1. java.io 는 지연(block)될 수 있다. 
				int i = reader.read();
				char c = (char) i; // int로 읽어들인 것을 char로 명시적 형변환
				
				// 2. java.io 는 FIFO 의 구조 (First In First Out)
				System.out.println("입력하신 값 : " + c);
				
				// ==> char 'x'가 입력되면 while 종료
				if (c == 'x') {
					inputStream.close();
					break; // while문 빠져나감
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
