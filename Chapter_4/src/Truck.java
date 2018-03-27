
public class Truck extends Vehicle{
	int carrySize;//Á¾·ù
	public void setcarrySize(int t){
		this.carrySize=t;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Truck tr = new Truck();
		tr.Speed = 10;
		tr.setSpeed(60);
		tr.setcarrySize(5);
	}

}
