package prototype_pattern;

class A implements Cloneable{
	private String nameString;
	private int age;
	
	public A(String name,int age){
	this.age=age;
	this.nameString=name;
	}
	public void setter(String nameString,int age) {
		this.age=age;
		this.nameString=nameString;

	}

    public A clone() {
        try {
            return (A) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }


	@Override
	public String toString() {
		return "A [nameString=" + nameString + ", age=" + age + "]";
	}
}

public class PrototypePattern {
   public static void main(String[] args) {
	System.out.println("Prototype Design Pattern");
	A objA1=new A("Eswaran",20);
	A objA2=objA1.clone();
	System.out.println(objA1);
	System.out.println(objA2);
	//changevalue of orignal
	objA1.setter("Eswaran S", 21);
	System.out.println(objA1);
	System.out.println(objA2);
	
	//
	objA2.setter("Java",10);
	System.out.println(objA1);
	System.out.println(objA2);
	
	
	
	}
}
