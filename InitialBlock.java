/*
�ʱ�ȭ ��
*/

class InitialBlock{
	int sum = 0;
	//�ν��Ͻ��� ������ ��, �ݺ����� ������, ������ �־��ְ� �ʹ�..
	

	//�ɹ������ȿ� {����ȭ}������ �� ���� �ǹ̴�?
	{
		//�� Ŭ������ �ν��Ͻ��� ������ ������ �� ������ ȣ���ϰ� ��
		//�ν��Ͻ� �ʱ�ȭ ���̶� �Ѵ�..
		System.out.println("�ν��Ͻ� �ʱ�ȭ �� ȣ��");
	}
	
	//static �ʱ�ȭ ��
	//main()�޼��忡 ���� ���� ������ ����Ǵ� �ʱ�ȭ ��
	static{
		System.out.println("�����ϱ��� �ʱ�ȭ �� �����ϰڽ��ϴ�.");
		System.out.println("A");
	}
	public static void main(String[] args){
		System.out.println("B");
		new InitialBlock();
		new InitialBlock();
		new InitialBlock();

		//�׳� ��ȭ ���ѳ��� ����, Ȥ���� �� �ȿ� ������ �����ϸ� �ش� �� ��������
		//��ȿ�ϴ�..
	}
}
