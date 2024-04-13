import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MyFrame extends JFrame implements ActionListener{

	
	
	
	JMenuItem loadItem ;
	JMenuItem saveItem ;
	JMenuItem exitItem ;
	 
	ImageIcon icon1;
	ImageIcon icon2;
	ImageIcon icon3;
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(new FlowLayout());
		
		icon1=new ImageIcon("loading.png");
		icon2=new ImageIcon("save.png");
		icon3=new ImageIcon("exit.png");
		
		JMenuBar menu=new JMenuBar();	// cream meniul
		JMenu filemenu=new JMenu("File");
		JMenu editmenu=new JMenu("Edit");
		JMenu helpmenu=new JMenu("Help");
		
		loadItem = new JMenuItem("Load");
		saveItem = new JMenuItem("Save");
		exitItem = new JMenuItem("Exit");
		
		
		filemenu.setMnemonic(KeyEvent.VK_F); //in felul acesta putem accesa de la tastura 
		editmenu.setMnemonic(KeyEvent.VK_E);	//ALT+ E FOR EDIT - FARA A ATINGE MOUSE UL
		helpmenu.setMnemonic(KeyEvent.VK_H);	//ALT+ H FOR EXIT
		
		loadItem.setMnemonic(KeyEvent.VK_L);	//L FOR LOAD
		saveItem.setMnemonic(KeyEvent.VK_S);	//S FOR SAVE
		exitItem.setMnemonic(KeyEvent.VK_E);	//E FOR EXIT
		
		loadItem.setIcon(icon1);
		saveItem.setIcon(icon2);
		exitItem.setIcon(icon3);
		
		loadItem.addActionListener(this);
		saveItem.addActionListener(this);
		exitItem.addActionListener(this);
		
		filemenu.add(loadItem);
		filemenu.add(saveItem);
		filemenu.add(exitItem);
		
		menu.add(filemenu);
		menu.add(editmenu);
		menu.add(helpmenu);
		
		this.setJMenuBar(menu);	// metoda de inserare a meniului in frame 
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==loadItem) {
			System.out.println("Ai selectat incarcarea itemului");
		}
		else if(e.getSource()==saveItem) {
			System.out.println("Ai selectat salvarea itemului");
		}
		else if(e.getSource()==exitItem) {
			System.exit(0);	// metode de iesire
		}
	}

}
