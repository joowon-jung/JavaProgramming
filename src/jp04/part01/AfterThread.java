package jp04.part01;

/*
*	FileName : AfterThread.java
*/
public class  AfterThread extends Thread{
	
    ///Field
    private String name;

    ///Constructor
    public AfterThread(){
    }
	public AfterThread(String name){
		this.name = name;
	}

    ///Method
	public void run(){
		for(int i=1;i<100;i++){
			System.out.println(name+" : "+i+"*"+9+"="+i*9);
		}
	 }

    ///Main Method
	public static void main(String[] args){

		System.out.println("여기는 main start....");

		AfterThread bt1 = new AfterThread("1번째");
		AfterThread bt2 = new AfterThread("2번째");
        //==>start() method 는 어디에 있는가.??? => java.lang 안에 있음
		//import 하지 않았는데도 start() 메소드를 찾은 것을 보고 유추할 수 있다!
		//java.lang은 import 문 적지 않아도 자동 import 됨
        bt1.start();
		bt2.start();
		
        System.out.println("여기는 main end....");

	}//end of main

}//end of class

//==> 실행 결과는 ?
//==> start() method 의미는 ?