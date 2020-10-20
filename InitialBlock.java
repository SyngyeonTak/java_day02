/*
초기화 블럭
*/

class InitialBlock{
	int sum = 0;
	//인스턴스가 생성될 때, 반복문을 돌려서, 총합을 넣어주고 싶다..
	

	//맴버영역안에 {지역화}시켰을 때 갖는 의미는?
	{
		//이 클래스의 인스턴스가 생성될 때마다 이 영역을 호출하게 됨
		//인스턴스 초기화 블럭이라 한다..
		System.out.println("인스턴스 초기화 블럭 호출");
	}
	
	//static 초기화 블럭
	//main()메서드에 의해 실행 직전에 실행되는 초기화 블럭
	static{
		System.out.println("실행하기전 초기화 블럭 실행하겠습니다.");
		System.out.println("A");
	}
	public static void main(String[] args){
		System.out.println("B");
		new InitialBlock();
		new InitialBlock();
		new InitialBlock();

		//그냥 블럭화 시켜놓은 것임, 혹여나 이 안에 변수를 선언하면 해당 블럭 내에서만
		//유효하다..
	}
}
