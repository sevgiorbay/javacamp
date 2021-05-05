package homeworkDay3;

public class StudentManager extends UserManager {
	@Override
public void add(User user) {
		
		System.out.println(user.getEmail()+user.getPassword()+" öðrenci eklendi");
		
	}
	
	
}
