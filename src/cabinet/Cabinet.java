package cabinet;
import things.*;

public class Cabinet {
	private Thing topShelf;
    private Thing middleShelf;
    private Thing bottomShelf;
    
    public Cabinet() {
    	
    }
    
    public Thing whatIsOn( String shelfName ) {
    	Thing object = null;
    	switch(shelfName) {
    	case "topShelf":
    		object = topShelf;
    		break;
    	case "middleShelf":
    		object = middleShelf;
    		break;
    	case "bottomShelf":
    		object = bottomShelf;
    		break;
    	default: System.out.println("There is no such shelf!!!");
    	}
    	return object;  	
    }
    
    public void put( String shelfName, Thing thing ) {
    	switch(shelfName) {
    	case "topShelf":
    		if(topShelf == null)
    			topShelf = thing;
    		else 
    			System.out.println("There is already something on the top shelf!");
    		break;
    		
    	case "middleShelf":
    		if(middleShelf == null) 
    			middleShelf = thing;
    		else 
    			System.out.println("There is already something on the middle shelf!");
    		break;
    		
    	case "bottomShelf":
    		if(bottomShelf == null) 
    			bottomShelf = thing;
    		else 
    			System.out.println("There is already something on the bottom shelf!");
    		break;
    		
    	default: System.out.println("There is no such shelf!!!");
    	} 	
    }
    
    public Thing take( String shelfName ) {
    	Thing object = null;
    	switch(shelfName) {
    	case "topShelf":
    		object = topShelf;
    		topShelf = null;
    		break;
    	case "middleShelf":
    		object = middleShelf;
    		middleShelf = null;
    		break;
    	case "bottomShelf":
    		object = bottomShelf;
    		bottomShelf = null;
    		break;
    	}
    	return object;
    }
}
