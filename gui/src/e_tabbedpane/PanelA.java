package e_tabbedpane;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PanelA extends JPanel{
	
	JLabel aLa = new JLabel("판데기 A");
	JButton aBtn = new JButton("A 버튼");

	public PanelA() {
		setBackground(new Color(255,0,0)); // RGB (Red, Green, Blue)
		addLayout();
		eventProc();
	}
	void addLayout() {
		add(aLa);
		add(aBtn);
	}

	
	public void eventProc() {
		aBtn.addActionListener(new ActionListener()  {
	         public void actionPerformed(ActionEvent e) {
	        	 add(aLa);
	         
	         }
	      });
	}
}
