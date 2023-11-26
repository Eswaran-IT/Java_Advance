package creationallevelpatterns;

class Singletonpattern {
	   //Private Variable
	    private static Singletonpattern instance;

	    // Private constructor 
	    private Singletonpattern() {}
	    
	    //getter
	    public static Singletonpattern getInstance() {
	        if (instance == null) {
	            instance = new Singletonpattern();
	        }
	        return instance;
	    }

	}

	// Client Code
	public class Singleton {
	    public static void main(String[] args) {
	        // Trying to create multiple instances, but getting the same instance
	        Singletonpattern instance1 = Singletonpattern.getInstance();
	        Singletonpattern instance2 = Singletonpattern.getInstance();

	        // Checking if both instances are the same
	        System.out.println(instance1 == instance2);  // It should print: true
	    }
	}
