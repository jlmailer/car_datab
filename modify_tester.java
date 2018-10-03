import p1.auto_database;

import java.util.* ; 
import java.lang.* ;
import java.io.*;

public class modify_tester    {
	 

	
   public static void main(String args[]) throws IOException
    {
      int f, new_year;
	  Console co = System.console();
	  String read= null;
	  String[] in_read = new String[8];
	  int index = 0;

	  String[][] auto_dataset2 = new String[7][140];
	  auto_database dbase = new auto_database();
	  dbase.readAutodata_fromCSV(auto_dataset2);

	    System.out.println("Testing modifying: \n  Give new REG-NO and MODEL-YEAR to car : ( Ford, F4, TLA-420, 2010, '7.8.2018' ,330,350) ");
		
	  System.out.println("Enter : modify (NEW-REG-NO)   (NEW-MODEL-YEAR)");
	  	  
	  try { read = co.readLine(); } catch(Exception e) {}
	   
	  in_read= read.split(" ");
	  
	  if (in_read[0].equals("modify"))
	  {  new_year=Integer.parseInt(in_read[2]); 
         index =  dbase.search_auto(auto_dataset2, "TLA-420");
         dbase.modify_entry(auto_dataset2, "FORD",  "TLA-420",  in_read[1] , 2010,  new_year);
	  }
	  
	  System.out.println("After modifying: ");
	  dbase.printAll(auto_dataset2);
      
      System.out.println(" ");  
      System.out.println(" Modifying car: ( Audi, A7 , ADF-548, 2012 ,'2.4.2018', 400, 400 )");
	  System.out.println("Enter : modify (NEW-REG-NO)   (NEW-MODEL-YEAR)"); 
     
	   	  
	  try { read = co.readLine(); } catch(Exception e) {}
	   
	  in_read= read.split(" ");
	  
	  if (in_read[0].equals("modify"))
	  {  new_year=Integer.parseInt(in_read[2]); 
         index =  dbase.search_auto(auto_dataset2, "ADF-548");
         dbase.modify_entry(auto_dataset2, "Audi",  "ADF-548",  in_read[1] , 2012,  new_year);
	  }
	  
	  System.out.println("After modifying: ");
	  dbase.printAll(auto_dataset2);
	  
	  
  
	}
}
 

