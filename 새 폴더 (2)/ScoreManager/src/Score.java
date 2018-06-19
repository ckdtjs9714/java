import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Score extends JFrame{
	
	public Score(){
		ScoreDAO dao = new ScoreDAO();
		ScoreDTO dto = new ScoreDTO();
		setSize(1200,500);
		setTitle("MyFrame");
		
		JPanel panelA = new JPanel();
		JPanel panel = new JPanel();
		
		
		Button name = new Button("이름");
		JTextField nametext = new JTextField(5);
		panel.add(name);
		panel.add(nametext);
		
		JButton add = new JButton("추가");
		panel.add(add);
		
		
		
		Button korean = new Button("국어점수");
		JTextField kortext = new JTextField(5);
		panel.add(korean);
		panel.add(kortext);
		
		JButton del = new JButton("제거");
		panel.add(del);
		
		Button english = new Button("영어점수");
		JTextField engtext = new JTextField(5);
		panel.add(english);
		panel.add(engtext);
		
		JButton update = new JButton("수정");
		panel.add(update);
		
		Button math = new Button("수학점수");
		JTextField mathtext = new JTextField(5);
		panel.add(math);
		panel.add(mathtext);
		
		
		
		String []title = {"이름","국어점수","영어점수","수학점수","총합","평균"};
		
		DefaultTableModel model = new DefaultTableModel(null,title);
		JTable table = new JTable(model);
		JScrollPane scroll = new JScrollPane(table);
		panelA.add(scroll);
		
			
			
			
	add.addActionListener(new ActionListener(){

			@Override
		public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
//			String inputStr[] = new String[6];
//			
//			inputStr[0] = nametext.getText();
//			inputStr[1] = kortext.getText();
//			inputStr[2] = engtext.getText();
//			inputStr[3] = mathtext.getText();
//			model.addRow(inputStr);
//			nametext.setText("");
//			kortext.setText("");
//				engtext.setText("");
//			mathtext.setText("");
			int kor,eng,mat,tot,ave;	
			
			kor = Integer.parseInt(kortext.getText());
			eng = Integer.parseInt(engtext.getText());
			mat = Integer.parseInt(mathtext.getText());
			tot = kor+eng+mat;
			ave = tot/3;
			dto.setName(nametext.getText());
			dto.setKor(kor);
			dto.setEng(eng);
			dto.setMat(mat);
			dto.setTot(tot);
			dto.setAve(ave);
				
			}
	});
//		
//		del.addActionListener(new ActionListener(){
//			@Override
//			public void actionPerformed(ActionEvent e){
//				if(table.getSelectedRow() == -1)
//				{
//					return;
//				}else{
//					model.removeRow(table.getSelectedRow());
//				}
//			}
//		});
		

		
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
