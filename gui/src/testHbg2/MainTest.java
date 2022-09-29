package testHbg2;

import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MainTest {

	// 1. 멤버변수 선언
	JFrame f;						// 창
	JTextField shoppingcart;		// 장바구니 텍스트
	JTextArea shoppingcartMenuTA;	// 장바구니 메뉴
	JTextArea shoppingcartPriceTA;	// 장바구니 가격
	JTextField sum;					// 합계액
	JButton payment;				// 결제 버튼
	JButton delete;					// 메뉴 초기화 버튼

	// 장바구니 목록이 저장되는 동적 배열
	ArrayList<MenuVO> list = new ArrayList<MenuVO>();

	// 패널들 선언
	PanelHbg panelHbg;	// 패널 panelHbg
	PanelChk panelChk;	// 패널 panelChk
	PanelSet panelSet;	// 패널 panelSet
	PanelSide panelSide; // 패널 panelSide
	PanelDrk panelDrk;	// 패널 panelDrk
	
	// 총 결제 금액 변수
	int sumPrice = 0;


	// 2. 멤버변수 객체 생성
	MainTest() {
		f = new JFrame("맘스터치 키오스크");	// 창 제목
		shoppingcart = new JTextField("장바구니");	// 텍스트 필드 장바구니 생성
		shoppingcart.setHorizontalAlignment(0);	// 쇼핑카트의 글 정렬 0
		shoppingcartMenuTA = new JTextArea("---------------선택한 메뉴---------------\n", 0, 20);
		// 장바구니 메뉴 객체 생성에  텍스트 생성 및 범위 설정
		shoppingcartPriceTA = new JTextArea("----------가격----------\n",0,10);
		// 장바구니 가격에 텍스트 생성 및 범위 설정
		sum = new JTextField("주문한 메뉴의 개수: " + "\t" + "총 결제 금액: ");
		// 합계액의 텍스트 생성 및 내용 설정
		payment = new JButton("결제하기");
		// 결제 객체 생성 텍스트 생성
		delete = new JButton("주문 취소");
		// 메뉴 초기화 객체 생성 및 텍스트 생성
		
		// 패널들 객체 생성 및 참조
		panelHbg = new PanelHbg(this);
		panelChk = new PanelChk(this);
		panelSet = new PanelSet(this);
		panelSide = new PanelSide(this);
		panelDrk = new PanelDrk(this);
	} // MainTest()

	// 3. 화면 구성 및 출력
	public void addLayout() { 
		// 전체 화면 구성은 BorderLayout()
		f.setLayout(new BorderLayout());

		// 탭 항목 추가 + 탭 배치
		JTabbedPane tab = new JTabbedPane();
		tab.addTab("버거", panelHbg);
		tab.addTab("치킨", panelChk);
		tab.addTab("맘스세트", panelSet);
		tab.addTab("사이드", panelSide);
		tab.addTab("음료", panelDrk);
		tab.setPreferredSize(new Dimension(500, 600));
		f.add(tab, BorderLayout.NORTH);			// 상단에 탭 배치

		// 장바구니에 텍스트필드/선택 메뉴/가격/결제 버튼 배치
		JPanel pCenter = new JPanel();	// 객체 pCenter 생성
		pCenter.setLayout(new BorderLayout()); // pCenter 구성은 boredeLayout
		pCenter.add(shoppingcart, BorderLayout.NORTH); // 장바구니를 pCenter 상단에 배치
		pCenter.add(shoppingcartMenuTA, BorderLayout.WEST);	// 장바구니메뉴를 서쪽에 배치
		pCenter.add(shoppingcartPriceTA, BorderLayout.CENTER); // 장바구니 가격을 가운데에 배치
		
		
		JPanel pButton = new JPanel(); // 객체 pButton 생성
		pButton.setLayout(new GridLayout(2,1));	// GridLayout 생성 및 몇 배열 조건 생성
		pButton.add(payment);	// 주문하기 배치
		pButton.add(delete);	// 주문 취소 배치
		
		pCenter.add(pButton, BorderLayout.EAST); // pButton을 BorderLayout에 동쪽에 배치
		
		

		f.add(pCenter, BorderLayout.CENTER);	// pCenter를 BorderLayout에 가운데에 배치

		f.add(sum, BorderLayout.SOUTH);	// 합계엑을 BorderLayout을 하단에 배치

		// 창 크기와 기본 세팅
		f.setBounds(100, 100, 550, 900); // 창 크기 세팅
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //창 닫기 설정

	} // addLayout()

	// 4. 이벤트 처리 함수
	public void eventProc() {

		// 결제 버튼을 눌렀을 때
		payment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	//action 벝
				int result = JOptionPane.showConfirmDialog(null, "결제하시겠습니까?", "결제 확인", JOptionPane.YES_NO_OPTION);
				// 결제 창 버튼 내용 생성 및 출입 할 수 있는지 내용생성 
				if (result == JOptionPane.CLOSED_OPTION) {
					// 사용자가 "예", "아니오"의 선택 없이 창을 닫은 경우 - 유지
				} else if(result == JOptionPane.YES_OPTION) {
					// 사용자가 "예"를 선택한 경우 - 리스트 초기화
					list.clear(); // 리스트 초기화
					shoppingcartMenuTA.setText("---------------선택한 메뉴---------------\n");
					// 장바구니 메뉴 초기화시 남는 텍스트 내용
					shoppingcartPriceTA.setText("----------가격----------\n");
					// 장바구니 가격 초기화시 있는 텍스트 내용
					sum.setText("주문한 메뉴의 개수: " + "\t" + "총 결제 금액: ");
					// 합계 초기화시 남아있는 텍스트 내용
					sumPrice = 0;	// 합계 초기화값
				} else {
					// 사용자가 "아니오"를 선택한 경우 - 유지
				}//else
			}//public void actionPerformed(ActionEvent e)
		});
		
		// 취소 버튼을 눌렀을 때
		delete.addActionListener(new ActionListener() {	//취소 버튼이 눌렸을 때
			public void actionPerformed(ActionEvent e) { // 취소 버튼이 눌렸을 때 모습
				JOptionPane.showMessageDialog(null, "전체 목록을 삭제합니다");
				// 메세지창이 뜨며 텍스트 내용 뜨며 물어봄
				list.clear();	// 리스트 초기화
				shoppingcartMenuTA.setText("---------------선택한 메뉴---------------\n");
				// 장바구니 메뉴 초기화시 남아있는 텍스트 내용
				shoppingcartPriceTA.setText("----------가격----------\n");
				// 장바구니 가격 초기화시 남아있는 텍스트 내용
				sum.setText("주문한 메뉴의 개수: " + "\t" + "총 결제 금액: ");
				// 합계 초기화시 남아있는 텍스트 내요
				sumPrice = 0; // 합계초기화값
			}//public void actionPerformed(ActionEvent e)
		});
		

	} // eventProc()



	public static void main(String[] args) {

		MainTest main = new MainTest(); // MainTest main 객체 생성
		main.addLayout(); // 객체에 addLayout 지정
		main.eventProc(); // 객체에 eventProc 지정


	} // main()

} // MainTest {}
