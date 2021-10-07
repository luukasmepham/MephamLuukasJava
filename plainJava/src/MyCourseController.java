import java.util.Scanner;

public class MyCourseController { 
	public static void main(String [] args)
	{
        Student studentData = new Student();
        Course courseData = new Course();

        Scanner inputStudent = new Scanner(System.in);
        System.out.println("Enter name");
    
        String studentInput = inputStudent.nextLine();
        inputStudent.close();

		studentData.StudentWrite(studentInput);
        studentData.StudentRead();


        Scanner inputCourse = new Scanner(System.in);
        System.out.println("Enter name");

        String courseInput = inputCourse.nextLine();
        inputCourse.close();

        courseData.CourseWrite(courseInput);
        courseData.CourseRead();

	}
}