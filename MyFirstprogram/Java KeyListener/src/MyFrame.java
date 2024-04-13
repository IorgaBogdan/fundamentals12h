import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame  implements KeyListener{

	JLabel label;
	ImageIcon icon;
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
		this.setSize(500,500);
//		this.pack();
		this.setLayout(null);
		this.addKeyListener(this);
		
		label=new JLabel();
		label.setBounds(0,0,160,160);
//		label.setBackground(Color.red);
//		label.setOpaque(true); // Setează acest JLabel să fie opac, ceea ce înseamnă că va acoperi complet orice fundal
								// și nu va permite transparența. Alte componente din spatele său nu vor fi vizibile.
		
		
		icon=new ImageIcon("rocket.png");
		label.setIcon(icon);

		
		this.getContentPane().setBackground(Color.black);
		this.add(label);
		this.setVisible(true);
		}
	

	@Override
	public void keyTyped(KeyEvent e) {
	    // Metoda este apelată când o tastă este apăsată și eliberată.
        // Poate fi folosită pentru a gestiona evenimentele generate de tastarea de caractere.
	
			switch(e.getKeyChar()){
				case 'a':label.setLocation(label.getX()-10,label.getY());
				break;
				case 's':label.setLocation(label.getX(),label.getY()+10);
				break;
				case 'd':label.setLocation(label.getX()+10,label.getY());
				break;
				case 'w':label.setLocation(label.getX(),label.getY()-10);
				break;
			
		}
	
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// Metoda este apelată când o tastă este apăsată.
        // Este utilizată în mod obișnuit pentru a reacționa la evenimentul de apăsare a unei taste.
		switch(e.getKeyCode()){
		case 37:label.setLocation(label.getX()-10,label.getY());
		break;
		case 40:label.setLocation(label.getX(),label.getY()+10);
		break;
		case 39:label.setLocation(label.getX()+10,label.getY());
		break;
		case 38:label.setLocation(label.getX(),label.getY()-10);
		break;
	
}
}
	@Override
	public void keyReleased(KeyEvent e) {
	       // Metoda este apelată când o tastă este eliberată.
        // Este folosită în mod obișnuit pentru a reacționa la evenimentul de eliberare a unei taste.
		System.out.println("You release key char: "+ e.getKeyChar());
		System.out.println("You release key code: "+ e.getKeyCode());
	}	
}
