import p1.auto_database;

import java.util.* ; 
import java.lang.* ;
import java.io.*;

public class query_tester    {
	 

	
   public static void main(String args[]) throws IOException
    {
      int f , query_limit=0;
	  Console co = System.console();
	  String read= null;
	  String[] in_read = new String[8];
	  int index = 0;

	  String[][] auto_dataset2 = new String[7][140];
	  auto_database dbase = new auto_database();
	  dbase.readAutodata_fromCSV(auto_dataset2);
	  
	  System.out.println("Here query car details from dataset.");
	  
	  while (query_limit < 8 )
	  {
	  System.out.println("Enter :  find  carname (reg-no)       - to find a car  with a producers name    ..   or  ");
	  System.out.println("         find  model   (model)   - to find a all models with a give value. ... ");
	  System.out.println("         find  year   (min_year) (max_year) - to find a cars with model year between min & max ");
	  	  
	  try { read = co.readLine(); } catch(Exception e) {e.printStackTrace();}
	   
	  in_read= read.split(" ");
	  
	  if ((in_read[0].equals("find")) && (in_read[1].equals("carname") ))  // this verifies that car name is what the query is for
	  {  dbase.query_dataset( auto_dataset2, 2, in_read[2] , " ");  }
         		
      if ((in_read[0].equals("find")) && (in_read[1].equals("model") ) )  // this verifies that car model is what the query is for 
	  {    
	  dbase.query_dataset( auto_dataset2, 3, in_read[2] , " ");   }
	  
	  if ((in_read[0].equals("find")) && (in_read[1].equals("year") ) ) 
	  {    
	  dbase.query_dataset( auto_dataset2, 1, in_read[2] ,  in_read[3]);   }
	   
	  System.out.println(" \n "); 
	  query_limit += 1; 
	  } 
		 
  
	}
}
