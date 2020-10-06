package jp03.part02;

/*
  
   1. byte 처리를 위한 Stream 인 input/output Stream 을 이용하여
      keyboard 로 입력, monitor 로 출력되는 예...
   2. 한글 처리(문자 처리)를 위하여 Reader/Writer 계열로 바꾸어 입력, 출력
   
 */

// InputTest : 키보드로 읽고 (InputStream) 내가 직접 캐스팅해서 System.out.println으로 출력했음 
// WriterTest : 키보드로 읽고 (Reader) write()를 통해 출력 (Writer)

import java.io.*;

public class WriterTest {

	
	///Main Method
	public static void main(String[] args) {
		
		try {
			// InputStream :: 표준입력장치 추상화한 class
			InputStream inputStream = System.in;
			// 문자 처리를 위한 Reader 로 변경
			Reader reader = new InputStreamReader(inputStream);
			// Reader reader = new InputStreamReader(System.in);
			
			// OutputStream :: 표준출력장치 추상화한 class
			OutputStream outputStream = System.out;
			// System.out의 데이터타입은 printStream 인데 어떻게 OutputStream 안에 들어감?
			// printStream 은 OutputStream의 하위 클래스이기 때문에 가능함 ! 묵시적 형변환 !
			
			// 문자처리를 위한 Writer 로 변경
			Writer writer = new OutputStreamWriter(outputStream);
			//Writer writer = new OutputStreamWriter(System.out);
			
			System.out.println("입력을 기다립니다.....");
			
			while (true) {
				int i = reader.read(); // 읽음 
				writer.write(i); // 내부 buffer에서 write가 쏜 걸 하나씩 받음
				//writer.flush(); // buffer에 있는 걸 한꺼번에 쏨! flush()가 없으면 출력되지 않음 ★
				
				if ( (char) i == 'x') {
					break; // while문 종료
				}
			}
			// ==> while 문 내부의 flush()와 밖의 flush() 의 의미는 ?
			
			// flush()가  while문 내부에 있으면 writer.write(i)해서 내부적으로 Buffer에 담긴게 바로바로 출력이 됨
			// flush()가 while문 밖에 있으면 writer.write(i)로 값들을 Buffer에 담아놓기만 하게됨 출력은 안됨
			// ==> 주석 처리해서 실행해보기 
			// i == 'x'일 때 프로그램이 종료가 되니까 그때 while문 빠져나와서
			// writer.flush()를 실행해주면 Buffer에 담긴 값들이 다 출력되는 것임 !!
			
			writer.flush(); //==> 안 써도 외부자원을 다 쓰고 난 후 close()를 하면, 자동 flush()가 됨!
				// 이 프로그램에서는 x를 입력하면 while문을 빠져나오니까 close()를 만나서 자동 flush() 되는 것
			
			// Stream 사용했으면 꼭 닫아주기!!
			reader.close();
			writer.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
