
import java.util.* ; 
import java.lang.* ;
import java.io.*;

public class auto_database    {
	 
    private String[][] auto_dataset;
	private int datab_size;
	
  public void auto_database()
  {
     auto_dataset = new String[7][140];
     datab_size=0; 	 
 
  } 
  
   
  public void readAutodata_fromCSV(String[][] auto_dataset)
  {
	  
	 String line = ""; 
	 String[] labels = new String[7];
	 String[] values = new String[7];
	 boolean check1 = false;
	 boolean check2 = false ;
	 boolean right_format = false; 
	 BufferedReader buf = null ; 
	 
	 try {
	 FileReader f_csv = new FileReader("auto_data.csv");
	 buf = new BufferedReader(f_csv);
	 }
	 catch (FileNotFoundException e){   }
	 
	 try {
	 line = buf.readLine();
	 }
	 catch (IOException e){   }
	 
	 labels = line.split(";",7);
	 
	 if ((labels[0].equals("name")) && (labels[1].equals("model")) && (labels[2].equals("reg-no")) && (labels[3].equals("year")) ) 
	 { check1=true;}
     if ((labels[4].equals("kts-date")) && (labels[5].equals("motor-size")) && (labels[6].equals("motor-power")) )
	 { check2=true;}
	 if (check1 && check2)  right_format =true;
	 
	 if (right_format == false) {System.out.println(" CSV-file is not of right format"); return; }
	 
	 while( line != null)
	   {
	    try { line = buf.readLine();}
	      catch (IOException e){   } 	 
		if (line != null)
		 {
 		     values = line.split(";",7);	
		   
       	     auto_dataset[0][datab_size] = values[0];
		     auto_dataset[1][datab_size]= values[1];
		   
		     auto_dataset[2][datab_size]= values[2]; auto_dataset[3][datab_size]= values[3];
	         auto_dataset[4][datab_size]= values[4];  auto_dataset[5][datab_size]= values[5];
		     auto_dataset[6][datab_size]= values[6]; 
		 
		 datab_size += 1;
		 //	  }
	//  	 
	   }
    }
}
  
	   
	   
 
 
 
  private void add_Entry(String[][] auto_dataset, String name, String model, String reg_no , int year , String kats_date, String motor_size, String motor_power)
   {
	   // This method adds entry to the end of data_base
	  
	  // int result = search_auto(auto_dataset, name, model, year); 
	   String year_string = Integer.toString( year);
	   
      // check if already exists!
	  
		 
		  auto_dataset[0][datab_size] = name;  auto_dataset[1][datab_size] = model; 
		  auto_dataset[2][datab_size] = reg_no; auto_dataset[3][datab_size] = year_string;   auto_dataset[4][datab_size] = kats_date;
		  auto_dataset[5][datab_size] = motor_size;  auto_dataset[6][datab_size] = motor_power;	
		 
		  datab_size +=1 ;  
	  
			 
			 
   }
  
  
  private void remove_Entry(String[][] auto_dataset, String name, String model, String reg_no)
   {
	  int f, position = 0;
	   
      for(f=0;f<datab_size;f++)
	  {
        if (auto_dataset[0][f].equals(name) && auto_dataset[1][f].equals(model) && auto_dataset[2][f].equals(reg_no) )
           
		   {	 
			 position = f;
	       }
	     }
		 
	   for(f=position;f<datab_size-1;f++)
	  {
             auto_dataset[0][f] = auto_dataset[0][f + 1]; auto_dataset[1][f] = auto_dataset[1][f + 1];
			 auto_dataset[2][f] = auto_dataset[2][f + 1]; auto_dataset[3][f]= auto_dataset[3][f + 1];
			 auto_dataset[4][f] = auto_dataset[4][f + 1]; auto_dataset[5][f] = auto_dataset[5][f+ 1];
			 auto_dataset[6][f] = auto_dataset[6][f + 1];
			 
			 
	  }
	  remove_last_entry(auto_dataset , datab_size);
					 
   }
	  	  
	  
  private void remove_last_entry(String[][] auto_dataset, int size)
  {
	 auto_dataset[0][size] = null;  auto_dataset[1][size] = null;  auto_dataset[2][size] = null;  auto_dataset[3][size] = null;
     auto_dataset[4][size] = null;  auto_dataset[5][size] = null; auto_dataset[6][size] = null;
	  
	 datab_size -= 1;   
	
  }
   private int search_auto(String[][] auto_dataset, String name, String model, int year)
   {
	  // method result value is the index where name, model and year are correct (-1 if no entry matches)  
	  String year_string = Integer.toString( year);  
	  int f=0;
      int resu = -1; // returns -1 if automodel not found
	  
      while( (resu == -1) && ( f<datab_size))
	  {
       if (   (auto_dataset[0][f].equals(name)) && (auto_dataset[1][f].equals(model)) && (auto_dataset[2][f].equals( year_string) ) )  resu = f;
	   
	  }  
	  return resu;
   }
	   
    private void modify_entry(String[][] auto_dataset, String name, String model, int year, String new_motor_size, String new_motor_power , String new_kats_date, String new_rek_no)
	{
	  int index = search_auto(auto_dataset, name, model, year) ;
      if (index == -1) return;  // if return_value = -1  -> no entry found in the database. 	  
	  // this method modifies entry only if it is already in the database.
		
		
	}
  
  
  
   private  void query_Product(String[][] auto_dataset, String product)
   {
	 
   }	
    private void printAll(String[][] auto_dataset)
	{
      int f;
	  System.out.println(" Contents of all autos in current data set :");	   
      for(f=0;f<datab_size;f++)
	  {
        System.out.print( auto_dataset[0][f] + " " +  auto_dataset[1][f]  + " "  + auto_dataset[2][f] + " ");
	    System.out.print( auto_dataset[3][f] + " " +  auto_dataset[4][f]  + " "  + auto_dataset[5][f] + " ");
	    System.out.println( auto_dataset[6][f]); 
		
         
	  }		
		
		
	}
   
   
	private void print_Product_details(String[][] auto_dataset, String product)
	{
      int f, g;		 
  
     } 
		
	
	
	
   public static void main(String args[]) throws IOException
    {
      int f;
	  String[][] auto_dataset2 = new String[7][140];;
	  auto_database dbase = new auto_database();
	  dbase.readAutodata_fromCSV(auto_dataset2);
	  dbase.printAll(auto_dataset2); System.out.println(" ");
	  
	  dbase.remove_Entry( auto_dataset2 , "Audi","A7","ADF-548");
	  
	  try {  Thread.sleep(800);}
	   catch (InterruptedException e){   } 
	   
	  dbase.printAll(auto_dataset2);   System.out.println(" ");
	  
	 
	  dbase.remove_Entry( auto_dataset2 , "Toyota","Corolla","KAD-778");
	  

	  
	  try {  Thread.sleep(800);}
	   catch (InterruptedException e){   } 
	   
	  dbase.printAll(auto_dataset2);  System.out.println(" ");

	   try {  Thread.sleep(800);}
	   catch (InterruptedException e){   } 
	  
      dbase.add_Entry(auto_dataset2,  "Saab", "D4", "LOE-783", 2007 , "4.4.2018","340","380");
	  dbase.add_Entry(auto_dataset2,  "Saab", "E8", "TOL-127", 2008 , "19.9.2018","330","370");
	   
	  dbase.printAll(auto_dataset2);   System.out.println(" ");
	  
  
 }
}
