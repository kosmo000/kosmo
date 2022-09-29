package testHbg2;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelChk extends JPanel { // JPanel에 PanelChk 상속

	MainTest parent; // ManinTest 객체 생성

	// 1. 멤버변수 선언
	JButton[] bts;		// 반복문 사용을 위해 버튼을 배열로 선언
	String[] menu = new String[] {"후라이드싸이순살", "간장마늘싸이순살", "맘스양념싸이순살", "치파오싸이순살", "군옥수수뿌치싸이순살", "허니버터뿌치싸이순살"};
	// 메뉴에 넣을 내용을 배열을 통해 반복문으로 선언
	int[] price = new int[] {16000, 17000, 17000, 18000, 18000, 18500}; 
	// 가격에 넣을 내용을 배열을 통해 반복문으로 선언


	// 2. 멤버변수 객체 생성(생성자 안에서)
	public PanelChk (MainTest mainTest) {	// PanelChk 객체 생성
		parent = mainTest;	// mainTest는 parent와 같다

		// 버튼의 개수를 지정
		bts = new JButton[6]; // 버튼 6개 지정

		// 버튼 배열 안에 버튼 생성
		for ( int i = 0; i < bts.length; i++) { // 반복문 선언
			bts[i] = new JButton("<html><body><center>" + menu[i] + "<br>" + price[i] + "원</center></body></html>"); // 버튼 생성
			bts[i].setHorizontalTextPosition(JButton.CENTER);				//텍스트 정렬
			bts[i].setVerticalTextPosition(JButton.BOTTOM);					// 텍스트 글자 위치 설정
			bts[i].setIcon(new ImageIcon("testImg/chkImg/"+ i +".png"));	// 이미지 삽입
			bts[i].setBackground(new Color(255, 255, 255));					// 배경 색 설정
		}// for()


		// 메서드 실행
		addLayout();
		eventProc();
	} // PanelHbg() 생성자 함수

	// 3. 화면 구성 및 출력
	void addLayout() {
		// 패널의 화면 구성
		setLayout(new GridLayout(2, 3, 10, 10));	//패널을 2행3열로  생성하고 간격을 설정

		// 버튼 삽입
		for ( int i = 0; i < bts.length; i++) { //반복문 선언
			add(bts[i]); // 반복문을 통해 버튼 삽입
		}// for()
	} // addLayout()
	void eventProc() {

		// 메뉴 버튼이 눌렸을 때
		for ( int i = 0; i < bts.length; i++ ) {	// 반복문 선언
			String convert = Integer.toString(i);	// 숫자를 문자열로 인식
			bts[i].addActionListener(new ActionListener() { // 어느버튼을 눌렀을때 나오는 것
				public void actionPerformed(ActionEvent e) {  // 버튼을 눌렀을 때 행해지는 것
					MenuVO menuvo = new MenuVO(menu[Integer.parseInt(convert)], price[Integer.parseInt(convert)]);
					// MenuVO에 객체 생성 및 거기에 있는 메뉴와 값들을 불러온다
					parent.list.add(menuvo); //  부모 리스트에 객체 menuvo를 삽입
					selectAll(); 	//장바구니에
					parent.sumPrice += price[Integer.parseInt(convert)];
					// 메뉴버튼을 눌렀을 때 그 값들을 더해 텍스트에넣음
					payment(); // 결제
				}// public void actionPerformed(ActionEvent e)
			});

		} // for문
	} // eventProc()
	
	// 장바구니 출력을 위한 데이터 저장
	void selectAll() { 
		parent.shoppingcartMenuTA.setText("---------------선택한 메뉴---------------\n");
		// 장바구니메뉴에 선택한 메뉴를 나오게 저장
		parent.shoppingcartPriceTA.setText("----------가격----------\n");
		// 장바구니가격에 선택한 메뉴에 값을 나오게 저장
		for (MenuVO vo: parent.list) { // 메뉴를 부모리스트에 반목문 생성
			parent.shoppingcartMenuTA.append(vo.getMenu()+"\n");
			// maitest가 장바구니메뉴에 선택한 것을 한줄씩 나오게 저장
			parent.shoppingcartPriceTA.append(Integer.toString(vo.getPrice())+"\n");
			// maitest가 장바구니가격에 선택한 것을 한줄씩 나오게 저장
		}// for()

	} // selectAll()
	
	// sum 텍스트필드에 메뉴 개수와 총 결제 금액을 출력하는 함수
	void payment() {
		parent.sum.setText("주문한 메뉴의 개수: " + parent.list.size() + "\t" + "총 결제 금액: " + parent.sumPrice + "원");
		// 합계에 텍스트필드에서 선택한 메뉴의 개수와 총결제 금액을 출력
	}//void payment()

}//public class PanelChk extends JPanel
