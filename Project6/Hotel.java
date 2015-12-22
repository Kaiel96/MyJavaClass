import java.io.*; 
import java.util.Scanner; 

class Hotel{
	public static void main(String args[]) throws IOException
	{
		try{
			Scanner console = new Scanner(System.in);
			System.out.println("What is the input file?");
			String inputFileName = console.next();
			System.out.println("What is the output file?");
			String outputFileName = console.next();
			File inputFile = new File(inputFileName);
			PrintWriter out1 = new PrintWriter(outputFileName);
			PrintWriter out2 = new PrintWriter("Dinner.txt");
			PrintWriter out3 = new PrintWriter("Conference.txt");
			PrintWriter out4 = new PrintWriter("BusinessCenter.txt");
			FileReader reader = new FileReader(inputFile);
			Scanner in = new Scanner(reader);
			in.useDelimiter(";");
			while (in.hasNext()){
				String name = in.next();
				String place = in.next();
				Double price = Double.parseDouble(in.next());
				String date = in.next();
				while (place == "Dinner"){
					out2.printf("%15s;", name);
					out2.printf("%15s;", place);
					out2.printf("%5.2f;", price);
					out2.printf("%10s\n", date);
				}
				while (place == "Conference"){
					out3.printf("%15s;", name);
					out3.printf("%15s;", place);
					out3.printf("%5.2f;", price);
					out3.printf("%10s\n", date);
				}
				while (place == "Business Center"){
					out4.printf("%15s;", name);
					out4.printf("%15s;", place);
					out4.printf("%5.2f;", price);
					out4.printf("%10s\n", date);
				}
				out1.printf("%15s;", name);
				out1.printf("%15s;", place);
				out1.printf("%5.2f;", price);
				out1.printf("%10s\n", date);	
			}
			out1.close(); 
			out2.close();
			out3.close();
			out4.close();
			in.close(); 
		}
		catch (IOException e){
			System.err.println("Caught IOException:" + e.getMessage());
		}	
	}
		
}
	