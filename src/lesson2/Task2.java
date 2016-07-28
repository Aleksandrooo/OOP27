package lesson2;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;;

public class Task2 {
	
	public static void main(String[] args) throws IOException {
		FileReader reader = new FileReader("text2.txt");
		Scanner scan = new Scanner(reader);
		
		while(scan.hasNextLine()){
			System.out.println(scan.nextLine());
		}
		reader.close();
	}
}

/*
package lesson2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Task2_2 {

	public static void main(String[] args) throws IOException {
	
		//readMass();
		stringBilderExample();
	
	}	
		
	public static void readPerChar() throws IOException{	
		FileReader reader = new FileReader("test.txt");
		int ch;
		String str = "";
//		for(;ch>=0;){
//			ch = reader.read();
			while((ch = reader.read()) != -1){
			//System.out.print((char)ch);
				str += (char)ch;
		}
	System.out.println(str);
	
	}
	
	public static void readMass() throws IOException{
		FileReader reader = new FileReader("test.txt");
		int buffSize = 20;
		char [] buff = new char[buffSize];
		
//		int count  = reader.read(buff);
//		System.out.println(count);
//		System.out.println(buff);
//		System.out.println(reader.read(buff));
		int count;
		String result = "";
		while((count = reader.read(buff)) != -1){
			String part = new String(buff,0,count);
			result += part;
			}
		System.out.print(result);
		
	}
	
	
	public static void stringBilderExample() throws IOException{
			  FileReader reader = new FileReader("test.txt");
			  char [] buff = new char[5];
			  int count;
  
			  StringBuilder builder = new StringBuilder();
			  
			  while((count = reader.read(buff)) != -1){
			  // String part = new String(buff, 0, count);
			   builder.append(buff,0,count);

			  }
			  String result = builder.toString();
			  System.out.println(result);
			  
			 }
	
	
	
	
	public static void test(){
		
		
		
	}
	

}
*/