package builder_pattern;

public class StudentBuilder {
	private String name;
	   private String dept;
	   private int age;
	   private String course;
	public StudentBuilder setName(String name) {
	   this.name = name;
		return this;
		
	}
	public StudentBuilder setDept(String dept) {
		this.dept = dept;
		return this;
	}
	public StudentBuilder setAge(int age) {
	this.age = age;
	return this;
	}
	public StudentBuilder setCourse(String course) {
	   this.course = course;
		return this;
	}
	public Student Values(){
		return new Student(name, dept, course, age);
		
	}
}
