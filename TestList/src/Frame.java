
import java.awt.FlowLayout;

import javax.swing.*;
public class Frame extends JFrame{
	public Frame(){
		setSize(600,150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		
		JPanel panel = new JPanel();
		JPanel panelA = new JPanel();
		JPanel panelB = new JPanel();
		panelA.setSize(50,30);
		
		JLabel label1 = new JLabel("�̸�");
		JTextField field1 = new JTextField(10);
		panelA.add(label1);
		panelA.add(field1);
		
		
		JLabel label2 = new JLabel("��������");
		JTextField field2 = new JTextField(3);
		panelA.add(label2);
		panelA.add(field2);
		
		
		JLabel label3 = new JLabel("��������");
		JTextField field3 = new JTextField(3);
		panelA.add(label3);
		panelA.add(field3);
		
		
		JLabel label4 = new JLabel("��������");
		JTextField field4 = new JTextField(3);
		panelA.add(label4);
		panelA.add(field4);
		
		JButton button1 = new JButton("�߰�");
		panelB.add(button1);
		JButton button2 = new JButton("����");
		panelB.add(button2);
		JButton button3 = new JButton("����");
		panelB.add(button3);
		
		panel.add(panelA);
		panel.add(panelB);
		add(panel);
		
		panelA.setLayout(new FlowLayout());
		
		setVisible(true);
	}
	public static void main(String[] args){
		Frame f = new Frame();
		
		
	}

}
