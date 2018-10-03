import p1.auto_database;

import java.util.* ; 
import java.lang.* ;
import java.io.*;

public class query_tester    {
	 

	
   public static void main(String args[]) throws IOException
    {
      int f;
	  Console co = System.console();
	  String read= null;
	  String[] in_read = new String[8];
	  int index = 0;

	  String[][] auto_dataset2 = new String[7][140];
	  auto_database dbase = new auto_database();
	  dbase.readAutodata_fromCSV(auto_dataset2);
	  
	  System.out.println("Here query car details from dataset.");
	  System.out.println("Enter :  find  reg (reg-no)       - to find a certain register number car.   ..   or  ");
	  System.out.println("         find  motor > (value)   - to find a all models with motor-size over a limit.");
	  	  
	  try { read = co.readLine(); } catch(Exception e) {}
	   
	  in_read= read.split(" ");
	  
	  if ((in_read[0].equals("find")) && (in_read[1].equals("reg") ))
	  {  index =  dbase.search_auto(auto_dataset2, in_read[2]);  
         dbase.print_entry(auto_dataset2, in_read[2], index); }
		
      if ((in_read[0].equals("find")) && (in_read[1].equals("motor"))  && (in_read[2].equals(">")) ) 
	  {    
         dbase.print_motor_size(auto_dataset2, in_read[3]); }
		 
		 
      System.out.println(" ");
	  System.out.println("Query other car with same commands: ");
	   	  
	  try { read = co.readLine(); } catch(Exception e) {}
	   
	  in_read= read.split(" ");
	  
	  if ((in_read[0].equals("find")) && (in_read[1].equals("reg") ))
	  {  index =  dbase.search_auto(auto_dataset2, in_read[2]);  
         dbase.print_entry(auto_dataset2, in_read[2], index); }
		 
	  if ((in_read[0].equals("find")) && (in_read[1].equals("motor"))  && (in_read[2].equals(">")) ) 
	    {     dbase.print_motor_size(auto_dataset2, in_read[3]); }
	  
	  
  
 }
}
