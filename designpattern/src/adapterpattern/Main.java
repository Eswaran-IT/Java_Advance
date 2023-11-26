package adapterpattern;
/*
 * 
 * Pattern used to act as intermediate translator 
 * Between old and new features
 * example->
 * 
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Adapter pattern example for 4G to 5G transition");

        // Using the Adapter Pattern to make 4G compatible with the new 5G system
        CommunicationAdapter adapter = new CommunicationAdapter(new FourGCommunication());

        // Client code interacts with the new 5G system
        User user = new User();
        user.connect(adapter);
    }
}

// Existing 4G Communication System
class FourGCommunication {
    void connect4G() {
        System.out.println("Connected using 4G");
    }
}

// New 5G Communication System
interface FiveGCommunication {
    void connect5G();
}

// Adapter to make 4G compatible with the new 5G system
class CommunicationAdapter implements FiveGCommunication {
    private FourGCommunication fourG;

    CommunicationAdapter(FourGCommunication fourG) {
        this.fourG = fourG;
    }

    @Override
    public void connect5G() {
        fourG.connect4G();
        System.out.println("Adapted to 5G");
    }
}
class User {
    void connect(FiveGCommunication communicationSystem) {
        communicationSystem.connect5G();
    }
}
