import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		
		// Layout Manager= Defines the natural layout for components within a container
		
		//GridLayout= places components in a grid of cells.
		//Each component take all the available space within its cell, and each cell is the same size.
		
		JFrame frame=new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800,800);
		frame.setLayout(new GridLayout(3,3,10,10)); //in cazul nostru va fi un tablou 3x3(x o y)
											// adaug in continuare 10,10 care este spatiere intre casute
											//daca numarul de butoane depaste se va crea o noua coloana
		JButton button1=new JButton("1");
		frame.add(button1);
		frame.add(new JButton("2"));
		frame.add(new JButton("3"));
		frame.add(new JButton("4"));
		frame.add(new JButton("5"));
		frame.add(new JButton("6"));
		frame.add(new JButton("7"));
		frame.add(new JButton("8"));
		frame.add(new JButton("9"));
		frame.add(new JButton("10"));
		
		
		frame.setVisible(true);
	}

}
