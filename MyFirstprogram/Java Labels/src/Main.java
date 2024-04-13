import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Main {

	public static void main(String[] args) {
		// JLabel = a GUI display are for a string of text ,an image, or both
		
		
		ImageIcon imagine=new ImageIcon("PNG.png");
		Border border = BorderFactory.createLineBorder(Color.cyan,5); // seta, border ul si caracteristicile lui 
		
		JLabel label= new JLabel();		// creare label
		label.setText("Arunci cu zarul ?");	//scruere text in label
		label.setIcon(imagine);
		label.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT,CENTER, RIGHT of imageicon
		label.setVerticalTextPosition(JLabel.TOP);      // Set texty TOP,CENTER,BOTTON of imageicon
		label.setForeground(new Color(100,100,250));		// s a schimbat culoare fontului
		label.setFont(new Font("MV Boli",Font.PLAIN,30));	// seteaza caracteristicile noului font ()
		label.setIconTextGap(-24); // seteaza distanta(gap-ul) intre text si imagine
		label.setBackground(Color.DARK_GRAY);		// SETEAZA CULOAREA
		label.setOpaque(true);	// Display background color
		label.setBorder(border);	// intorudecem borderul creat in label
		label.setVerticalAlignment(JLabel.CENTER);		// seteaza pozitia pe vertical a textului si pozei in label
		label.setHorizontalAlignment(JLabel.CENTER);    // seteaza pozitia pe orizontal a textului si pozei in label
//		label.setBounds(100,100, 350, 350);		// seteaza pe axa x si y 
		
		
		JFrame frame=new JFrame();
		frame.setVisible(true);
//		frame.setSize(500,500);	
//		frame.setLayout(null);

/*Linia de cod frame.setLayout(null); dezactivează managerul implicit de aranjare a 
 * componentelor într-un container (cum ar fi un frame sau un panou) în Java Swing. 
 * Acest lucru înseamnă că atunci când este setat pe null, componentele sunt plasate
 *  manual în container și nu sunt afectate de niciun layout manager.Atunci când se 
 *  utilizează frame.setLayout(null);, trebuie să plasați și să dimensionați manual 
 *  fiecare componentă în container folosind metodele setBounds() sau setLocation() 
 *  și setSize().*/
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(label);	// adaugam label in frame
		frame.pack();/*cand il folosim va redimensina frame ul in functie de ce
		 			avem in label deci nu mai punem dimensiunile frame ului + 
		 			trebuie sa fim atenti sa fie pusa aceasta metoda dupa ce am 
		 			adaugat label ul in frame*/
	}

}
