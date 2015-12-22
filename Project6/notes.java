" Reading and writing text files: 
"
File inputFile = new File("input.txt");
FileReader reader = new FileReader(inputFile);
Scanner in = new Scanner(reader); 

while (in.hasNextDoubles()){
	double value = in.nextDouble();
	//Process value
}
"To write to a file, construct a PrintWriter Object"

PrintWriter out = new PrintWriter("output.txt");

"If file does not exist, new file will be made. If the file does not exist, you will overwrite
make sure you code to check if file is there first."

out.printf("Total: %8.2f\n", total); 

"You must close once you are done writing!"

out.close(); 
in.close(); 

"When file does not exist, there will be a FileNotFound exception. To handle, follow this"

public static void main(String[] args) throws FileNotFound

import java.io.File; 
import java.io.FileNotFound;
import java.io.PrintWriter;
import java.util.Scanner; 

Scanner console = new Scanner(System.in)
System.out.println("What is the input file?")
String inputFileName = console.next();
if(){
	throw new IllegalArguementExpression("That file does not exist");
}
System.out.println("What is the output file?")
Sting outputFileName = console.next();

File inputFile = new File(inputFileName);
FileReader reader = new FileReader(inputFile);
Scanner in = new Scanner(reader); 
PrintWriter out = new PrintWriter(outputFileName)

while (in.hasNextDouble())
{
	double value = in.nextDouble()
	out.printf("%15.2f\n",value)
	
	}
}


out.close(); 
in.close(); 

"If you want to add to an existing file use a boolean expression to indincate that you want to append"

FileWriter("output.txt", true); 

" next method gets rid of spacing between values."

"Commandline arguements"
for (int i = 0; i < args.length; i++)
{
	string arg = args[i];
	if  (arg.chatAt(0) == &apos;-&apos)
	{
		char option = arg.
	}
}

args[0]
args[1]

throw new IllegalArguementExpression("You fucked up");
