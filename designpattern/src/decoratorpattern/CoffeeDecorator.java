package decoratorpattern;

//Component Interface
interface Coffee {
 double cost();
 String description();
}

//Concrete Component
class SimpleCoffee implements Coffee {
 @Override
 public double cost() {
     return 2.0;
 }

 @Override
 public String description() {
     return "Simple Coffee";
 }
}

//Decorator Interface
abstract class CoffeeDecorators implements Coffee {
 protected Coffee decoratedCoffee;

 public CoffeeDecorators(Coffee coffee) {
     this.decoratedCoffee = coffee;
 }

 @Override
 public double cost() {
     return decoratedCoffee.cost();
 }

 @Override
 public String description() {
     return decoratedCoffee.description();
 }
}

//Concrete Decorator 1
class MilkDecorator extends CoffeeDecorators {
 public MilkDecorator(Coffee coffee) {
     super(coffee);
 }

 @Override
 public double cost() {
     return super.cost() + 0.5;
 }

 @Override
 public String description() {
     return super.description() + ", with Milk";
 }
}

//Concrete Decorator 2
class SugarDecorator extends CoffeeDecorators {
 public SugarDecorator(Coffee coffee) {
     super(coffee);
 }

 @Override
 public double cost() {
     return super.cost() + 0.2;
 }

 @Override
 public String description() {
     return super.description() + ", with Sugar";
 }
}


public class CoffeeDecorator{
 public static void main(String[] args) {
     Coffee simpleCoffee = new SimpleCoffee();
     System.out.println("Cost: " + simpleCoffee.cost() + ", Description: " + simpleCoffee.description());

     Coffee milkCoffee = new MilkDecorator(simpleCoffee);
     System.out.println("Cost: " + milkCoffee.cost() + ", Description: " + milkCoffee.description());

     Coffee sweetMilkCoffee = new SugarDecorator(milkCoffee);
     System.out.println("Cost: " + sweetMilkCoffee.cost() + ", Description: " + sweetMilkCoffee.description());
 }
}
