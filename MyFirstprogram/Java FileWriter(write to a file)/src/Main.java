import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
	try {
		FileWriter writer=new FileWriter("poem.txt");
		writer.write("Trandafirii sunt rosii\n Cerul este albastru \n Fund Fund Fund");
		writer.append("\n(Un poem de bogdan)"); // va introduce in text la sfarsit
		writer.close();
	} 
	catch (IOException e) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	}

}
