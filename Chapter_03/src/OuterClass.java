
public class OuterClass {
	private int value = 80;
	
	class InnerClass{
		public void myMethod(){
			System.out.println("�ܺ� Ŭ������ private ���� ��:" + value);
		}
	}
	OuterClass(){
		InnerClass obj = new InnerClass();
		obj.myMethod();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass outer = new OuterClass();
	}

}
