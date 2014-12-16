package Framework.View;

import javax.swing.JFrame;

public class Frame extends JFrame {
	static final long serialVersionUID = 1;
	
	public Frame(String title, View view) {
		this.setTitle(title);
	    this.setLocationRelativeTo(null);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setContentPane(view);
	    this.pack();
	    this.setVisible(true);
	}
}