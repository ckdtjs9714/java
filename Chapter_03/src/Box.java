
public class Box {
//	int width, length, height;
//	int volume;
//	
//	Box(int w, int l, int h){
//		width = w;
//		length = l;
//		height = h;
//		
//		volume = w * l * h;
//	}
//	Box whosLargest(Box box1, Box box2){
//		if(box1.volume > box2.volume)
//			return box1;
//		else
//			return box2;
//	}
	int width, length, height;
	
	Box(int w, int l, int h){
		width = w;
		length = l;
		height = h;
	}
	boolean isSameBox(Box obj){
		if((obj.width == width) & (obj.length == length) & (obj.height == height))
			return true;
		else 
			return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Box obj1 = new Box(10, 20, 50);
//		Box obj2 = new Box(10, 30, 30);
//		
//		Box largest = obj1.whosLargest(obj1, obj2);
//		System.out.println("(" + largest.width + "," + largest.length + "," + largest.height + ")");
		Box obj1 = new Box(10, 40, 40);
		Box obj2 = new Box(10, 40, 40);
		
		System.out.println("obj1 == obj2 : " + obj1.isSameBox(obj2));
	}

}
