
public class InstructorManager extends UserManager{
	public void createClass(Instructor instructor) {
		System.out.println(instructor.firstName +" tarafindan ders yaratildi.");
	}
	
	 @Override
	public void add(User user) {
			System.out.println(user.eMail +" egitmen olarak eklendi.");

	}
}
