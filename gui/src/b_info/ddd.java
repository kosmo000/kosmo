package b_info;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.Calendar;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import b_info2.InfoView;


public class ddd {

   // 1. 멤버 변수 선언
   JFrame f;
   JTextField tfName,tfId,tfTell,tfGender,tfAge,tfHome;
   JTextArea ta, ta1;
   JButton bAdd, bShow, bSearch, bDelete, bCancel, bExit;


   // 2. 멤버 변수 객체 생성

   ddd(){
      f = new JFrame("오늘 할일");
      bAdd = new JButton("Add");
      bShow = new JButton("Show");
      bSearch = new JButton("Search");
      bDelete = new JButton("Delete");
      bCancel = new JButton("Cancel");
      bExit = new JButton("Exit(alt + x)",new ImageIcon("src\\b_info2\\imgs\\1.PNG"));
      ta = new JTextArea(10,10);
      ta1 = new JTextArea(100,50);
      tfName = new JTextField("");
      tfId = new JTextField("");
      tfTell = new JTextField("");
      tfGender = new JTextField("");
      tfAge = new JTextField("");
      tfHome = new JTextField("");
      bExit.setHorizontalTextPosition(JButton.CENTER);
      bExit.setVerticalTextPosition(JButton.BOTTOM);
      bExit.setRolloverIcon(new ImageIcon("src\\b_info2\\imgs\\2.PNG") );
      bExit.setPressedIcon(new ImageIcon("src\\b_info2\\imgs\\3.PNG"));
      bExit.setToolTipText("프로그램을 종료할거 ㅋ");
      bExit.setMnemonic('x');
   }

   // 3. 화면 구성하고 출력

   //  전체 프레임 BorderLayout 지정 - WEST , CENTER(ta) , SOUTH
   //  버튼 만들려면 JPanel 붙이기  ( south)(GridLayout(1,6))
   //   west도 패널 (GridLayout(6,2))

   public void addLayout() {
      f.setLayout(new BorderLayout());
      JPanel pWest1 = new JPanel();

      f.add(ta        ,BorderLayout.CENTER);
      JPanel pWest = new JPanel();
      f.add(pWest    ,BorderLayout.WEST);
      pWest.setLayout(new GridLayout(6,2));
      pWest.setPreferredSize(new java.awt.Dimension(350, 300));
      pWest.add(new JLabel("Name",JLabel.CENTER));
      pWest.add(tfName);
      pWest.add(new JLabel("ID",JLabel.CENTER));
      pWest.add(tfId);
      pWest.add(new JLabel("Tel",JLabel.CENTER));
      pWest.add(tfTell);
      pWest.add(new JLabel("Gender",JLabel.CENTER));
      pWest.add(tfGender);
      pWest.add(new JLabel("Age",JLabel.CENTER));
      pWest.add(tfAge);
      pWest.add(new JLabel("Home",JLabel.CENTER));
      pWest.add(tfHome);
      JPanel pSouth = new JPanel();
      f.add(pSouth    ,BorderLayout.SOUTH);
      pSouth.setLayout(new GridLayout(1,6));
      pSouth.setPreferredSize(new java.awt.Dimension(50, 80));

      pSouth.add(bAdd);
      pSouth.add(bShow);
      pSouth.add(bSearch);
      pSouth.add(bDelete);
      pSouth.add(bCancel);
      pSouth.add(bExit);



      f.setBounds(100,100,1000,550);
      f.setVisible(true);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

   }

      public void eventProc() {
      bAdd.addActionListener(new ActionListener()  {
         public void actionPerformed(ActionEvent f) {
            JOptionPane.showMessageDialog(null, "추가");
         }
      });
      
      tfId.addActionListener(new ActionListener()  {
         public void actionPerformed(ActionEvent f) {
            getJuminInfo();
         }
      });
      
      tfId.addFocusListener(new FocusListener(){
         public void focusGained(FocusEvent e) {
            
         }
         public void focusLost(FocusEvent e) {
            getJuminInfo();
         }
         
      }); // end of addFocusListener
      
      bShow.addActionListener(new ActionListener()  {
         public void actionPerformed(ActionEvent f) {
            JOptionPane.showMessageDialog(null, "메렁");
         }
      });
      bSearch.addActionListener(new ActionListener()  {
         public void actionPerformed(ActionEvent f) {
            JOptionPane.showMessageDialog(null, "메룽");
         }
      });
      bDelete.addActionListener(new ActionListener()  {
         public void actionPerformed(ActionEvent f) {
            JOptionPane.showMessageDialog(null, "메러러러");
         }
      });
      bCancel.addActionListener(new ActionListener()  {
         public void actionPerformed(ActionEvent f) {
            JOptionPane.showMessageDialog(null, "메루루루");
         }
      });
      bExit.addActionListener(new ActionListener()  {
         public void actionPerformed(ActionEvent f) {
            JOptionPane.showMessageDialog(null, "메릿");
         }
      });
      
      
      }

      
   
   
   public void getJuminInfo() {
      
      String jumin = tfId.getText();
      if(jumin.length() < 14) {
         JOptionPane.showMessageDialog(null, " - 포함한 15자를 맞춰");
         
      }else {
         JOptionPane.showMessageDialog(null, "추가완료");
      }

      if(jumin.charAt(7) == '1'  | jumin.charAt(7) == '3' | 
            jumin.charAt(7) == '9') {
         tfGender.setText("남자");
      }else if (jumin.charAt(7) == '2' || jumin.charAt(7) =='4' || 
            jumin.charAt(7) =='0') {
         tfGender.setText("여자");
      }
      
      char chool = jumin.charAt(8);
      switch(chool) {
      case '0' :
         tfHome.setText("서울");
      break;
      case '1':
         tfHome.setText("안양");
      break;
      case '2' :
         tfHome.setText("광주");
      break;
      case '3' :
         tfHome.setText("부산");
      break;
      
      }
      String nai = jumin.substring(0,2); // 주민 번호 0부터 2미만 까지 잡아줌
      int sunai = Integer.parseInt(nai); // string을 인트로 
      Calendar c = Calendar.getInstance();
      int year = c.get(Calendar.YEAR);
      int suna = year - (2000 + sunai) + 1;
      String ko = Integer.toString(suna);
      int sona = year - (1900 + sunai) + 1;
      String ko1 = Integer.toString(sona);
      
      
      if(jumin.charAt(8) == '3' || jumin.charAt(8) == '4') {
         tfAge.setText(ko);

      }
      else if(jumin.charAt(8) == '1' || jumin.charAt(8) == '2') {
         tfAge.setText(ko1);

      }
      
   }
   



   public static void main(String[] args) {

      ddd info = new ddd();
      info.addLayout();
      info.eventProc();


   }

}
