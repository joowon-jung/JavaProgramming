package jp03.part06;

import java.io.*;

/*
 * 		ObjectInputStream 을 이용 Persistence data(File)에 저장된
 *		회원정보를 갖는 UserVO instance 를 (객체는 상태를 갖는다 / 상태정보를) 읽어온다.
 */
public class ReadObjectFile {

	///main method
	public static void main(String[] args) throws Exception {
		
		// 1. File에서 instance 를 읽을 SinkStream :: FileInputStream 생성
		// 2. instance 를 읽는 FileStream :: ObjectInputStream 생성
		
//		FileInputStream fis = new FileInputStream("UserInfo.obj");
//		ObjectInputStream ois = new ObjectInputStream(fis); // Api 생성자 찾아보면 InputStream 을 인자로 받는 생성자임!
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("UserInfo.obj"));
		
		UserVO user01 = (UserVO) ois.readObject(); //==> API 확인 ==> 명시적인 형변환 이유? 뭘 읽어들일 지 모르기 때문에 Object로 읽어들이고, 명시적 형변환!
																	// readObject()의 리턴 타입은 Object !
		UserVO user02 = (UserVO) ois.readObject(); //==> API 확인 ==> 명시적인 형변환 이유?
		
		System.out.println("1번째 회원정보 :: " + user01); // 레퍼런스 타입을 찍으면 toString()이 생략되어 있음
													    // 사실상 user01.toString() 호출한 것 
		System.out.println("2번째 회원정보 :: " + user02);
		
		//Stream close()
		ois.close();
	}
}