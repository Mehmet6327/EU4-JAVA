package Group16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class States {

	public static void main(String[] args) {
				

		
		    ArrayList<String> stateList = new ArrayList<>(Arrays.asList(
		            "Alaska", "Alabama", "Arkansas", "Arizona", "California",
		            "Colorado", "Connecticut", "Delaware", "Florida", "Georgia", "Hawaii", "Iowa", "Idaho", "Illinois", "Indiana", "Kansas", "Kentucky", "Louisiana", "Massachusetts", "Maryland", "Maine", "Michigan", "Minnesota", "Missouri", "Mississippi", "Montana", "NorthCarolina", "NorthDakota", "Nebraska", "NewHampshire", "NewJersey", "NewMexico", "Nevada", "NewYork", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "RhodeIsland", "SouthCarolina", "SouthDakota", "Tennessee", "Texas", "Utah",
		            "Virginia",
		            "Vermont",
		            "Washington",
		            "Wisconsin",
		            "WestVirginia",
		            "Wyoming"));
		    //add five different cities from europe
		    stateList.add("Istanbul");
		    stateList.add("Ankara");
		    stateList.add("Berlin");
		    stateList.add("Madrid");
		    stateList.add("Paris");
		    //add amsterdam after Alaska
		    stateList.add(5,"Amsterdam");
		    //how many elements I have in my statelist
		    System.out.println("List size is : " + stateList.size());
		    
		    
		    //do we have Miami inside of our stateLists
		    System.out.println("Is miami inside out stateList: " + stateList.contains("Miami"));
		    System.out.println(stateList.toString());

//Please find the location or index of denver in the list?
		    System.out.println("Give me the index of Denver : " + stateList.indexOf("Amsterdam"));
		    System.out.println(stateList.toString());


//		remove all euroean 

			   stateList.remove("Ankara" );
			   stateList.remove("Istanbul" );

			   stateList.remove("Adana" );

			   stateList.remove("Sanliurfa" );

		
	    stateList.set(5, "Viyana");
	    
	    stateList.remove("Viyana");
	    
	    String[] countries = new String[5];
	    countries [0] = "Brasil";
	    countries [1] = "Greece";
	    countries [2] = "Italy";
	    countries [3] = "France";
	    countries [4] = "Germany";

	    System.out.println(countries.length);
	    Arrays.sort(countries);
	    
	    System.out.println(Arrays.toString(countries));
	    System.out.println(stateList);
	    
	    Collections.sort(stateList);
	    System.out.println(stateList);
	    
	    
	    
	    
	    
	
	}
	
}
