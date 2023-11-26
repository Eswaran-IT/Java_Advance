package creationallevelpatterns;

	// Product interface
	interface Product {
	    void produce();
	}

	// Concrete Products
	class Chocolate implements Product {
	    @Override
	    public void produce() {
	        System.out.println("Britannia Chocolate");
	    }
	}

	class Biscuit implements Product {
	    @Override
	    public void produce() {
	        System.out.println("Britannia Biscuit");
	    }
	}

	// Product Factory interface
	interface ProductFactory {
	    Product createProduct();
	}

	// Concrete Product Factories
	class ChocolateFactory implements ProductFactory {
	    @Override
	    public Product createProduct() {
	        return new Chocolate();
	    }
	}

	class BiscuitFactory implements ProductFactory {
	    @Override
	    public Product createProduct() {
	        return new Biscuit();
	    }
	}

	// Client Code or think application
	public class Factory {
	    public static void main(String[] args) {
	        ProductFactory chocolateFactory = new ChocolateFactory();
	        Product chocolate = chocolateFactory.createProduct();
	        chocolate.produce();

	        ProductFactory biscuitFactory = new BiscuitFactory();
	        Product biscuit = biscuitFactory.createProduct();
	        biscuit.produce();
	    }
	

}
