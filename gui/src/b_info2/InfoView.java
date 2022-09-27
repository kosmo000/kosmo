package b_info2;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class InfoView {

	// 1. 멤버변수선언
	JFrame f;
	JTextField tfName, tfId, tfTel, tfGendet, tfAge, tfHome;
	JTextArea ta;
	JButton		bAdd, bShow, bSearch, bDelete, bCancel, bExit;
	// 2. 멤버변수 객체생성
	InfoView(){
		f = new JFrame("DBTest");
		tfName = new JTextField("Name");
		tfId = new JTextField("Id");
		tfTel = new JTextField("Tel");
		tfGendet = new JTextField("Gendet");
		tfAge = new JTextField("Age");
		tfHome = new JTextField("Home");
		ta = new JTextArea(40, 20);
		bAdd = new JButton("Add");
		bShow = new JButton("show");
		bSearch = new JButton("Search");
		bDelete = new JButton("Delete");
		bCancel = new JButton("Cancel");
		bExit = new JButton("Exit");
		
	}
	
	// 3. 화면구성
	/*
	 * 	전체 프레임 BorderLayout 지정
	 * 		- WEST	: JPanel 붙이기 ( GridLayout(6, 2))
	 * 		- CENTER: 텍스트에어리어
	 * 		- SOUTH	: JPanel 붙이기 ( GridLayout(1, 6))
	 */
	public void addLayout() {
		//f.setLayout(new GridLayout(6, 2));
		f.setLayout(new BorderLayout());
		
		JPanel pWest = new JPanel(new GridLayout(6,2));
		f.add(pWest		, BorderLayout.WEST);
		pWest.add(new JLabel("Name"));
		pWest.add(tfName);
		pWest.add(new JLabel("Id"));
		pWest.add(tfId);
		pWest.add(new JLabel("Tel"));
		pWest.add(tfTel);
		pWest.add(new JLabel("Gendet"));
		pWest.add(tfGendet);
		pWest.add(new JLabel("Age"));
		pWest.add(tfAge);
		pWest.add(new JLabel("Home"));
		pWest.add(tfHome);
		
		
		f.add(ta		, BorderLayout.CENTER);
		
		JPanel pSouth = new JPanel(new GridLayout(1, 6));
		f.add(pSouth   ,BorderLayout.SOUTH);
		pSouth.add(bAdd);
		pSouth.add(bShow);
		pSouth.add(bSearch);
		pSouth.add(bDelete);
		pSouth.add(bCancel);
		pSouth.add(bExit);
		
		
		f.setBounds(100, 100, 500, 350);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}	
	public static void main(String[] args) {
		InfoView b = new InfoView();
		b.addLayout();

	}

}