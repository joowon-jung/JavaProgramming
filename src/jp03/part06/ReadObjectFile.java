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
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("UserInfo.obj"));
		
		UserVO user01 = (UserVO) ois.readObject(); //==> API 확인 ==> 명시적인 형변환 이유?
		UserVO user02 = (UserVO) ois.readObject(); //==> API 확인 ==> 명시적인 형변환 이유?
		
		System.out.println("1번째 회원정보 :: " + user01);
		System.out.println("2번째 회원정보 :: " + user02);
		
		//Stream close()
		ois.close();
	}
}
