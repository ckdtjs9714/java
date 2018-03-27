
public class Car extends Vehicle {
	String kind;//Á¾·ù
	public void setkind(String type){
		this.kind=type;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
		c.Speed = 10;
		c.setSpeed(60);
		c.setkind("Sports Car");
		
		
	}

}
