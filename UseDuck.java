class UseDuck{

	public static void main(String[] args){
		//오리의 인스턴스를 메모리에 올려보자!!
		int x = 5; //java실행부가 지역변수를 만나면... static영역			stack영역			heap영역
																					//모든 지역변수
																					//기본 자료형만...
		Duck d = new Duck();//사물형, 물체형 -     클래스		      heap메모리 주소	<- new(인스턴스)
																// load			   클래스@주소...					

		//d와 같이 사물자체를 보유하고 있는 변수가 아닌, 사물의 메모리상의 위치만 알려주는 변수를
		//레퍼런스(참조)변수라고 한다.

		System.out.println("오리가 존재하는 힙 영역의 주소는 "+d);

		//메인 메서드가 끝나면 stack영역은 사라지지만, heap영역에 있는 인스턴스는 사라지지 않는다
		//(따로 소멸시키는 기능이 없다..)
	}
}
