import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewWindow {
	JFrame frame=new JFrame();
	JLabel label=new JLabel();
	
	NewWindow(){
		label.setBounds(100, 100, 200, 200);
		label.setText("Acesta este pagina deschisa de dumneavostra");
		label.setFont(new Font(null,Font.ITALIC,34));
		
		frame.add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
	
		frame.setVisible(true);
	}
	
}
