import java.io.File;

public class Main {

	public static void main(String[] args) {
		
		File file=new File("test_document.txt"); // metoda in care inseram documentul direct in proiect (obs nu in clasa sau in src )
		File file2=new File("C:/Users/Bogdan/Desktop/test_document.txt"); // metoda in care ii specific calea "C:/Users/Bogdan/Desktop/test_document.txt" !!!! mare atentie la "/"
		
		if(file.exists()) {
			System.out.println("That file exists!");
			System.out.println(file.getAbsolutePath());
			System.out.println(file.getPath());
			System.out.println(file.isFile());
			file.delete();
			}
		else {
			System.out.println("That file doesn't exist");
		}
	}

}
