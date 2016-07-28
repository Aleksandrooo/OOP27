package lesson2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class HomeWork4 {

	public static void main(String[] args) throws IOException {
		////4. Пишем программу, которая заменит все "нецензурные слова" в файле на [вырезано цензурой], пишем в тот же файл результат. 
		//"нецензурные слова" программа считывает из другого файла. 
		
		FileReader reader = new FileReader("c:/tmp/hw4.txt");
		//Scanner scanText = new Scanner(reader);
		FileReader readerСensorship = new FileReader("c:/tmp/hw4_2.txt");
		Scanner scan = new Scanner(readerСensorship);
		
		FileWriter writer = new FileWriter("c:/tmp/hw4_respons.txt", false);
		char[] buff	= new char[100];	
		int count;
		String result = "";
		StringBuilder  builder= new StringBuilder();
		String []  badWords = new String[100];
		ArrayList<String> badWordsList = new ArrayList<String>();
		String text;
		
		while ((count = reader.read(buff)) != -1){
			builder.append(buff,0,count);
		}
		text = builder.toString();
		System.out.println(text);
		System.out.println("---------------");
		
		int i = 0;
		while(scan.hasNextLine()){
			//badWords[i] = scan.nextLine().toString();
			//System.out.println(badWords[i] + i);
			char [] s = scan.nextLine().toCharArray();
			
			badWordsList.add(new String(s));
			System.out.println(badWordsList.get(i) + i);
			i++;
		}
		
		int startIndex, endIndex;
		String str; 
		//ArrayList<String> arList = new ArrayList<String> text.split("[\\s.,]+");
		for(int j=0; j < i; j++){
			
			str=badWords[j];

			text = text.replaceAll(badWordsList.get(j), "[вырезано цензурой]");
//			System.out.println("------rrrrrrrrrr----------- j " + j);
//			System.out.println(result);
		}	

		System.out.println("----------");
		System.out.println(text);	
		writer.write(text);
		
		writer.flush();
		writer.close();

	}

}

//text=result;
//while((startIndex = text.indexOf(badWords[j])) != -1){
//startIndex = text.indexOf(badWords[j]);
//str=badWords[j];
//startIndex = text.indexOf("Java");
//startIndex = text.indexOf(str);
//endIndex = startIndex + badWords[j].length();
//	//result = text.substring(0, startIndex) + "[вырезано цензурой]" + text.substring(endIndex,text.length());
//	text=result;
//	System.out.println(badWords[j] + " " + startIndex + " " +  endIndex);
//	}
