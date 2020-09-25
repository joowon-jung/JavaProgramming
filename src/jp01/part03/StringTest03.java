package jp01.part03;

/*
 	
 	==> 각각의 method를 API에 확인하고, 출력 결과를 확인.
 	
 */
public class StringTest03 {

	/// Main Method
	public static void main(String[] args) {

		String name = "012ABCdef";
		String hi = "HI !";

		//출력결과 확인하고 api가 어떻게 사용되는지 확인하기
		
		String s1 = hi.concat(name); //concat : 문자열을 뒤에 덧붙인다.
		System.out.println(s1);

		String s2 = s1.substring(7); //substring : 7부터 끝까지 자른다.
		System.out.println(s2);

		int a = name.indexOf("ABC"); //indexOf : 주어진 문자가 문자열에 존재하는지 확인하여 위치를 알려줌
		System.out.println(a); //3
		System.out.println(name.substring(a)); 

		int b = name.indexOf("ABC");
		System.out.println(b); //3
		System.out.println(name.substring(b)); //3
		System.out.println(name.substring(b, 5)); //3,5 까지면 3번째 4번째만 출력. 5번째는 출력 x
												  //시작위치는 범위에 포함하지만, 끝 위치는 포함 x

		int c = name.indexOf("z"); // 찾는 문자가 없으면 -1 리턴
		System.out.println(c);
	}

}
