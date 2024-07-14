package assessment;

public class OnlyOnce {

	    // Private static instance variable
	    private static OnlyOnce instance;

	    // Public static method to get the singleton instance
	    public static OnlyOnce getInstance() {
	        if (instance == null) {
	            instance = new OnlyOnce();
	        }
	        return instance;
	    }

	    // Example method of the class
	    public void showMessage() {
	        System.out.println("Single Instance Class");
	    }

	    public static void main(String[] args) {
	        // Getting the singleton instance
	        OnlyOnce singleton = OnlyOnce.getInstance();

	        // Calling a method on the singleton instance
	        singleton.showMessage();
	    }
	}


