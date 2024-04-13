
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.*;
public class Main {

	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		
		Scanner scanner=new Scanner(System.in);
		
		File file=new File("Melodie1.wav"); 
//			Aici se creează un obiect de tip File care reprezintă fișierul audio "Tyla-Water-Official-Music-Video.wav".
//			Aceasta este calea către fișierul audio pe care dorim să îl manipulăm în cod.
		
		AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
//			Utilizând metoda statică getAudioInputStream() a clasei AudioSystem, se obține un flux de intrare audio 
//			(AudioInputStream) asociat fișierului audio specificat. Acest flux de intrare este
//			utilizat pentru a citi datele audio din fișierul respectiv.
//			AudioInputStream este o clasă din API-ul Java Sound. Această clasă reprezintă un flux de intrare pentru
//			date audio. Ea oferă metode pentru citirea datelor audio dintr-o sursă specificată.
		
		Clip clip = AudioSystem.getClip();
//			Se obține un obiect Clip utilizând metoda statică getClip() a clasei AudioSystem. Un Clip în Java este utilizat
//			pentru a reda și controla redarea de fișiere audio scurte, cum ar fi sunetele de notificare sau muzica de fundal.
		clip.open(audioStream);
		// Folosind metoda open() a obiectului Clip, se deschide fluxul de intrare audio asociat fișierului audio.
		// Acest lucru pregătește obiectul Clip pentru a fi utilizat pentru redarea audio a fișierului "Melodie1.wav".
		
		String response="";
		
		
		while(!response.equals("Q"))	// In while am pus ca atata timp cat variabila response nu este egala cu "Q" folosinfd metoda equals
		{
			System.out.println("P= Play, Q= Quit, R = Reset, S=Stop");
			System.out.print("Optiunea ta este: ");
			response=scanner.next();
			response = response.toUpperCase();
			switch(response) {
				case ("P"): clip.start();
				break;
				case ("Q"): clip.close();
				break;
				case ("R"): clip.setMicrosecondPosition(0);
				break;
				case ("S"): clip.stop();
				break;
				default: System.out.println("Optiunea nu este valida");
			}
		}
		System.out.println("Bafta");
	}

}
