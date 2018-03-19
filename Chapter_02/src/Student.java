
public class Student {
	private int number;
	private String name;
	private int age;
	
	Student(){
		number = 100;
		name = "New Student";
		age= 18;
	}
	Student(int number, String name, int age){
		this.number = number;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString(){
		return "Student [number=" + number + ", name=" + name + ",age=" + age + "]";
	}
}	

class Point{
	public int x = 0;
	public int y = 0;
	
	//»ı¼ºÀÚ
	public Point(int x, int y){
		this.x =x;
		this.y = y;
	}
}


