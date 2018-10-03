import p1.auto_database;

import java.util.* ; 
import java.lang.* ;
import java.io.*;

public class tester    {
	 

	
   public static void main(String args[]) throws IOException
    {
     
	  int f;
	  String[][] auto_dataset2 = new String[7][140];;
	  auto_database dbase = new auto_database();
	  dbase.readAutodata_fromCSV(auto_dataset2);
	  System.out.println("Original contents of dataset read from .csv -file");
	  dbase.printAll(auto_dataset2); System.out.println(" ");
	  
	  
	    
	  try {  Thread.sleep(1800);}  catch (InterruptedException e){   } 
	 
	  System.out.println(" Adding 2 entries to dataset:   'Saab', 'D4', 'LOE-783', 2007 ");
	  System.out.println("                            :    'Saab', 'E8', 'TOL-127', 2008 ");
	  
	  dbase.add_Entry(auto_dataset2,  "Saab", "D4", "LOE-783", 2007 , "4.4.2018","340","380");
	  dbase.add_Entry(auto_dataset2,  "Saab", "E8", "TOL-127", 2008 , "19.9.2018","330","370");
	   
	  
	  try {  Thread.sleep(3400);}  catch (InterruptedException e){   } 
	   
	   System.out.println(" ");	  
       dbase.printAll(auto_dataset2);   System.out.println(" ");
	  
	   
	  
	  System.out.println(" Removing 2 entries from dataset(1 Toyota and 1 Renaul2):");  
	  dbase.remove_Entry( auto_dataset2 , "Toyota","Corolla","KAD-778");
	  dbase.remove_Entry( auto_dataset2 , "Renault","CA9","EEL-814");
      
	  
	  try {  Thread.sleep(3400);}
	   catch (InterruptedException e){   } 
	   
	  System.out.println(" ");
	  dbase.printAll(auto_dataset2);  System.out.println(" ");

  
  
  
 }
}
