class Dog{
	String name = "����";
	int age = 5;
	static String color = "white";// �� ������, Ŭ�����κ��� ������ �ν��Ͻ��� �����ö��� ����
	//Ŭ���� ������ �� �޶�پ� �־��,, �� �ν��Ͻ� �Ҽ��� �ƴ϶�, Ŭ���� ���� �Ҽ����� ����!!
		
	public void bark(){
		System.out.println("�p�p");
	}

	public static void main(String[] args){
		//Dog.color = "black"; //Ŭ���� �����Ҽ��̶� ���� Ŭ������ �����ؼ� ���� ������ �ٲ� �� ����
		color = "yellow"; //main method�� Dog�� �����ϱ� ���� static������ �־� ���� ���� �����ϴ�.
									//Dog�� �� �ٿ��� �ȴ�.
		int a = 8;
		Dog d1 = new Dog();
		Dog d2 = new Dog();

		d1.age = 10;
		d2.age = 9;

		boolean k = true;

	}
}
