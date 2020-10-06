package jp03.part05;

import java.io.*;

/*
 	==> keyboard로 입력받은 내용 test.txt로 보내는 Application 작성
 */
public class FileWriterTestFilter02 {
	
	///main method
	public static void main(String[] args) throws Exception {
		
		// 필요객체 Stream/String 인스턴스 declaration
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		// keyboard 로 입력받기 위한 Sink Stream Reader 및
		// 1개의 line 을 읽기편한 readLine() method 를 제공하는 BufferedReader 생성
		// Reader r = new InputStreamReader(System.in);
		// br = new BufferedReader(r);
		br = new BufferedReader(new InputStreamReader(System.in));
		
		// File 에 글을 쓰기 위한 FileWriter 및 BufferWriter 생성
		// FileWriter fw = new FileWriter("test.txt");
		// bw  = new BufferedWriter(fw);
												// ./src/jp03/part05/test.txt 하면 part05 안에 생김!
		//bw = new BufferedWriter(new FileWriter("test.txt")); // ==> API 확인
												// false : 원래의 내용에다가  새로 덮어씀
												// false 안 적었는데 왜 ? boolean 값은 초기화가 false이라서
		bw = new BufferedWriter(new FileWriter("./src/jp03/part05/test.txt", true)); // ==> API 확인
												// true : 원래의 내용에다가 계속 추가
		
		System.out.println("파일에 저장하실 글을 입력하세요.");
		while(true) {
			String str = br.readLine();
			if(str.equals("끝")) {
				break;
			}

			//bw.write(str); // 이렇게 안 하고 밑의줄처럼 하는 이유 => 
							 // "문자:안녕" , "동영상:~~~.mp4" 처럼 
							 // 문자나 동영상을 받을 때도 있을 텐데
							 // 그럴때 csv 구분 후(indexOf나, substring 사용해서) 파싱해서 원하는 인덱스부터 내보내기 위함
			bw.write(str, 0, str.length()); //==> API 확인하자
			bw.newLine(); 					//==> API 확인하자 (줄바꾸기)
		}
		bw.flush(); // flush 를 잊지 말 것
		
		// Stream close()
		br.close();
		bw.close();
	}

}
