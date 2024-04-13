import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class MyFrame extends JFrame implements ActionListener{
	JRadioButton pizzabutton;
	JRadioButton pastebutton;
	JRadioButton hamburgerbutton;
	ImageIcon pizzaIcon;
	ImageIcon pasteIcon;
	ImageIcon hamburgerIcon;
	
	MyFrame(){
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		pizzabutton=new JRadioButton("Pizza");
		pastebutton=new JRadioButton("Paste");
		hamburgerbutton=new JRadioButton("Hamburger");
		pizzabutton.setFocusable(false);
		pastebutton.setFocusable(false);
		hamburgerbutton.setFocusable(false);
		pizzabutton.setFont(new Font("Consolas",Font.BOLD,30));
		pastebutton.setFont(new Font("Arial",Font.ITALIC,30));
		hamburgerbutton.setFont(new Font("TimesNewRoman",Font.PLAIN,30));
		
		ButtonGroup group=new ButtonGroup();
		group.add(hamburgerbutton);
		group.add(pastebutton);
		group.add(pizzabutton);
		
		pizzabutton.addActionListener(this);
		pastebutton.addActionListener(this);
		hamburgerbutton.addActionListener(this);
		
		pizzaIcon=new ImageIcon("pizza.png");
		pasteIcon=new ImageIcon("pasta.png");;
		hamburgerIcon=new ImageIcon("hamburger.png");;
		
		pizzabutton.setIcon(pizzaIcon);
		pastebutton.setIcon(pasteIcon);
		hamburgerbutton.setIcon(hamburgerIcon);
		
		this.add(hamburgerbutton);
		this.add(pastebutton);
		this.add(pizzabutton);
		this.pack();
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()== hamburgerbutton) {
			System.out.println("Ai selectat hamburger");
		}
		else if(e.getSource()== pastebutton) {
			System.out.println("Ai selectat paste");
		}
		else if(e.getSource()== pizzabutton) {
			System.out.println("Ai selectat pizza");
		}
	}

}
