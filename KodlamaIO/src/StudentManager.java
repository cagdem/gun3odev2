
public class StudentManager extends UserManager {
	public void applyClass(Student student) {
		System.out.println(student.firstName + " derse katildi. ");
	}
	
	@Override
	public void add(User user) {
		System.out.println(user.eMail +" ogrenci olarak eklendi.");
	}
}
