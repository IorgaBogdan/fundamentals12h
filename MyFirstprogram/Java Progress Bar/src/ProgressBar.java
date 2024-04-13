import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class ProgressBar {
	
	JFrame frame=new JFrame();
	JProgressBar bar=new JProgressBar(0,500); // putem seta in paranteze marimea processbar ului sau nu depinde de situatie
	
	ProgressBar(){
		
		bar.setValue(0);
		bar.setBounds(0, 0, 420, 80 );
		bar.setStringPainted(true );   // Afișează textul asociat progresului
		/*			Atunci când este setată pe true, această metodă face ca textul asociat 
		 * valorii curente să fie afișat pe componenta respectivă. Acest text poate
		 *  fi, de exemplu, procentajul progresului în cazul unui progress bar sau 
		 *  valoarea numerică curentă în cazul unui slider.
		bar			Când este setată pe false, textul asociat nu va fi afișat pe componentă.*/
		bar.setFont(new Font("MV Boli",Font.PLAIN,25));
		bar.setForeground(Color.red);
		bar.setBackground(Color.black);

		frame.add(bar);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);	//neavand manager de fereastra o sa golosim bounds pentru ce inseram in verastra
		frame.setVisible(true);
		
		fill();
		
		
		
	}
	
	public void fill() {
		int counter=500;
//		bar.setValue(10);
		while(counter>=0) {
			bar.setValue(counter);
			try {
				Thread.sleep(80);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			/*În concluzie, implementând blocul try/catch în jurul metodei Thread.sleep(1000),
			 *  te asiguri că aplicația ta va trata corect excepția InterruptedException și va 
			 *  continua execuția într-un mod controlat.*/
			counter -=1.5;
		}
		bar.setString("Done!");
	}
}

