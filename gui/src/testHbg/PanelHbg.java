package testHbg;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import e_tabbedpane2.MainTest;

public class PanelHbg  extends JPanel{
	
	
	
	bhbg = new JButton("내슈빌핫치킨");
	bhbg = new JButton("내슈빌핫치킨", new ImageIcon("src\\testHbg\\imgs\\내슈빌핫치킨.png"));
	bhg1= new JButton("불싸이버거");
	bhbg = new JButton("불싸이버거", new ImageIcon("src\\testHbg\\imgs\\불싸이버거.png"));
	bhg2 = new JButton("살사리코버거");
	bhbg = new JButton("살사리코버거", new ImageIcon("src\\testHbg\\imgs\\살사리코버거.png"));
	bhg3 = new JButton("싸이버거");
	bhbg = new JButton("싸이버거", new ImageIcon("src\\testHbg\\imgs\\싸이버거.png"));
	bhg4 = new JButton("큐텍사스바베큐치킨버거");
	bhbg = new JButton("큐텍사스바베큐치킨버거", new ImageIcon("src\\testHbg\\imgs\\큐텍사스바베큐치킨버거.png"));
	bhg5 = new JButton("할라피뇨통살버거");
	bhbg = new JButton("할라피뇨통살버거", new ImageIcon("src\\testHbg\\imgs\\할라피뇨통살버거"));
	
	
	MainTest = parent;
	public PanelHbg(MainTest maintest) {
		
		
		
		parent = maintest;
		setBackground(new Color(0,0,255)); // RGB (Red, Green, Blue)
		addLayout();
		eventProc();
	}
	
	void addLayout() {
		setLayout(new BorderLayout());
		
		
		JPanel pCenter = new JPanel();
		pCenter.setLayout(new GridLayout(2,3));
		pCenter.setPreferredSize(new java.awt.Dimension(350, 300));
		pCenter.add(bhbg);
		pCenter.add(bhg1);
		pCenter.add(bhg2);
		pCenter.add(bhg3);
		pCenter.add(bhg4);
		pCenter.add(bhg5);
		
		
	}
	

	

	void eventProc() {
		
		/*aBtn.addActionListener(new ActionListener()  {
	         public void actionPerformed(ActionEvent e) {
	        	 
	         
	         }
	      });*/
	}
}

