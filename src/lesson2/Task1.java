package lesson2;

import java.io.FileReader;
import java.io.IOException;;

public class Task1 {
	
	public static void main(String[] args) throws IOException {
		FileReader reader = new FileReader("text2.txt");
		
//		for(int i =0; i < 500; i++){
//		int ch = reader.read();
//		System.out.println((char)ch);
//		}
		int ch =0;
//		do{
//			ch = reader.read();
//			if (ch != -1){
//			System.out.println((char)ch);
//			}
//			} while (ch != -1);
//		String str= "";
//		while((ch = reader.read()) != -1) {
//			str= str + (char)ch;
//				//System.out.print((char)ch);
//			
//			}
//		System.out.print(str);
//		System.out.print(str.length());
		
		char[] buff	= new char[10];	
		int count ;
		//String result = "";
		StringBuilder  builder= new StringBuilder();
		
//		while ((count = reader.read(buff)) != -1){
//			String part = new String(buff, 0, count);
//			builder.append(part);
//			builder.
//			
//		}
//		String result = builder.toString();
//		System.out.println(result);	
//		
		while ((count = reader.read(buff)) != -1){
//			String part = new String(buff, 0, count);
			builder.append(buff,0,count);
						
		}
		String result = builder.toString();
		System.out.println(result);	
		
//		while ((count = reader.read(buff)) != -1){
//		String part = new String(buff, 0, count);
//		result += part;
//		System.out.println(result);	
//			
////			for (int i = 0; i < count; i++){
////				System.out.print(buff[i] );
////		}
//		}

		
		
		}
}

