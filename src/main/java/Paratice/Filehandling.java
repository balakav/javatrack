package Paratice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Filehandling {
	public static void main(String args[]) throws IOException {
		File f=new File("C:\\Users\\balakb\\OneDrive - Deloitte (O365D)\\Desktop\\Demo2.txt");
		//1.create a file
		boolean status=f.createNewFile();
		 if (f.createNewFile()) {  
             System.out.println("File " + f.getName() + " is created successfully.");  
             }
		 else {  
             System.out.println("File is already exist in the directory.");  
             } 
		 //2.perform a operations
		 if(f.exists()) {
			 System.out.println("The name of the file is: " + f.getName());  
			 System.out.println(f.canRead());
			 System.out.println(f.canWrite());
		 }
		 //3.write a sentences in file
		 FileWriter fwrite = new FileWriter("C:\\\\Users\\\\balakb\\\\OneDrive - Deloitte (O365D)\\\\Desktop\\\\Demo2.txt");
		 fwrite.write("Hi EveryOne Welcome to HashedIn by Deloitte");
		 fwrite.close();
		 System.out.println("added suceessfully");
		 //4.data reader
		 Scanner dataReader = new Scanner(f);  
         while (dataReader.hasNextLine()) {  
             String fileData = dataReader.nextLine();  
             System.out.println(fileData);  
         }  
         dataReader.close();  
         System.out.print(f.length());
         System.out.println(f.getCanonicalFile());
         System.out.println(f.getAbsolutePath());
         System.out.println(f.getTotalSpace());
         System.out.println(f.getUsableSpace());
         System.out.println(f.toURI());
         System.out.println(f.toURL());
         
		
	}

}
