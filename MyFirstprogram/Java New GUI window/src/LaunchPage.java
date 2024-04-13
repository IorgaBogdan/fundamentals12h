import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LaunchPage implements ActionListener {
	JFrame frame=new JFrame();
	JButton myButton=new JButton("Pagina noua");
	
	LaunchPage(){
		
		myButton.setBounds(200, 200,150, 80);
		myButton.addActionListener(this);
		
		frame.add(myButton);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()== myButton) {
			NewWindow newwindow=new NewWindow();
			frame.dispose();
		}
	}
}
