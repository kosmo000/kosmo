package c_info2;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import c_info2.InfoView;

public class InfoView {

		   // 1. 멤버 변수 선언
		   JFrame f;
		   JTextField tfName,tfId,tfTel,tfGender,tfAge,tfHome;
		   JTextArea ta, ta1;
		   JButton bAdd, bShow, bSearch, bDelete, bCancel, b수정하기;
		

		   // 비지니스로직 = 모델단
		   InfoModelImp1  model;
		   // 2. 멤버 변수 객체 생성

		   InfoView(){
		      f = new JFrame("오늘 할일");
		      bAdd = new JButton("Add");
		      bShow = new JButton("Show");
		      bSearch = new JButton("Search");
		      bDelete = new JButton("Delete");
		      bCancel = new JButton("Cancel");
		      b수정하기 = new JButton("수정하기",new ImageIcon("src\\b_info2\\imgs\\1.PNG"));
		      ta = new JTextArea(10,10);
		      ta1 = new JTextArea(100,50);
		      tfName = new JTextField("");
		      tfId = new JTextField("");
		      tfTel = new JTextField("");
		      tfGender = new JTextField("");
		      tfAge = new JTextField("");
		      tfHome = new JTextField("");
		      b수정하기.setHorizontalTextPosition(JButton.CENTER);
		      b수정하기.setVerticalTextPosition(JButton.BOTTOM);
		      b수정하기.setRolloverIcon(new ImageIcon("src\\b_info2\\imgs\\2.PNG") );
		      b수정하기.setPressedIcon(new ImageIcon("src\\b_info2\\imgs\\3.PNG"));
		      b수정하기.setToolTipText("프로그램을 종료");
		      b수정하기.setMnemonic('x');
		      
		      //모델객체 생성
		      try {
		    	  model = new InfoModelImp1();
		      } catch (ClassNotFoundException e) {
		    	  e.printStackTrace();
		      }
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
			      pWest.add(tfTel);
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
			      pSouth.add(b수정하기);



			      f.setBounds(100,100,1000,550);
			      f.setVisible(true);
			      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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
		  
		  public void clearTextField() {
			  ta.setText(null);
			  tfGender.setText(null);
			  tfHome.setText(null);
			  tfAge.setText(null);
			  tfTel.setText(null);
			  tfId.setText(null);
			  tfName.setText(null);
		  }

		  void eventProc() {
			   // Add 버튼이 눌렀을 때
			   bAdd.addActionListener(new ActionListener() {
				   public void actionPerformed(ActionEvent e) {
					insertData();
				}
			});
			   // bShow 버튼이 눌렀을 때
			   bShow.addActionListener(new ActionListener() {
				   public void actionPerformed(ActionEvent e) {
					selectAll();
				}
			});
			   // bSearch 버튼이 눌렀을때
			   bSearch.addActionListener(new ActionListener() {
				   public void actionPerformed(ActionEvent e) {
					selectByTel();
				}
			});
			   tfTel.addActionListener(new ActionListener() {
				   public void actionPerformed(ActionEvent e) {
					selectByTel();
				}
			});
			   bDelete.addActionListener(new ActionListener() {
				   public void actionPerformed(ActionEvent e) {
					   deleteBytel();
				}
			});
			   b수정하기.addActionListener(new ActionListener() {
				   public void actionPerformed(ActionEvent e) {
					   updateData();
				}
			});
		   } // end of eventProc()
		  
		  void selectByTel() {
			  try {
			  // (1) 입력한 전화번호 값을 얻어오기
			  String tel = tfTel.getText();
			  // (2) 모델단에 selectByTel() 호출
			  InfoVO vo = model.selectByTel(tel);
			  // (3) 받은 결과를 각각의 텍스트필드에 지정(출력)
			  tfName.setText( vo.getName());
			  tfId.setText( vo.getId());
			  tfTel.setText( vo.getTel());
			  tfGender.setText( vo.getGender());
			  tfAge.setText(Integer.toString( vo.getAge()));
			  tfHome.setText( vo.getHome());
			  }catch(Exception ex) {
				  ta.setText("전화번호 검색 실패 : " + ex.getMessage());
			  }
		  }
		  
		  void deleteBytel() {
			  // (1) 입력한 전화번호 값을 얻어오기
			  String tel = tfTel.getText();
			  // (2) 모델탄에 delete() 호출
			  try {
				  model.deleteByTel(tel);
				  // (3) 화면을 지우고
				  clearText();
			  } catch (SQLException e) {
				  ta.setText("삭제실패 : "+ e.getMessage());
			  }
			  
		  }
		  
		  void selectAll() {
			  try {
				ArrayList<InfoVO> data = model.selectAll();
				ta.setText(" ---- 검색결과 ------ \n\n");
				for(InfoVO vo : data) {
					ta.append(vo.toString());
				}
			} catch (SQLException e) {
				ta.setText("검색실패: " + e.getMessage());
			}
		  }
		  
		  void insertData() {
			  // (1) 사용자입력값 얻어오기
			  String name    = tfName.getText();
			  String Id	     = tfId.getText();
			  String Tel     = tfTel.getText();
			  String Gender  = tfGender.getText();
			  int    Age     = Integer.parseInt(tfAge.getText());
			  String Home    = tfHome.getText();
			  // (2) 1번의 값들을 InfoVO에 지정
			  InfoVO vo = new InfoVO();
			  	//	InfoVO vo = new InfoVO(name, id, tel, gender, age, home);
			  vo.setName(name);
			  vo.setId(Id);
			  vo.setTel(Tel);
			  vo.setGender(Gender);
			  vo.setAge(Age);
			  vo.setHome(Home);
			  
			  // (3) 모델의 insertInfo() 호출
			  try {
				  model.insertInfo(vo);
			  } catch (SQLException e) {
				  e.printStackTrace();
			  }
			  
			  // (4) 화면의 입력값들을 지우기
			  clearText();
		  }
		  
		  void updateData() {
			// (1) 사용자입력값 얻어오기
			  String name    = tfName.getText();
			  String Id	     = tfId.getText();
			  String Tel     = tfTel.getText();
			  String Gender  = tfGender.getText();
			  int    Age     = Integer.parseInt(tfAge.getText());
			  String Home    = tfHome.getText();
			  // (2) 1번의 값들을 InfoVO에 지정
			  InfoVO vo = new InfoVO();
			  	//	InfoVO vo = new InfoVO(name, id, tel, gender, age, home);
			  vo.setName(name);
			  vo.setId(Id);
			  vo.setTel(Tel);
			  vo.setGender(Gender);
			  vo.setAge(Age);
			  vo.setHome(Home);
			  
			  // (3) 모델의 updateInfo() 호출
			  try {
				  model.update(vo);
			  } catch (SQLException e) {
				  e.printStackTrace();
			  }
		  }
		  
		  void clearText() {
			  ta.setText(null);
			  tfName.setText(null);
			  tfGender.setText(null);
			  tfHome.setText(null);
			  tfAge.setText(null);
			  tfTel.setText(null);
			  tfId.setText(null);
			 
		  }
		  
		   public static void main(String[] args) {

		      InfoView info = new InfoView();
		      info.addLayout();
		      info.eventProc();


		   }

		}
