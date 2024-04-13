import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener{
	
	JButton button;
	JButton button2;
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		button=new JButton("Schimba culoarea backgroundul");
		button.addActionListener(this );
		button2=new JButton("Schimba culoarea textului");
		button2.addActionListener(this );
		
		this.add(button);
		this.add(button2);
		this.pack();
		this.setVisible(true);
		
	}

	@Override

public void actionPerformed(ActionEvent e) {
    // TODO Auto-generated method stub
    if(e.getSource()==button) {
        // Verificăm dacă sursa evenimentului este butonul nostru
        JFileChooser fileChooser=new JFileChooser();
        // Creăm o fereastră de dialog pentru alegerea fișierului
        int response=fileChooser.showOpenDialog(null); // select file to open
        // Arătăm fereastra de dialog și așteptăm răspunsul utilizatorului

        if(response==JFileChooser.APPROVE_OPTION) {
            // Verificăm dacă utilizatorul a selectat un fișier
            File file=new File(fileChooser.getSelectedFile().getAbsolutePath());
            // Obținem calea absolută a fișierului selectat și creăm un obiect File
            System.out.println(file);
            // Afișăm calea absolută a fișierului selectat în consolăpublic void actionPerformed(ActionEvent e) {
		
		
			}
    }
	}
}
