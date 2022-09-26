package a_sample;

import java.awt.BorderLayout;
import java.awt.GridLayout;

/*
 * 	자바의 GUI (화면)
 * 	- AWT : 1.2 이전
 * 	- Swing : 1.2 이후
 * 				대부분 클래스 앞에 J
 */
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class ATest {

	JFrame f;
	JButton btn,btn2;
	JCheckBox cbJava,cbOracle;
	JRadioButton  rbMale,rbFemale;
	JTextField tf;	//한줄로 입력
	JTextArea ta;	//여러줄로 입력
	
	ATest(){
		f = new JFrame("나의 첫창");
		btn = new JButton("클릭");
		btn2 = new JButton("취소");
		cbJava = new JCheckBox("자바");
		cbOracle = new JCheckBox("오라클"); 
		rbMale = new JRadioButton("남자");
		rbFemale = new JRadioButton("여자");
		ButtonGroup group = new ButtonGroup();
		group.add(rbMale);
		group.add(rbFemale);
		tf  = new JTextField(20);	//평균적으로 20자 쓸 수 있을 정도
		ta = new JTextArea(40, 20);	//평균적으로 40자 쓸 수 있고 20줄 쓸 수 있을 정도
	}
	
	void addLayout() {
		//f.setLayout(new FlowLayout());	// 한줄에 배치
		//f.setLayout(new GridLayout(3, 3));// 행, 열에 맞춰 배치
		f.setLayout(new BorderLayout()); 	// 동/서/남/북/가운데 배치
		
		// 붙이기 작업
		f.add(btn		, BorderLayout.NORTH);
		f.add(btn2		, BorderLayout.SOUTH);
		//f.add(cbJava);
		//f.add(cbOracle);
			JPanel pEast = new JPanel();
			pEast.add(rbMale);
			pEast.add(rbFemale);
		
		f.add(pEast	, BorderLayout.EAST);
		
		f.add(new JLabel("입력하세요"), BorderLayout.WEST);	//JLabel
		//f.add(tf	, BorderLayout.EAST);
		f.add(ta		, BorderLayout.CENTER);
		
		// 화면 출력
		f.setBounds(100, 100, 500, 350);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		ATest a = new ATest();
		a.addLayout();

	}

}
