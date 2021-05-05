package homeworkDay3;

public class Main {

	public static void main(String[] args) {
		
		Instructer user1 = new Instructer();
		user1.setId(1);
		user1.setPassword("12345");
		user1.setEmail("ogretmen@gmail.com");
		user1.setCourseToTeach("Java + React");
		
		Student user2 = new Student();
		user2.setId(2);
		user2.setPassword("12345");
		user2.setEmail("ogrenci@gmail.com");
		user2.setCourseToLearn("Python");
		
		InstructorManager instructor = new InstructorManager();
		instructor.add(user1);

		
		StudentManager student = new StudentManager();
		student.add(user2);
		
		
	}
	
	

}
