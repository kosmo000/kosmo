package b_info3;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
		tfName = new JTextField("");
		tfId = new JTextField("");
		tfTel = new JTextField("");
		tfGendet = new JTextField("");
		tfAge = new JTextField("");
		tfHome = new JTextField("");
		
		//남쪽 버튼창
		bAdd = new JButton("Add");			// 추가버튼
		bShow = new JButton("show");		// 전체보기버튼
		bSearch = new JButton("Search");	// 검색버튼
		bDelete = new JButton("Delete");	// 삭제버튼
		bCancel = new JButton("Cancel");	// 취소버튼
		bExit = new JButton("Exit (alt+x)", new ImageIcon ("src\\b_info\\imgs\\1.JPG")); //exit 버튼에 이미지를 넣음
		//bExit.setIcon(new ImageIcon(Imageid,read(getClass(). get)));
		bExit.setHorizontalTextPosition(JButton.CENTER); //
		bExit.setVerticalTextPosition(JButton.BOTTOM);	//	
		bExit.setRolloverIcon(new ImageIcon("src\\b_info\\2.JPG"));
		bExit.setPressedIcon(new ImageIcon("src\\b_info\\3.JPG"));
		bExit.setToolTipText("프로그램을 종료합니다.");
		bExit.setMnemonic('x');
		
		// center 입력창
		ta = new JTextArea(40, 20);
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
		pWest.add(new JLabel("Gender"));
		pWest.add(tfGendet);
		pWest.add(new JLabel("Age"));
		pWest.add(tfAge);
		pWest.add(new JLabel("Home"));
		pWest.add(tfHome);
		pWest.setPreferredSize(new java.awt.Dimension (150, 150));
		
		f.add(ta		, BorderLayout.CENTER);
		//남쪽 버튼
		JPanel pSouth = new JPanel(new GridLayout(1, 6));
		f.add(pSouth   ,BorderLayout.SOUTH);
		pSouth.add(bAdd);
		pSouth.add(bShow);
		pSouth.add(bSearch);
		pSouth.add(bDelete);
		pSouth.add(bCancel);
		pSouth.add(bExit);
		pSouth.setPreferredSize(new java.awt.Dimension (50, 80));
		
		
		f.setBounds(100, 100, 500, 350);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// add 버튼 클릭 했을 때
		bAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Add 버튼 클릭");
				
			}
		});
		bShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Show 버튼 클릭");
				
			}
		});
		bSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Search 버튼 클릭");
				
			}
		});
		bDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Delete 버튼 클릭");
				
			}
		});
		bCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Cancel 버튼 클릭");
				
			}
		});
		//주민번호 입력창에서 엔터 쳤을 때
		tfId.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getJuminInfo();
			}	// end of acctionPerformed
		});	// end of addActionListener
		
		// 주민번호 입력창에서 포커스 이벤트 발생했을 때
		tfId.addFocusListener(new FocusListener() {
			public void focusGanined(FocusEvent e) {
			}
			public void focusLost(FocusEvent e) {
				getJuminInfo();	
			}
		
			
			
				
			
		}); // end of addFocusListener
		
		void getJuminInfo() {
			String Jumin = tfId.getText();
			if( Jumin.length() < 14) {
				JOptionPane.showMessageDialog(null, "- 포함한 15자를 맞처주세요" );
				return;
			}
			
			// (1) 주민번호의 7번째 문자로 성별을 구하여 성별창에 출력
			/*
					String Gender = tfGendet.getText();
			
			char sung = Jumin.charAt(7);
			
			if (sung == '1' || sung == '3' || sung == '9') {
				
				tfGender("남자" );
			}else if (sung == '2' || sung == '4' || sung == '0'){
				tfGender("여자" );
				}
			return;*/
			// (2) 주민번호의 출신지를 구하여 출신지창에 출력
			/*String Home = tfHome.getText();
			char chul = Jumin.charAt(8);
			System.out.println(chul);
			String home1 = null;
			switch (chul) {
			case '0': home1 = "서울";break;
			case '1': home1 = "인천/부산";break;
			case '2': home1 = "경기";break;
			case '9': home1 = "제주";
			}
			*/
			// (3) 주민번호에서 년도에 의해 나이를 구해서 나이창에 출력
		}
	}	
	
	
	public static void main(String[] args) {
		InfoView b = new InfoView();
		b.addLayout();

	}

}