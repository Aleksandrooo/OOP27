package lesson2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) throws IOException {
		// //2. Читаем двумерный массив из файла, сдвигаем все элементы на n элементов вперд или назад, 
		//направление зависит от знака n. n вводим с клавиатуры. в другой файл записываем результат. 
		
		FileReader reader = new FileReader("c:/tmp/hw2.txt"); 
		Scanner scanMuss = new Scanner(reader);
		FileWriter writer = new FileWriter("c:/tmp/hw2_respons.txt", false);
		PrintWriter pwriter = new PrintWriter ("c:/tmp/hw2_respons.txt");
		char  [] buff = new char[100];
		String  [][]muss = {{"11", "112", "134", "11aaa"},{"22bb", "234", "277", "288"}};
		String  [][]newMuss = new String[2][4];
		String buffer;
		int numberRow = 2, numberСolumns = 4;
//		{33, ccc, 35, 345}};
		int count, n= 2; 
		StringBuilder  builder= new StringBuilder();
		
		if((count = reader.read(buff)) != -1 ){
			builder.append(buff, 0, count);
		}
		if(n<0){ 
			for(int k = 0; k < Math.abs(n); k ++){
				for(int i=0;i<numberRow;i++){
					for(int j=0;j<numberСolumns;j++){
						
							buffer = muss[i][j];
							muss[i][j] = muss[i][j+1];
							muss[numberRow][numberСolumns] = buffer;
					}
				}	
			}
		
			
		}
		

	}

}
