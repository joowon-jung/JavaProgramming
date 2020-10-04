package jp02.part05;

/*
 * 	<< Inner Member Class >>
 *  1. innerMemberClass 는 class 를 구성하는 Field, method 와 같이 Class가 구성하는
 *    Member 가 될 수 있다.
 *  2. 사용이유는 : OuterClass와 밀접한 관련
 *  3. 컴파일 후 innerClass는 어떤 형태의 class가 되는지 확인 (~~~ $ ~~~. class)
 */
public class OuterClass01 {

	///Field
	private String outer = "OuterClass 의 Field";
	
	///Constructor
	public OuterClass01() {
	}
	
	///Method
	public void outerMethod() {
		System.out.println("::"+this.getClass().getName()+" start.. ");
		// innerClass에 접근 할 경우 인스턴스 생성 후 접근
		InnerClass ic = new InnerClass(); // 꼴에 클래스라고 인스턴스 생성 해줘야 함
		ic.innerMethod();
		System.out.println("::"+this.getClass().getName()+" end.. ");
	}
	
	///InnerMember Class
	public class InnerClass {
		///Field
		private String inner = "InnerClass 의 Field";
		///Constructor
		public InnerClass() {
		}
		///Method
		public void innerMethod() {
			//innerClass에서 outer class 로 접근
			//OuterClass의 Field, Method 에 쉽게 접근 :: 레퍼런스 불필요
			System.out.println("::"+this.getClass().getName()+" start.. ");
			//==> OuterClass의 Field 접근 방식 :: 2가지
			System.out.println(outer); // InnerClass 가 OuterClass 안에 포함되어 있으니까 이렇게 쓰면 찾을 수 있는데,
			//System.out.println(this.outer); // this.outer  이렇게 하면 InnerClass 안에서만 접근하니까 찾을 수 없어서 오류가 남!
			System.out.println(OuterClass01.this.outer); // 근데 outer라고만 하면 헷갈리니까 OuterClass01.this.outer 이렇게 접근하자
	
			System.out.println(inner);
			System.out.println("==>"+this.getClass().getName()+" end.. ");
		}
	}
	
	///main method
	public static void main(String[] args) {
		// OuterClass01 oc = new OuterClass01();
		// oc.outerMethod();
		new OuterClass01().outerMethod();
	}
}
