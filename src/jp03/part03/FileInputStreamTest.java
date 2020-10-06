package jp03.part03;

import java.io.*;

// 파일이름이 오타나서 null이 들어갔을때랑, 인자가 아무것도 들어오지 않을 때
// validation check 해주기 ! ==> 미완
// ==> 자바 Runtime Exception 은 개발자가 validation check해서 
// 얼마든지 오류 잡아줄 수 있다! (unchecked exception)

// 인자 집어넣을 때 그냥 파일이름.java 하면 오류남 ! 경로까지 다 지정해줘서 입력해야 한다 !

/*
상대경로 : ./src/jp03/part03/FileInputStreamTest.java (. = current 디렉토리)
절대경로 : c:\workspace\JavaProgramming\src\jp03\part03\FileInputStreamTest.java
*/
public class FileInputStreamTest {

	///main method
	public static void main(String[] args) {
		
		// File 을 읽어 들이는 Stream 선언
		FileInputStream fis = null; // 레퍼런스 타입 초기화 NULL
		
		// read () 수 count 위한 변수
		int readCount = 0;
		
		try {
			fis = new FileInputStream(args[0]); 
			// inputStream => 1byte 씩 읽기 때문에 한글 깨짐
			
			while(true) {
				int i = fis.read(); // 파일 내용 읽음
				
				if (i == -1) { // i = -1 의 의미는 ==> API 확인할 것.
					           // end of file : 더이상 읽을게 없을 때  -1
					break;
				}
				
				char c = (char) i;
				System.out.print(c);
				
				readCount++; // for문 몇번 도는지 확인하기 위함
			}
		} catch (FileNotFoundException e) { //다중 catch문은 하위클래스부터 먼저 써줌!
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		} finally { // 무조건 실행
			System.out.println("\n\n===============================");
			System.out.println("=====>> read 횟수 readCount : " + readCount);
			System.out.println("=================================");
			try {
				if (!(fis == null)) { // 오타나서 null이 들어갔을때 validation check // 미완
					fis.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
