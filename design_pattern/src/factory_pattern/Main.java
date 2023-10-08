package factory_pattern;

// Step 1: Define a Pizza interface (Product)
interface Pizza {
    void prepare();
    void bake();
    void cut();
    void box();
}

// Step 2: Create concrete pizza classes (Concrete Products)
class MargheritaPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing Margherita Pizza...");
    }

    @Override
    public void bake() {
        System.out.println("Baking Margherita Pizza...");
    }

    @Override
    public void cut() {
        System.out.println("Cutting Margherita Pizza...");
    }

    @Override
    public void box() {
        System.out.println("Boxing Margherita Pizza...");
    }
}

class PepperoniPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing Pepperoni Pizza...");
    }

    @Override
    public void bake() {
        System.out.println("Baking Pepperoni Pizza...");
    }

    @Override
    public void cut() {
        System.out.println("Cutting Pepperoni Pizza...");
    }

    @Override
    public void box() {
        System.out.println("Boxing Pepperoni Pizza...");
    }
}

// Step 3: Create a Pizza Factory interface
interface PizzaFactory {
    Pizza createPizza();
}

// Step 4: Implement concrete pizza factory classes (Concrete Factories)
class MargheritaPizzaFactory implements PizzaFactory {
    @Override
    public Pizza createPizza() {
        return new MargheritaPizza();
    }
}

class PepperoniPizzaFactory implements PizzaFactory {
    @Override
    public Pizza createPizza() {
        return new PepperoniPizza();
    }
}

// Client Code
public class Main {
    public static void main(String[] args) {
        // You want to order a Margherita pizza
    	//make object type of margherita like same to all
        PizzaFactory margheritaFactory = new MargheritaPizzaFactory();
        //also make a single method and that call to those respected classes to create a instance
        Pizza margheritaPizza = margheritaFactory.createPizza();
        margheritaPizza.prepare();
        margheritaPizza.bake();
        margheritaPizza.cut();
        margheritaPizza.box();

        // You want to order a Pepperoni pizza
        PizzaFactory pepperoniFactory = new PepperoniPizzaFactory();
        Pizza pepperoniPizza = pepperoniFactory.createPizza();
        pepperoniPizza.prepare();
        pepperoniPizza.bake();
        pepperoniPizza.cut();
        pepperoniPizza.box();
    }
}
