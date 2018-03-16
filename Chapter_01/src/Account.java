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
			System.out.println("0 이상의 값을 입력해 주세요");
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
		System.out.print("금액을 입력하세요 :");
		obj.setBalance( scan.nextInt());
		System.out.println("이름은" + obj.getName() + "통장잔고는" + obj.getBalance() + "입니다");
	}

}
