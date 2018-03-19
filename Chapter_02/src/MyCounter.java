
public class MyCounter {
//	int counter;
//	MyCounter(){
//		counter=1;
//	}
	int counter;
	MyCounter(int value){
		counter = value;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		MyCounter obj1 = new MyCounter();
//		MyCounter obj2 = new MyCounter();
//		System.out.println("°´Ã¼ 1ÀÇ counter = " + obj1.counter);
//		System.out.println("°´Ã¼ 2ÀÇ counter = " + obj2.counter);
		MyCounter obj1 = new MyCounter(100);
		MyCounter obj2 = new MyCounter(200);
		
		System.out.println("°´Ã¼ 1ÀÇ counter=" + obj1.counter);
		System.out.println("°´Ã¼ 2ÀÇ counter=" + obj2.counter);
		
	}

}
