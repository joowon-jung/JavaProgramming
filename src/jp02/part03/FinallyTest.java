package jp02.part03;

import java.io.*;

/*
*  FileName : Finallytest.java
*  
*	1.  try-catch-finally   의미 
*	2.  다중 catch 문을 이해 : 다중 catch  경우 Hierarchy 상위를 하부의 catch 기술 처리
*	3.  RuntimeException(Unchecked) / 그외 Exception( Checked ) 의 차이점 이해 
*	  ㅇ RuntimeExcetpion 하위: 컴파일시 check 하지 않는다.		==> UnChecked Exception
          ==> 우리가 얼마든지 유효성 체크로 체크해줄수 있으니  너무 신경 쓰지 않아도 됨 !
*     ㅇ 그외 Exception : 컴파일시 check, Compile Error  		==> Checked Exception
*/
public class FinallyTest{

	///Field
	private char[] c = new char[1024];
	private FileReader fileReader;

	///Constructor
	public FinallyTest(){
	}
	public FinallyTest(String fileName){
		this.fileRead(fileName); 
	}

	///method
	//1. 다중 catch 문의 이해 		==> 다중 catch 문 사용시 하위 Exception  먼저 처리
	//2. finally  이해           	 ==> Exception 발생유무와 관계없이 무조건 실행
	public void fileRead(String str){
		try{
			fileReader = new FileReader(str); 
			fileReader.read(c,0,1024);     
		// 다중 catch 문을 쓸 때는 하위 클래스를 제일 위에 올려놓기
		// 맨 밑에 Exception 쓰는거 습관 들이기 => 혹시 위에서 안 잡은 문제들을 잡아주기 위함 
		}catch(FileNotFoundException e1){ // 파일을 찾을수 없을때
		//} catch(IOException e1) { //==> 해도 오류가 나지 않음 
		// IOException 는 FileNotFoundException 을 포함하고 있기 때문에
			System.out.println("e1 : "+e1);
			System.out.println(str+" : File이 없습니다.");
		}catch(IOException e2){ // 읽다가 파일 깨졌을때
		// } catch(FileNotFoundException e1) { //==> 하면 오류남!  
		// FileNotFoundException 는  IOException 의 하위클래스 이기 때문에
			System.out.println("e2 : "+e2);
			System.out.println("read() method에서 Exception 발생");
		}catch(Exception e3){ // 제일 상위 클래스를 맨 마지막
			System.out.println("e3 : "+e3);
			System.out.println("모든 Exception 은 내가 잡는다.");
		}finally{
			System.out.println("여기는 fileRead() :: Exception이 발생하던 말던 나는 실행");
		}
	}
	
}//end of class