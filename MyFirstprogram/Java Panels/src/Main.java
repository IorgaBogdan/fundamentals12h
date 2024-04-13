import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		// JPanel = a GUI component that functions as a container to hold other components
		ImageIcon icon= new ImageIcon("thumbsup2.png");
		
		JLabel label=new JLabel();
		label.setText("Salutare");
		label.setVerticalTextPosition(JLabel.TOP);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setIcon(icon);
//		label.setVerticalAlignment(JLabel.CENTER);		
		/*Daca folosim setLayout(new BorderLayout()) 	putem folosi metoda setVerticalAlignment(JLabel.CENTER) pe label*/
//		label.setHorizontalAlignment(JLabel.CENTER);
		label.setBounds(0,0, 100, 100);	
		
		JPanel redpanel=new JPanel();
		redpanel.setBackground(Color.red);
		redpanel.setBounds(0, 0, 250, 250);
		redpanel.setLayout(null);	/* daca setam null la setLayout 
									( in loc de new BorderLayout()) vom
									putea folosi setBounds in label si il
									putem manipula dupa coordonate*/
		
		
		JPanel bluepanel=new JPanel();
		bluepanel.setBackground(Color.blue);
		bluepanel.setBounds(250, 0, 250, 250);
		bluepanel.setLayout(new BorderLayout());
		
		
		JPanel purplepanel=new JPanel();
		purplepanel.setBackground(new Color(100,25,200));
		purplepanel.setBounds(0, 250, 500, 250);
		purplepanel.setLayout(new BorderLayout());
		/*BorderLayout este unul dintre layout manager-ii standard din Java Swing, care aranjează 
		 * componentele într-un container în jurul marginilor acestuia, împărțind containerul în 
		 * cinci zone: nord, sud, est, vest și centru. Acest layout manager este util atunci când 
		 * doriți să plasați componente în zone specifice ale unui container și să le extindeți sau 
		 * să le restrângeți automat în funcție de dimensiunile containerului.*/
		
		
		JFrame frame= new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 800);	// setam dimensiunea
		frame.setLayout(null);		// dezactivam managerul implicit de arajare a componentelor intr-un container
		frame.setVisible(true);		//se face fereastra vizibilă
		redpanel.add(label);
		frame.add(redpanel);
		frame.add(bluepanel);
		frame.add(purplepanel);
		
	}

}
