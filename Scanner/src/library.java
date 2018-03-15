
public class library {
	String libName;//도서관이름
	int bookCount;//도서관에 있는 책의 개수
	int staffCount;//도서관에 근무하는 직원수
	int userCount;//이용자들의 수
	void print1(){
		System.out.println( libName+"이 보유하고 있는 책은"+bookCount+"개 입니다"
				+ "현재"+staffCount+"명의 직원이 근무하고 있으며"+userCount+"영의 이용자 분들이 이용 하고 있습니다");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
	}

}
class User{
	int level;//사용자 레벨
	String name;//이용자 이름
	String age;//이용자 나이
	int lendmax;//대출최대수
	String lendingBooks;//이용자가 빌린책
	int allLendingBook;//이용자가 빌린모든 책 
	boolean returnDate;//이용자의 반납여부 반납기간이 지나면 false 여유면 true
	void print1(){
		System.out.println();
	}
	public static void main(String[] args) {
		// TODOAuto-generated method stub
		

	}
}
class book{
	String title;//책의 제목
	String genre;//책의 장르
	int ageCut;//책의 나이제한
	int lendCound;//빌려진개수?
	boolean lend;//현재 빌리는 것이 가능한가에 대한 여부 가능 true 불가능 false
	void print1(){
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
}
