import javax.swing.*;

public class MyFrame extends JFrame
//기존에 반들어논 프래임을 상속받음 ??한번에 쓰는 것도 가능??
{
	public MyFrame(){
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("asdf");
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame f = new MyFrame();
	}

}
