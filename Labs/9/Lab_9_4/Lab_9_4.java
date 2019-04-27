package softwareDevelopement;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Lab_9_4 {

	public static void main(String[] args) throws Exception{
		
		if(args.length !=2) {
			System.out.println("Usage: java...");
			System.exit(1);
		}
		File outFile = new File("Temp.txt");
		PrintWriter pw = new PrintWriter(outFile);
		File inFile = new File(args[1]);
		Scanner input = new Scanner(inFile);
		while(input.hasNext());{
			String line = input.nextLine();
			pw.println(line.replaceAll(args[0], ""));
		}
		inFile.delete();
		outFile.renameTo(inFile);
	}
}
