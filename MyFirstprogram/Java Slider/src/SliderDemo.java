import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;


public class SliderDemo implements ChangeListener{

	
	JFrame frame;
	JPanel panel;
	JLabel label;
	JSlider slider;
	
	SliderDemo(){
		frame=new JFrame("Slider demo");
		panel=new JPanel();
		label=new JLabel();
		slider=new  JSlider(0,100,50);						// sliderul va fi de la 0 la 100 si va fi pozitionat predefinit la 50
		slider.setFont(new Font("MV Boli",Font.PLAIN,20));
		label.setFont(new Font("MV Boli",Font.PLAIN,25));
		
		slider.setPreferredSize(new Dimension(400,200));
		slider.setPaintTicks(true);							// afiseaza punctele (marcaje)pe slider
		slider.setMinorTickSpacing(10);						// seteaza punctele cele mai micute(ticks) la distanta pe care o vrem( in cazul nostru din 10 in 10)
		slider.setMajorTickSpacing(25);						// seteaza punctele cele mai mari(ticks) la distanta pe care o vrem( in cazul nostru din 25 in 25)
		slider.setPaintLabels(true); 						//insereaza valorile sub slider (0,25,50,75,100) doar pentru .setMajorTickSpacing
		slider.setOrientation(SwingConstants.VERTICAL);
//		slider.setOrientation(SwingConstants.HORIZONTAL);
		slider.addChangeListener(this);
		
		
		label.setText("°C = " + slider.getValue());
		
		panel.add(slider);									// adaugam sliderul in panel
		panel.add(label);									// adaugam label in panel
		
		
		frame.add(panel);									// adaugam panel ul in frame
		frame.setSize(500,500);
		frame.setVisible(true);
		
	}
	
	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		label.setText("°C = " + slider.getValue());
	}

}
