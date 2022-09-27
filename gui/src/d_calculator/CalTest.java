package d_calculator;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalTest {
	

	// 1. 멤버변수 선언
	JFrame f;
	JTextField tf;
	JButton[]bNum = new JButton[10];
	JButton[]bOp = new JButton[4];
	JButton bEqual;
	
	int first, second;
	String op;
	
	// 2. 객체 생성
	CalTest() {
		f = new JFrame("유치원 계산기");			//제목 선정
		tf = new JTextField(20);				// 텍스트 필드 글자 평균값 정의
		bNum = new JButton[10];					// bNum 10개 있다 정의
		bOp = new JButton[4];					// bOp 4개 있다 정의
		bEqual = new JButton("=");				// bEqual 값 "="으로 정의
		for(int i = 0; i < bNum.length;i++) {	// bNum의 범위 지정
			String so = Integer.toString(i);
			bNum[i] = new JButton (so);
		}
		bOp[0] = new JButton("+"); //bOp[0]의 값 정의
		bOp[1] = new JButton("-"); //bOp[1]의 값 정의
		bOp[2] = new JButton("*"); //bOp[2]의 값 정의
		bOp[3] = new JButton("/"); //bOp[3]의 값 정의
		
	
	} // end of CalTest
	
	// 3. 화면 구성 및 화면출력
	void addLayout() {
		f.setLayout(new BorderLayout());				//레이아웃 설정
		JPanel jSouth = new JPanel(new GridLayout(5, 3)); //레이아웃 범위 설정 및 지역 설정
		
		for(int i = 1; i < 10; i++) {	//반복문 사용 bNum[i] 설정
			jSouth.add(bNum[i]);		//지역에 넣음
		}
		jSouth.add(bOp[0]);		//bOp[0] 지역에 넣음
		jSouth.add(bNum[0]);	//bNum[0] 지역에 넣음
		jSouth.add(bEqual);		//bEqual 지역에 넣음
		jSouth.add(bOp[1]);		//bOp[1] 지역에 넣음
		jSouth.add(bOp[2]);		//bOp[2] 지역에 넣음
		jSouth.add(bOp[3]);		//bOp[3] 지역에 넣음
		
		
		
		f.add(tf, BorderLayout.NORTH);		//tf 북쪽 지역에 넣음
		f.add(jSouth, BorderLayout.CENTER);	//남쪽 지역에 넣은 내용 가운데에 넣음
		
		
		
		f.setBounds(0, 0, 300, 300);	// 크기 설정 및 생성
		f.setVisible(true);		// 생성?
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//끌 수 있게 하는 출력문
	}	// end of addLayout()
	
	//--------------------------------------------
	// 4. 이벤트 처리
	public void eventProc() {		//이벤트 설정
		// 숫자 버튼이 눌렀을 때
		for (int i=0; i<bNum.length; i++) {		//반복문 범위 및 설정 
			bNum[i].addActionListener(new ActionListener() {	//bNum[i]에 적용될 액션 설정
				public void actionPerformed(ActionEvent e) {	//액션내용 설정
					// 이벤트가 발생한 컴포넌트의 참조를 얻어옴
					JButton eBtn = (JButton)e.getSource();		//
					String su = (tf.getText()+eBtn.getText());	//입력한 수 설정 지금은 두자리 이상도 가능
					tf.setText(su);	//텍스트에 출력
					
				}
			});
		}
		// 연산자 버튼이 눌렀을 때
		for (int i=0; i<bOp.length; i++) {	//연산자 반복문 범위 설정
		bOp[i].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton eBtn = (JButton)e.getSource();
				op = eBtn.getText();
				
				first = Integer.parseInt(tf.getText());
				tf.setText("");
				
			}
		});
		}
		
		/*// 연산자 버튼이 눌렀을 때
		for (int i=0; i<bOp.length; i++) {
			bOp[i].addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 JButton eBtn = (JButton)e.getSource();
					String su = eBtn.getText();
					tf.setText(su);
				}
			});
		}*/
		// = 버튼이 눌렀을 때
		bEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				second = Integer.parseInt(tf.getText());
				int result = 0;
				switch(op) {
				case "+" : result = first += second; break;
				case "-" : result = first -= second; break;
				case "*" : result = first *= second; break;
				case "/" : result = first /= second; break;
				}
				tf.setText(String.valueOf(result));
			}
		});
	}	// end of eventProc()

	public static void main(String[] args) {
		CalTest cal = new CalTest();
		cal.addLayout();
		cal.eventProc();

	}

}
