package singleton_pattern;

public class SampleSingleton {
	/*
	 * 
	 * Lazy->normal we used here below
	 * Eager->make a instance while initializing the variable of class and make obj to create while executed 
	 *and constructor are just to avoid creating obj and not to initiate creation 
	 *Synchronized->use synchronized in method name before
	 *Double synchronized-> we use like 
	 * synchronized (DoubleCheckedLockingSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckedLockingSingleton();
                }
	 *
	 */
	//make private to not accessed every part of code
	private static String nameSampleSingleton;
	
	//static variable so we class name to initialize and access in another part of code by class name
	//constructor to avoid creating object from outside
	private SampleSingleton(String data) {		
			nameSampleSingleton=data;
		}
	//
	public static String setterString  (String data) {
		if (nameSampleSingleton==null) {
			nameSampleSingleton=data;
		}
		return nameSampleSingleton;
	}
	public static String getter() {
		return nameSampleSingleton;
	}
	
}
