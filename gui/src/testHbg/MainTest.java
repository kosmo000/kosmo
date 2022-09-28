package testHbg;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MainTest {

	// 1. 멤버변수 선언
	JFrame f;					// 창
	JTextArea shoppingcart;		// 장바구니
	JTextField sum;				// 합계액
	JButton payment;			// 결제 버튼
	
	// 패널들
	PanelHbg panelHbg;
	
	
	
	// 2. 멤버변수 객체 생성
	MainTest() {
		f = new JFrame("맘스터치 키오스크");
		shoppingcart = new JTextArea(70, 35);
		sum = new JTextField("주문한 메뉴의 개수: \t" + "총 결제 금액: ");
		payment = new JButton("결제하기");
		
		
		
	} // MainTest()
	
	// 3. 화면 구성 및 출력
	public void addLayout() {
		// 전체 화면 구성은 BorderLayout()
		f.setLayout(new BorderLayout());
		
		// 탭 부분
		JTabbedPane tab = new JTabbedPane();
		tab.addTab("버거", panelHbg);
		
		tab.setPreferredSize(new Dimension(500, 600));
		f.add(tab, BorderLayout.NORTH);			// 상단에 탭 배치
		
		JPanel pCenter = new JPanel();
		pCenter.setLayout(new BorderLayout());
		pCenter.add(shoppingcart, BorderLayout.WEST);
		pCenter.add(payment, BorderLayout.EAST);
		
		f.add(pCenter, BorderLayout.CENTER);
		
		f.add(sum, BorderLayout.SOUTH);
		
		// 창 크기와 기본 세팅
		f.setBounds(100, 100, 500, 900);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	} // addLayout()
	
	// 4. 이벤트 처리 함수
	public void eventProc() {
		
	} // eventProc()

	
	public static void main(String[] args) {
		
		MainTest main = new MainTest();
		main.addLayout();
		main.eventProc();
		

	} // main()

} // MainTest {}
