import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener{

	JCheckBox check;
	JButton button;
	ImageIcon checkicon;
	ImageIcon uncheckicon;
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.setSize(500,500);
		this.setLayout(new FlowLayout());
		
		
		checkicon=new ImageIcon("check.png");
		uncheckicon=new ImageIcon("uncheck.png");
		
		check=new JCheckBox();
		check.setText("Nu sunt robot");
		check.setFont(new Font("Consolas",Font.ITALIC,50));
		check.setFocusable(false);
		check.setIcon(uncheckicon);
		check.setSelectedIcon(checkicon);
		
		
		button=new JButton();
		button.setText("Submit");
		button.addActionListener(this);
		
		
		
		this.add(button);
		this.add(check);
		this.pack();
		this.setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
			if(e.getSource()==button) {
				System.out.println(check.isSelected());
		}
	}

}
