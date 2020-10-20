class Dog{
	String name = "도그";
	int age = 5;
	static String color = "white";// 이 변수는, 클래스로부터 생성된 인스턴스에 딸려올라가지 말고
	//클래스 원본에 딱 달라붙어 있어라,, 즉 인스턴스 소속이 아니라, 클래스 원본 소속으로 선언!!
		
	public void bark(){
		System.out.println("웤웤");
	}

	public static void main(String[] args){
		//Dog.color = "black"; //클래스 원본소속이라 원본 클래스로 접근해서 정적 변수를 바꿀 수 있음
		color = "yellow"; //main method가 Dog에 있으니까 같은 static영역에 있어 서로 접근 가능하다.
									//Dog을 안 붙여도 된다.
		int a = 8;
		Dog d1 = new Dog();
		Dog d2 = new Dog();

		d1.age = 10;
		d2.age = 9;

		boolean k = true;

	}
}
