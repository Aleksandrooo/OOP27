package lesson2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class HomeWork5 {

	public static void main(String[] args) throws IOException {
		// //5. Написать программу для поиска слова в файле, программа должна показать: количество таких слов в файле, 
		//для каждого найденного слова: номер строки, и номер слова в строке. Искомое слово вводим с клавиатуры.
		
		FileReader reader = new FileReader("c:/tmp/hw5.txt");
		Scanner scan = new Scanner(reader);
		Scanner scanWord = new Scanner(System.in);
//		FileWriter writer = new FileWriter("c:/tmp/hw5_respons.txt", false);
		
		String text, wordForFound = "Java";
		System.out.println("Введите слово для  поиска : ");
		wordForFound = scanWord.nextLine();
		System.out.println("слово: " + wordForFound);

		int i = 0, count = 0;
		while(scan.hasNextLine()){
			text = scan.nextLine().toString();
			i++;
			//System.out.println("Номер строки i " + i + " " +  text);
			String [] buff = text.split(" ");
			for(int j=0; j<buff.length; j++){
				if(buff[j].equals(wordForFound)){
					System.out.println("В  строке " + i + " cлово " + wordForFound + "  под номером " + (j + 1));
					//System.out.println("----");
					count++;
				}

			}
		}
		
		System.out.println("----");
		System.out.println("cлово " + wordForFound + " встречается " + count + " раз.");
	
//		writer.flush();
//		writer.close();

	}

}
