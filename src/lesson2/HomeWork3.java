package lesson2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class HomeWork3 {

	public static void main(String[] args) throws IOException {
		// //3. Читаем строку из файла, записываем в другой файл ту же строку заменив все символы нижнего регистра - символами верхнего, и наоборот. 
		
		FileReader reader = new FileReader("c:/tmp/hw3.txt");
		FileWriter writer = new FileWriter("c:/tmp/hw3_respons.txt", false);
		char[] buff	= new char[100];	
		int count;
		String result = "";
		StringBuilder  builder= new StringBuilder();
		StringBuilder  convertBuilder= new StringBuilder();
		
		while ((count = reader.read(buff)) != -1){
			builder.append(buff,0,count);
		}
		System.out.println(builder);
	
		for(int i=0; i < builder.length(); i++){
			if(Character.isUpperCase(builder.charAt(i))){
				convertBuilder.append(Character.toLowerCase(builder.charAt(i)));
			} else{
				convertBuilder.append(Character.toUpperCase(builder.charAt(i)));
			}
		}
		result=convertBuilder.toString();
		System.out.println("------------- ");
		System.out.println(result);	
		writer.write(result);
		
		writer.flush();
		writer.close();
		
	}

}











