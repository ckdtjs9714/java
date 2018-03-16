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
		System.out.print("아이디를 입력하세요 :");
		a = scan.next();
		System.out.print("비밀번호를 입력하시오 : ");
		s1 = scan2.next();

		if (a.equalsIgnoreCase(id) && s1.equalsIgnoreCase(password)) {
			
				System.out.println("로그인이 성공하였습니다");
		}else{
				System.out.println("로그인이 실패하였습니다");
		}
	}
}
