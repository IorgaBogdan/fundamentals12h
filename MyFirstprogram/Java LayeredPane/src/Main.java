import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class Main {

	public static void main(String[] args) {
		
		JLabel label1=new JLabel();
		label1.setOpaque(true);
		label1.setBackground(Color.BLUE);
		label1.setBounds(50, 50, 200, 200);
		
		JLabel label2=new JLabel();
		label2.setOpaque(true);
		label2.setBackground(Color.red);
		label2.setBounds(300, 300, 200, 200);
		
		JLabel label3=new JLabel();
		label3.setOpaque(true);
		label3.setBackground(Color.yellow);
		label3.setBounds(200, 200, 200, 200);
		
		JLayeredPane layeredPane= new JLayeredPane();
		layeredPane.setBounds(0,0,600,600);
							// am creat managerul si acum il setam (dimensiunea)si pozitia
		layeredPane.add(label1,Integer.valueOf(2));//Integer.valueOf(2)) am implementat in felul asta pentru a delimita layerele se puteau scrie si dupa numele fiecarui layer
		layeredPane.add(label2,Integer.valueOf(0));
		layeredPane.add(label3,Integer.valueOf(1));
		
		JFrame frame=new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600,600);
		frame.add(layeredPane);// am adaugat obiectul creat( al clasei manager)
	
		frame.setVisible(true);
	}

}
