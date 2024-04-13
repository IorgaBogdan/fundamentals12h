import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener{
	JButton button;
	JTextField textField;
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(800, 800);	// setam dimensiunea
		this.setLayout(new FlowLayout());	
		
		button=new JButton("Confirm identity!");
		button.addActionListener(this);
		
		
		textField=new JTextField();
		textField.setPreferredSize(new Dimension(250,50));
		textField.setFont(new Font("Consolas",Font.BOLD,30));
		textField.setForeground(Color.green);
		textField.setBackground(Color.black);
		textField.setCaretColor(Color.green);// bara care pulseaza
//		textField.setText("Numele tau");		// pune prestabilit un text in casuta ce poate fi sters

		
		this.add(button);
		this.add(textField);
		this.pack();
		this.setVisible(true);		//se face fereastra vizibilă
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button) {
			System.out.println("Bine ai venit "+textField.getText());
			button.setEnabled(false);// il setam ca dupa apasare sa devina inactiv . Lucrul acesta se face prin apelarea metodei in momentul preluare de catre button a unei actiuni ( se apeleaza metoda)
			textField.setEditable(false); 			// permite editarea sau nu a casutei de scris 
		}
	}
}
