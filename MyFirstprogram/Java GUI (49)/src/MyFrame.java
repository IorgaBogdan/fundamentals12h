import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	
	MyFrame(){
		
	
	this.setVisible(true);	// face this ul vizibil (fereastra)
	this.setSize(520,520);	// seteaza dimensiunile x si y ale ferestrei
	this.setTitle("Jthis title goes here"); // seteaza titlul ferestrei
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// Aici vom spune ca setam butonul X pentru a inchide fereastra in mod prestabilit ea este pusa pe HIDE !
	//this.setDefaultCloseOperation(Jthis.HIDE_ON_CLOSE);	//Aici setam pe hide butonul X
	//this.setDefaultCloseOperation(Jthis.DO_NOTHING_ON_CLOSE); // Aici setam ca butonul sa nu faca nimic
	this.setResizable(true);	// Aici spunem ca nu poate fi redimensionata fereastra

	ImageIcon image= new ImageIcon("Ottopng.png");// Crearte ImageIcon
	this.setIconImage(image.getImage()); // schimbam logo ul in fereastra noastra 
	this.getContentPane().setBackground(new Color(110,50,200));
	}
	
	

}
