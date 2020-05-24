package cabinet;
import things.*;

public class Cabinet {
	private Thing[] shelfes = new Thing[3]; 
    
    public Cabinet() {
    	
    }
    
    private int findShelfByName(String shelfName) {
    	int index = -1;
    	switch(shelfName) {
    	case "topShelf":
    		index = 0;
    	case "middleShelf":
    		index = 1;
    	case "bottomShelf":
    		index = 2;
    	default: System.err.println("There is no such shelf!");
    	}		
    	return index;
    }
    
    public Thing whatIsOn( String shelfName ){
    	Thing object = null;
    	int i = findShelfByName(shelfName);
    	if(i != -1)
    		object = shelfes[i]; 
    	return object;  	
    }
    
    public void put( String shelfName, Thing thing ) {
    	int i = findShelfByName(shelfName);
    	if(i != -1)
    		shelfes[i] = thing; 	
    }
    
    public Thing take( String shelfName ) {
    	Thing object = whatIsOn(shelfName);
    	shelfes[findShelfByName(shelfName)] = null;
    	return object;
    }
}
