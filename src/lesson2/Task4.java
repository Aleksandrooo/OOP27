package lesson2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) throws IOException {
		// Пользователь вводит в коммандной строке аргументы, первый - путь к копированному файлу,
//		второй - путь к файлу в который будет скопировано все содержимое с первого. 
//		Копировать можно вычитывая данные, а потом вписывая.
		
		String result=""; //, fileName = "text2.txt", cloneFileName = "clone_text2.txt";
		String fileName = "";
		String cloneFileName = "";
		
		if(args.length == 2){
				//!args[1].isEmpty() & !args[2].isEmpty() ){
			fileName=args[0];
			cloneFileName=args[1];
		} else {
			System.out.println(fileName );
			System.exit(-1);
		}
		System.out.println(fileName );
		FileReader reader = new FileReader("c:\\Users\\Admin\\workspace\\Oop27\\" + fileName);
		Scanner scan = new Scanner(reader);
		FileWriter writer = new FileWriter("c:\\Users\\Admin\\workspace\\Oop27\\" + cloneFileName, true);
		
		while(scan.hasNextLine()){
			result = scan.nextLine();
			writer.write(result);
			writer.write(System.lineSeparator());
		}
		System.out.println(result);
		reader.close();
		writer.flush();
		writer.close();
	}

}
