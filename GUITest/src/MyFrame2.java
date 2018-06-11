import javax.swing.*;
import java.awt.FlowLayout;
public class MyFrame2 extends JFrame {
	public MyFrame2(){
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		
		setLayout(new FlowLayout());
		JButton button = new JButton("¹öÆ°");
		this.add(button);
		
		JLabel label = new JLabel("hi");
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame2 f= new MyFrame2();
	}

}
