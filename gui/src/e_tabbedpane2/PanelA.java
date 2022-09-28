package e_tabbedpane2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelA extends JPanel{
	
	JLabel aLa = new JLabel("판데기 A");
	JButton aBtn = new JButton("A 버튼");
	
	MainTest  parent;
	public PanelA(MainTest maintest) {
		
		
		parent = maintest;
		setBackground(new Color(255,0,0)); // RGB (Red, Green, Blue)
		addLayout();
		eventProc();
	}
	void addLayout() {
		add(aLa);
		add(aBtn);
	}
	void eventProc() {
		
		aBtn.addActionListener(new ActionListener()  {
	         public void actionPerformed(ActionEvent e) {
	        	 parent.la.setText("안녕하세요");
	         
	         }
	      });
	}
}
