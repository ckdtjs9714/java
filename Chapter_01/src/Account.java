import java.util.*;

public class Account {
	private int regNumber;
	private String name;
	private int balance;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if ( 0 > balance ) {
			System.out.println("0 �̻��� ���� �Է��� �ּ���");
		} else {
			this.balance =balance;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account obj = new Account();
		obj.setName("Tom");
		// obj.setBalance(100000);
		Scanner scan = new Scanner(System.in);
		System.out.print("�ݾ��� �Է��ϼ��� :");
		obj.setBalance( scan.nextInt());
		System.out.println("�̸���" + obj.getName() + "�����ܰ��" + obj.getBalance() + "�Դϴ�");
	}

}
