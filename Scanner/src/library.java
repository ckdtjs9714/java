
public class library {
	String libName;//�������̸�
	int bookCount;//�������� �ִ� å�� ����
	int staffCount;//�������� �ٹ��ϴ� ������
	int userCount;//�̿��ڵ��� ��
	void print1(){
		System.out.println( libName+"�� �����ϰ� �ִ� å��"+bookCount+"�� �Դϴ�"
				+ "����"+staffCount+"���� ������ �ٹ��ϰ� ������"+userCount+"���� �̿��� �е��� �̿� �ϰ� �ֽ��ϴ�");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
	}

}
class User{
	int level;//����� ����
	String name;//�̿��� �̸�
	String age;//�̿��� ����
	int lendmax;//�����ִ��
	String lendingBooks;//�̿��ڰ� ����å
	int allLendingBook;//�̿��ڰ� ������� å 
	boolean returnDate;//�̿����� �ݳ����� �ݳ��Ⱓ�� ������ false ������ true
	void print1(){
		System.out.println();
	}
	public static void main(String[] args) {
		// TODOAuto-generated method stub
		

	}
}
class book{
	String title;//å�� ����
	String genre;//å�� �帣
	int ageCut;//å�� ��������
	int lendCound;//����������?
	boolean lend;//���� ������ ���� �����Ѱ��� ���� ���� ���� true �Ұ��� false
	void print1(){
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
}
