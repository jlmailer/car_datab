
    
    Tärkeimmät tiedostot autotietokanta-ohjelman toteutuksessa:

 	Java luokat :
	  
            auto_database.java , sisältää kaikki luokan metodit
	            
                - auto_database()  , Luokan konstruktori
                - readAutodata_fromCSV(..)    , lukee .csv tiedostosta tiedot kaikista autoista muistiin
                - add_Entry     , Lisää yhden auton tietoineen
                - remove_Entry  , Poistaa yhden auton tietoineen
                - remove_last_entry ,  Poistaa viimeisen elementin 
                - search_auto    , Etsii autoa rekisteri-numerolla
                - modify_entry   , muuttaa auton tietoja
  
                -  print_entry   , tulostaa tietyn auton tiedot 
                -  printAll      , tulostaa koko tietokannan autojen tiedot
                -  query_dataset  ,  hakee autoja joiden tiedot ovat hakukriteerien mukaiset (esim.carname=Ford   
                                 tai year=(min max) vuosien välillä
	 
            Java tester luokat, jotka testaavat auto_database:n toimintoja :
	        - query_tester.java (testaa hakua kolmella kriteerien valinnalla)
		- modify_tester.java (testaa tietojen muuttamista)
		- tester.java  (testaa perustoimintoja: lisäys, poisto, tulostus) 
	     				 					 

       Java tester luokat käynnistyvät komennoilla:
 
             - java modify_tester
             - java tester
             - java query_tester		

       auto_data.csv = luettava.csv tiedosto(Exportattu Excel:stä) , joka alustaa tietokannan tiedot        		
