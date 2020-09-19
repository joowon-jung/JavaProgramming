package jp01.part02;
/*
  		1. Primitive type variable : Method 인자 ==> Call By Value 
  		2. 실행결과를 예측하고, 코딩하여 예측결과 확인 : Call By Value 이해
 */
public class CallByValueTest {
	
	///Field 
	int number = 100;
	
	///Method
	public void valueChange(int value) {
		System.out.println("==============");
		value = value + 100;
		System.out.println("value : " + value);
		System.out.println("==============");
	}

	///Main Method
	public static void main(String[] args) {
		
		CallByValueTest call = new CallByValueTest();
		
		//method 의 인자 값으로 int (primitive DataType)
		call.valueChange(call.number);
		System.out.println("number : " + call.number);
	}
}
