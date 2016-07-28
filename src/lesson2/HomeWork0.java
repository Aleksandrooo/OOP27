package lesson2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class HomeWork0 {

	public static void main(String[] args) throws IOException {
// 0. Читаем строку из файла - пишем в другой файл только символы верхнего регистра, которые встречаются в файле. 

		FileReader reader = new FileReader("c:/tmp/hw0.txt");
		//FileWriter writer = new FileWriter("c:/tmp/hw0_respons.txt", false);
		PrintWriter pwriter = new PrintWriter("c:/tmp/hw0_respons.txt");
		char[] buff	= new char[10];	
		int count;
		int ch =0;
		String str="";
		StringBuilder  builder= new StringBuilder();
		
		while((ch = reader.read()) != -1) {
			if(Character.isUpperCase(ch)){
				str += (char)ch;
			}
		}
		
		String result;
		
		result = str;
		
		System.out.println(result);	
		pwriter.write(result);
		
		pwriter.flush();
		pwriter.close();
	}

}
