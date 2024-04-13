import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		//JOptionPane= pop up a standard dialog box that prompts users for
		//				a value or informs then of something
		
//		JOptionPane.showInternalMessageDialog(null, "Informatie fara valoare","titilul",JOptionPane.PLAIN_MESSAGE);
//		JOptionPane.showInternalMessageDialog(null, "Informatia clasificata a fost arhivata","Informatie Arhivata",JOptionPane.INFORMATION_MESSAGE);
//		JOptionPane.showInternalMessageDialog(null, "Te pot ajuta cu ceva?","Intrebare de poolitete",JOptionPane.QUESTION_MESSAGE);
//		JOptionPane.showInternalMessageDialog(null, "Calculatorul a fost contaminat","Atentie!",JOptionPane.WARNING_MESSAGE);
//		JOptionPane.showInternalMessageDialog(null, "A aparut o eroare","Error",JOptionPane.ERROR_MESSAGE);
		
//		System.out.println(JOptionPane.showConfirmDialog(null, "Bro, do you even code?","This is my title", JOptionPane.YES_NO_CANCEL_OPTION));
//		int answer = JOptionPane.showConfirmDialog(null, "Bro, do you even code?","This is my title", JOptionPane.YES_NO_CANCEL_OPTION);
		
//		String name=JOptionPane.showInputDialog("What is your name? :  ");
//		System.out.println("Numele tau este " + name);
		
		String[] raspunsuri= {"nu, multimesc","Multumesc","Paaaa","caca"};
		System.out.println(JOptionPane.showOptionDialog(null,
									"Esti cel mai tare",
									"Mesaj secret!",
									JOptionPane.YES_NO_CANCEL_OPTION,
									JOptionPane.INFORMATION_MESSAGE,
									null,
									raspunsuri,
									0));
	
	
	}

}
