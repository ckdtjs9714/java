
public class Triangle extends Shape {
	private int underLine;
	private int height;
	
	public int getWidth(){return underLine;}
	public void setWidth(int line){this.underLine = line;}
	public int getHeight(){return height;}
	public void setHeight(int height){this.height = height;}
	double area(){
		return (double)underLine *height;
	}
	void draw(){
		System.out.println("("+this.getX()+"," + this.getY() + ") 위치에" +"밑변 :" + underLine + "높이:" + height);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle r1 = new Triangle();
		Triangle r2 = new Triangle();
		
		r1.setX(5);
		r1.setY(4);
		r1.setWidth(50);
		r1.setHeight(20);
		
		r2.setX(8);
		r2.setY(9);
		r2.setWidth(10);
		r2.setHeight(20);
		
		r1.print();
		r1.draw();
		r2.print();
		r2.draw();
	}

}
