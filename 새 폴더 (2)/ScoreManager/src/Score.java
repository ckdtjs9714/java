import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Score extends JFrame{
	public Score(){
		setSize(1200,500);
		setTitle("MyFrame");
		
		JPanel panelA = new JPanel();
		JPanel panel = new JPanel();
		
		
		Button name = new Button("�̸�");
		JTextField nametext = new JTextField(5);
		panel.add(name);
		panel.add(nametext);
		
		JButton add = new JButton("�߰�");
		panel.add(add);
		
		add.addActionListener(new ActionListener(){
			public void actionPerformed1(ActionEvent arg0){
				
			}

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		Button korean = new Button("��������");
		JTextField kortext = new JTextField(5);
		panel.add(korean);
		panel.add(kortext);
		
		JButton del = new JButton("����");
		panel.add(del);
		
		Button english = new Button("��������");
		JTextField engtext = new JTextField(5);
		panel.add(english);
		panel.add(engtext);
		
		JButton update = new JButton("����");
		panel.add(update);
		
		Button math = new Button("��������");
		JTextField mathtext = new JTextField(5);
		panel.add(math);
		panel.add(mathtext);
		
		String []title = {"�̸�","��������","��������","��������","����","���"};
		
		DefaultTableModel model = new DefaultTableModel(null,title);
		JTable table = new JTable(model);
		JScrollPane scroll = new JScrollPane(table);
		panelA.add(scroll);
		
		panel.setLayout(new GridLayout(0,3,10,10));
		add(panelA);
		panelA.add(panel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Score sc = new Score();
	}

}
