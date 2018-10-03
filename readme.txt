
    
    Tärkeimmät tiedostot autotietokanta-ohjelman toteutuksessa:

 	Java luokat :
	  
            auto_database.java , sisältää kaikki luokan metodit
		                           - modifiointiin, .csv lukemiseen , poistoon, tulostamiseen
					
			modify_tester.java,    testaa tietojen modifiointia - lukee konsolilta uuden rek-numeron ja vuosimallin
			
			tester.java ,      testaa auto_database.java -luokan perustoimitoja : lisäyksiä ja poistoja ym.
	
	
	 auto_data.csv = luettava data .csv tiedostona(Exportattu Excel:stä) joka alustaa
	                 tietokannan tiedot muistiin.
					 
					 
	 testit käynnistyvät  komennoilla:

             - java modify_tester
             - java tester
             - java query_tester		

        			 