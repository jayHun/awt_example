package swings;

import java.awt.*;
import java.awt.event.*;

public class FirstSwing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame frm  = new Frame("First Swing");
		frm.setBounds(120, 120, 400, 100);
		frm.setLayout(new FlowLayout());
		
		WindowListener listen = new WindowAdapter() {
			public void windowClosing(WindowEvent ev){
				System.exit(0);
			}
		};
		
		frm.addWindowListener(listen);
		
		Button btn1 = new Button("My Button");
		Button btn2 = new Button("Your Button");
		
		frm.add(btn1);
		frm.add(btn2);
		
		frm.setVisible(true);
	}
}
