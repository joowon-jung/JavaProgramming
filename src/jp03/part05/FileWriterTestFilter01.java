package jp03.part05;

import java.io.*;

/*
 	==> FileCopy 하는 Application 작성
 	1. keyboard 로 FileName 을 입력
 	2. File 의 내용을 read() ==> FileReader
 	3. File 로 내용을 write() ==> FileWriter
 */
public class FileWriterTestFilter01 {
	
	///main method
	public static void main(String[] args) throws IOException {
		
		// 필요객체 Stream/String 인스턴스 declaration
		BufferedReader br = null; 
		BufferedWriter bw = null;
		String fileName = "";
		String copyFileName = "";
		
		int readCount = 0; // read를 Count 하기 위한 변수
		
		System.out.print("copy 할 file 이름을 입력하세요 : ");
		// copy 할 FileName 을 입력받기...
		
//		InputStream is = System.in;
//		InputStreamReader ir = new InputStreamReader(is);
//		BufferedReader br = new BufferedReader(ir);
//		밑의 라인과 같은 뜻 !
		
		fileName = new BufferedReader(new InputStreamReader(System.in)).readLine();
		// readLine() 은 어떻게 한 줄인지 알까? api 찾아보면 '\n' or '\r' 로 구분한다고 나와있음
		// 한 줄을 치면 뒤에 '\n' or '\r'이 숨겨져 있음!
		
		// ==> 원본파일 Data를 read 할 수 있는 BufferedReader 생성
		br = new BufferedReader ( new FileReader ( fileName )) ;
		
		// ==> 사본파일 이름 만들기
		copyFileName = fileName + "_copy";
		// => Data를 write 할 수 있는 BufferedWriter 생성
		bw = new BufferedWriter( new FileWriter(copyFileName ) );
		
		// read / writer 하는 while 문
		String source = null; // source : 파일 안의 내용들.
		while ( ( source = br.readLine()) != null ) { 
			bw.write(source + '\n'); // '\n' 을 쓰던, newLine()을 쓰던 개행되게 수정하기
							  // write()는 한줄씩 읽지 않고 다 읽으니까
			readCount++;
		}
		bw.flush(); // ==> 잊지 말 것 !
		
		// Stream close()
		bw.close();
		br.close();
		
		System.out.println("\n\n===============================");
		System.out.println("=====>> read 횟수 readCount : " + readCount);
		System.out.println("==================================");
	}

}
