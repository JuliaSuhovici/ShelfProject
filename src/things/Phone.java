package things;

public class Phone extends Thing{
	private String name;
	
	public Phone(String name){
		setName(name);
	}
	public void setName(String name) {
		if(name.trim().length()!=0) {
			this.name = name;
		}
		else {
			System.err.println("Wrong name of the object!");
		}
	}
    public String getName() {
    	return name;
    }
}
