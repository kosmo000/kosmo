package c_sample;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;



/*
 * 화면(JFrame)에 '확인' 버튼 하나 출력
 */
public class EvenTest3 {
	
		JFrame f;
		JButton bhi;
		EvenTest3() {
		f = new JFrame("테스트");
		bhi = new JButton("확인3");
		bhi.setPreferredSize(new java.awt.Dimension (150, 150));
		
		// (1) 이벤트 헨들러 만들기
		//		핸들러 - 이벤트 처리 클래스
		// (2) 핸들러 객체 생성
		// (3) 이벤트 발생할 컴포넌트와 연결
		bhi.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "이벤트발생3");
				
			}
		});
	}
	
	
	
	
	public void addLayout() {
		f.setLayout(new BorderLayout());
		
		f.add(new JLabel("확인"));
		f.add(bhi	, BorderLayout.CENTER);
	
		f.setBounds(100, 100, 500, 350);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		EvenTest3 c = new EvenTest3();
		c.addLayout();

		

	}

}
