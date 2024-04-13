import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener{
	
	JComboBox combobox;
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		String[]animals= {"Caine","Pisica","Porc","Cal"};		// foarte important sa fie Wrapper classes
		
		
		combobox=new JComboBox(animals);// am adugat array ul la combobox
		combobox.addActionListener(this);
		
//		combobox.setEditable(true); // putem scrie noi 
//		System.out.println(combobox.getItemCount());	// numara cate iteme avem in combobox in cazul nostru 4
//		combobox.addItem("Maimuta");	// adaugam o noua intrare in string ul afisat de combobox
//		combobox.insertItemAt("Maimuta", 0);	// adauga in sirul nostru in pozitia dorita "0 "in cazul nostru "Maimuta" 
//		combobox.setSelectedIndex(2); 			// afiseaza in combobox pozitia din sir pe care o vrem noi 
//		combobox.removeItem("Pisica");			// sterge din sir itemul "Pisica" mare atentie la scriere
//		combobox.removeItemAt(0); 				// sterge elementul din sir in funtie de pozitie
		combobox.removeAllItems();				// sterge tot din combobox
		
		
		this.add(combobox);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==combobox) {
			System.out.println(combobox.getSelectedItem());
		}
	}
}
