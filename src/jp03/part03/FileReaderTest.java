package jp03.part03;

import java.io.*;

public class FileReaderTest {

	///main method
		public static void main(String[] args) {
			
			//File 을 읽어 들이는 Stream 선언
			FileReader fr = null; // 레퍼런스 타입 초기화 NULL
			// read () 수 count 위한 변수
			int readCount = 0;
			
			try {
				fr = new FileReader(args[0]);
				// file reader => '문자 처리'하기 때문에 한글 안 깨짐!
			
				while(true) {
					int i = fr.read(); // 파일의 내용 읽어들임
					
					if (i == -1) { // i = -1 의 의미는 ==> API 확인할 것.
								   // 파일에 아무것도 써져있지 않을 때 종료
						break;
					}
					
					char c = (char) i;
					System.out.print(c);
					
					readCount++;
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			} finally {
				System.out.println("\n\n===============================");
				System.out.println("=====>> read 횟수 readCount : " + readCount);
				System.out.println("==================================");
				try {
					fr.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
}
