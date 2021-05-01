package homework_lesson_2;

public class Main {

	public static void main(String[] args) {
		Courses course1 = new Courses(1, "C # + Angular", "Engin Demirog");
		Courses course2 = new Courses(2, "Java + React", "Engin Demirog");
		
		Courses[] coursesall = {course1, course2};
		
		for (Courses course : coursesall) {
			System.out.println(course.courseId);
			System.out.println(course.courseName);
			System.out.println(course.courseEducator);
		}
		
		ButonInCourse Buton = new ButonInCourse();
		Buton.finishAndGoOn();
		Buton.previousPage();
		
		

	}

}
