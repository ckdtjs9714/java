import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a;
		String s1;
		String id = "ckdtjs9714";
		String password = "@asdf48650";
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		System.out.print("���̵� �Է��ϼ��� :");
		a = scan.next();
		System.out.print("��й�ȣ�� �Է��Ͻÿ� : ");
		s1 = scan2.next();

		if (a.equalsIgnoreCase(id) && s1.equalsIgnoreCase(password)) {
			
				System.out.println("�α����� �����Ͽ����ϴ�");
		}else{
				System.out.println("�α����� �����Ͽ����ϴ�");
		}
	}
}
