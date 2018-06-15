import javax.swing.*;
import java.awt.*;
public class Score extends JFrame{
	public Score(){
		setSize(1200,300);
		setTitle("성적관리프로그램");
		
		JPanel panel = new JPanel();
		JPanel text = new JPanel();
		text.setBounds(10,10,400,300);
		JPanel db = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		Button name = new Button("이름");
		JTextField nametext = new JTextField(5);
		text.add(name);
		text.add(nametext);
		JButton add = new JButton("추가");
		text.add(add);
		Button korean = new Button("국어점수");
		JTextField kotext = new JTextField(5);
		text.add(korean);
		text.add(kotext);
		JButton del = new JButton("제거");
		text.add(del);
		Button english = new Button("영어점수");
		JTextField engtext = new JTextField(5);
		text.add(english);
		text.add(engtext);
		JButton update = new JButton("수정");
		text.add(update);
		Button math = new Button("수학점수");
		JTextField mathtext = new JTextField(5);
		text.add(math);
		text.add(mathtext);
		
		text.setLayout(new GridLayout(0,3,10,10));
		
		panel.add(text);
		panel.add(db);
		add(panel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Score sc = new Score();
	}

}
