import javax.swing.*;
import java.awt.*;

public class ChangeTemperature extends JFrame{
	public ChangeTemperature(){
		setSize(1200,500);
	
		setTitle("�����������α׷�");
		
		JPanel panel = new JPanel();
		JPanel panelA = new JPanel();
		JPanel panelA_1 = new JPanel();
		JPanel panelA_2 = new JPanel();
		JPanel panelB = new JPanel();
		
		Button name = new Button("�̸�");
		JTextField field1 = new JTextField(5);
		panelA_1.add(name);
		panelA_1.add(field1);
		
		Button korean = new Button("��������");
		JTextField field2 = new JTextField(5);
		panelA_1.add(korean);
		panelA_1.add(field2);
		
		Button english = new Button("��������");
		JTextField field3 = new JTextField(5);
		panelA_1.add(english);
		panelA_1.add(field3);
		
		Button math = new Button("��������");
		JTextField field4 = new JTextField(5);
		panelA_1.add(math);
		panelA_1.add(field4);
		
		JButton add = new JButton("�߰�");
		panelA_2.add(add);
		
		JButton del = new JButton("����");
		panelA_2.add(del);
		
		JButton update = new JButton("����");
		panelA_2.add(update);
//		panelA_1.setLayout(new GridLayout(4,2));
//		panelA_2.setLayout(new GridLayout(3,1));
		

		
		String header[] = {"�̸�","��������","��������","��������"};
		String content[][] = {};
		JTable table = new JTable(content,header);
		JScrollPane scrollpane = new JScrollPane(table);
		panelB.add(scrollpane);
		
		panelA.add(panelA_1);
		panelA.add(panelA_2);
		panel.add(panelA);
		panel.add(panelB);
		add(panel);	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChangeTemperature ct = new ChangeTemperature();
	}

}
