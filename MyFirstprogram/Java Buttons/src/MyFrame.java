import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements ActionListener{
	
	JButton button;
	JLabel label;
	MyFrame(){
		
		ImageIcon image=new ImageIcon("thumbsup2.png");
		ImageIcon image2=new ImageIcon("Ottopng.png");
		
		label=new JLabel();
		label.setIcon(image2);
		label.setVisible(false);
		label.setBounds(400,400, 100, 120);
		
		button=new JButton();
		button.setBounds(200, 200, 200,100);
		button.addActionListener(this);
		/*button: Acesta este obiectul de tipul JButton definit anterior în cod,
		 *  care reprezintă butonul creat în cadrul ferestrei.
		
		 addActionListener(this): Metoda addActionListener() este utilizată pentru
		 a atașa un ascultător de evenimente la buton. Acest ascultător este notificat
		  când se produce un anumit eveniment pe buton, cum ar fi apăsarea acestuia.

		this: În Java, this este o referință către obiectul curent. Deoarece clasa 
		MyFrame implementează interfața ActionListener, ea are o metodă actionPerformed(ActionEvent e)
		 definită în ea.
		Prin utilizarea this ca argument pentru addActionListener(), se specifică că 
		instanța clasei MyFrame va trata evenimentele de acțiune generate de butonul
		 respectiv. Astfel, când butonul este apăsat, metoda actionPerformed() din
		  clasa MyFrame va fi chemată pentru a gestiona acțiunea corespunzătoare.

		Prin urmare, linia button.addActionListener(this); este esențială pentru a 
		conecta butonul la logica noastră din cadrul clasei MyFrame, astfel încât
		 să putem reacționa la evenimentele generate de acesta.*/
		
//		Daca dorim sa evitam crearea interfetei si altei emtode actionPerformed ca 
//		in exemplu nostru p[utem sa folosim : button.addAction Listener(e -> System.out.println("Manacare"));
//		practic se va face acelasi lucru folosind expresile lambda
		button.setText("Sunt un buton");
		button.setFocusable(false);// chenarul din jurul textului este eliminat
		button.setIcon(image);
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.BOTTOM);
		button.setFont(new Font("MV Boli",Font.PLAIN,23));
		button.setIconTextGap(-5);
		button.setBackground(Color.LIGHT_GRAY);
		button.setForeground(Color.magenta);
		button.setBorder(BorderFactory.createEtchedBorder());
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600,600);
		this.setVisible(true);
		this.setLayout(null);
		this.add(button);
		this.add(label);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()== button) {
			System.out.println("Mancare");
			button.setEnabled(false);
			label.setVisible(true);
		}
	}
	
}
