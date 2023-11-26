package iteratorpattern;
/*
 * Iterator and iteratortype
 * IterableCollection and collectiontype
 * User request both to iterate in this code
 */
	interface Iterator<T> {
	    boolean hasNext();
	    T next();
	}
	interface IterableCollection<T> {
	    Iterator<T> createIterator();
	}
	class ArrayIterator<T> implements Iterator<T> {
	    private T[] array;
	    private int currentIndex = 0;

	    public ArrayIterator(T[] array) {
	        this.array = array;
	    }

	    @Override
	    public boolean hasNext() {
	        return currentIndex < array.length;
	    }

	    @Override
	    public T next() {
	        if (hasNext()) {
	            return array[currentIndex++];
	        }
	        return null; // Or throw an exception for better handling
	    }
	}
	class ArrayCollection<T> implements IterableCollection<T> {
	    private T[] collection;

	    public ArrayCollection(T[] collection) {
	        this.collection = collection;
	    }

	    @Override
	    public Iterator<T> createIterator() {
	        return new ArrayIterator<>(collection);
	    }
	}
//Main code
	public class Main {
	    public static void main(String[] args) {
	        Integer[] numbers = {1, 2, 3, 4, 5};
	        IterableCollection<Integer> iterableCollection = new ArrayCollection<>(numbers);
	        Iterator<Integer> iterator = iterableCollection.createIterator();

	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }
	    }
	

}
