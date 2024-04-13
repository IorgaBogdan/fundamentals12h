import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements MouseListener{

	JLabel label;
	MyFrame(){
		label=new JLabel();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(null);

		label.setBounds(0, 0, 200, 200);
		label.setBackground(Color.MAGENTA);
		label.setOpaque(true);
		label.addMouseListener(this);
		
		
		this.add(label);
		this.setVisible(true);
	
	
	
	}
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// Invoked when the mouse button has been clicked (pressed and released) on a component
		System.out.println("Ati apasat pe mouse. ( click si relase)");
//		label.setBackground(Color.black);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// Invoked when a mouse button has been pressed on a component	
		System.out.println("Ati apasat pe butonul mouse ului. ( doar click)");
		label.setBackground(Color.yellow);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// Invoked when a mouse button has been released on a component	
		System.out.println("Ati luat degetul de pe butonul mouse ului. ");
		label.setBackground(Color.green);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// Invoked when the mouse enters a component	
		System.out.println("Ati intrat in zona colorata. ");
		label.setBackground(Color.BLUE);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// Invoked when the mouse exits a component
		System.out.println("Ati iesit din zona colorata. ");
	
		label.setBackground(Color.MAGENTA);
		}

}