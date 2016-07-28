package lesson2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class HomeWork1 {

	public static void main(String[] args) throws IOException {
		//1. Читаем строку из файла - пишем в другой файл перевернутую строку. 

		FileReader reader = new FileReader("c:/tmp/hw1.txt");
		FileWriter writer = new FileWriter("c:/tmp/hw1_respons.txt", false);
		char[] buff	= new char[100];	
		int count;
		String result = "";
		StringBuilder  builder= new StringBuilder();
		StringBuilder  revertBuilder= new StringBuilder();
		
		while ((count = reader.read(buff)) != -1){
			builder.append(buff,0,count);
		}
			
		System.out.println(builder);	
//		char [] arrayChar = builder.toString().toCharArray();
//		System.out.println("arrayChar - " + arrayChar);	
		for(int i=builder.length()-2; i >=0; i--){
			revertBuilder.append(builder.substring(i, i + 1));
		}	
		result=revertBuilder.toString();
		System.out.println(result);	
		writer.write(result);
		
		writer.flush();
		writer.close();
	}

}
