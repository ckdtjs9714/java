import javax.swing.*;
import java.awt.*;

public class ChangeTemperature extends JFrame{
	public ChangeTemperature(){
		setSize(1200,500);
	
		setTitle("성적관리프로그램");
		
		JPanel panel = new JPanel();
		JPanel panelA = new JPanel();
		JPanel panelA_1 = new JPanel();
		JPanel panelA_2 = new JPanel();
		JPanel panelB = new JPanel();
		
		Button name = new Button("이름");
		JTextField field1 = new JTextField(5);
		panelA_1.add(name);
		panelA_1.add(field1);
		
		Button korean = new Button("국어점수");
		JTextField field2 = new JTextField(5);
		panelA_1.add(korean);
		panelA_1.add(field2);
		
		Button english = new Button("영어점수");
		JTextField field3 = new JTextField(5);
		panelA_1.add(english);
		panelA_1.add(field3);
		
		Button math = new Button("수학점수");
		JTextField field4 = new JTextField(5);
		panelA_1.add(math);
		panelA_1.add(field4);
		
		JButton add = new JButton("추가");
		panelA_2.add(add);
		
		JButton del = new JButton("삭제");
		panelA_2.add(del);
		
		JButton update = new JButton("수정");
		panelA_2.add(update);
//		panelA_1.setLayout(new GridLayout(4,2));
//		panelA_2.setLayout(new GridLayout(3,1));
		

		
		String header[] = {"이름","국어점수","영어점수","수학점수"};
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
