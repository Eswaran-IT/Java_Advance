package creationallevelpatterns;


	// Product class
	class Person {
	    private String firstName;
	    private String lastName;
	    private int age;
	    private String address;

	    // Private constructor to avoid obj creation
	    private Person() {}

	    public void displayInfo() {
	        System.out.println("Name: " + firstName + " " + lastName);
	        System.out.println("Age: " + age);
	        System.out.println("Address: " + address);
	    }

	    // Builder class
	    static class Builderpattern {
	        private Person person = new Person();

	        public Builderpattern firstName(String firstName) {
	            person.firstName = firstName;
	            return this;
	        }

	        public Builderpattern lastName(String lastName) {
	            person.lastName = lastName;
	            return this;
	        }

	        public Builderpattern age(int age) {
	            person.age = age;
	            return this;
	        }

	        public Builderpattern address(String address) {
	            person.address = address;
	            return this;
	        }

	        public Person build() {
	            return person;
	        }
	    }
	}

	// Client Code
	public class Builder {
	    public static void main(String[] args) {
	        // Using the builder to create a Person object
	        Person person = new Person.Builderpattern()
	                .firstName("John")
	                .lastName("Doe")
	                .age(30)
	                .address("123 Main St")
	                .build();
	        person.displayInfo();
	    }
	}

