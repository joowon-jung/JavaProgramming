package jp03.part06;

import java.io.*;

/*
 * 		ObjectOutputStream을 이용 회원정보를 갖는 UserVO instance 를
 *  	(객체는 상태를 갖는다 / 상태정보를) persistence data(File)로 저장
 */
public class WriteObjectFile {
	
	///main method
	public static void main(String[] args) throws Exception {
		
		// 1. instance를 File에 저장할(내보낼) SinkStream :: FileOutputStream 생성
		// 2. instance를 전송하는 FilterStream :: ObjectOutputStream 생성
		
//		FileOutputStream fos = new FileOutputStream("UserInfo.obj"); // 이 이름을 가진 파일로 내보낸단 얘기 
//		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("UserInfo.obj"));
		
		oos.writeObject(new UserVO(1, "홍길동")); // ==> API 확인
		// 객체 형식을 파일로 내보냄
		oos.writeObject(new UserVO(2, "홍길순"));  // ==> API 확인
		
		//Stream close()
		oos.close(); // 다 썼으면 항상 닫아줌!
	}

}
