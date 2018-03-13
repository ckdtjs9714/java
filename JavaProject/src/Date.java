
public class Date {
	int year;
	int month;
	int day;
	String mon;
	
	void print1(){
		System.out.println(year + "." + month + "." + day);
	}
	void print2(){
		System.out.println(mon + "." + day + "." + year);
	}
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d;
		d = new Date();
		d.year = 2012;
		d.month = 7;
		d.day = 12;
		d.print1();
		
		d = new Date();
		d.year = 2012;
		d.mon = "july";
		d.day = 12;
		d.print2();
	}

}
