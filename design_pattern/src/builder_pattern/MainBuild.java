package builder_pattern;

public class MainBuild {
  public static void main(String[] args) {
	System.out.println("Builder");
	Student eswaranStudent=new StudentBuilder().setAge(20).setCourse("Java").setDept("Info Tech").Values();
	 System.out.println(eswaranStudent);
  }
}
