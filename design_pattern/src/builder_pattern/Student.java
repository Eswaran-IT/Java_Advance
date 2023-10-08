package builder_pattern;

public class Student {
   private String name;
   private String dept;
   private int age;
   private String course;
   
   public Student(String name,String dept,String course,int age)
{
	this.age=age;
	this.name=name;
	this.dept=dept;
	this.course=course;
}
/* 
 * 
 * In this code i used the builder pattern to set optional parameters
 * to string method will be called only by object that are used to print the value of that object
 * called by it name 
 *  */
@Override
public String toString() {
	return "Student [name=" + name + ", dept=" + dept + ", age=" + age + ", course=" + course + "]";
}
   
   
}
