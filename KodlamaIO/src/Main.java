
public class Main {

	public static void main(String[] args) {

		Student student = new Student();
		Instructor instructor = new Instructor();
		
		InstructorManager instructorManager = new InstructorManager();
		StudentManager studentManager = new StudentManager();
		
		student.eMail = "cagdem@cagdem.com";
		student.firstName = "Caglar";

		instructor.eMail = "engin@cagdem.com";
		instructor.firstName = "Engin";
		
		studentManager.add(student);
		instructorManager.add(instructor);
		
		instructorManager.createClass(instructor);
		studentManager.applyClass(student);

	}

}
