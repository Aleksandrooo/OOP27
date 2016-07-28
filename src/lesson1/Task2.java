package lesson1;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Task2 {

	public static void main(String[] args)  throws IOException {
		// TODO Auto-generated method stub
		
		FileWriter writer = new FileWriter ("text2.txt", false);
		for(int i =0; i < 7; i++){
		writer.write("Hello word! - " + i);
		writer.write(System.lineSeparator());
		}
		
		PrintWriter  pw = new PrintWriter("text3.txt");
		for(int i =0; i < 1000; i++){
			pw.println(true);
			//pw.write(System.lineSeparator());
			}
		System.out.println(true);
		writer.flush();
		writer.close();

	}

}
