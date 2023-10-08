package singleton_pattern;

public class Main {

	public static void main(String[] args) {
	
		/*
		 * 
		 * 
		 * SampleSingleton objSampleSingleton=SampleSingleton.setterString("Eswaran S");
		 * 
		 * error because we assign string to class type data
	      */
		
		/* 
		 * 
		 * we can use the value of that one object by a getter method here and make use of it
		 * 
		 * */
		SampleSingleton.setterString("Eswaran S");
		String nameString1=SampleSingleton.getter();
		System.out.println(nameString1);
		
		
	}

}
