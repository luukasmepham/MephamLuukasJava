import java.util.Scanner;

public class MyCourseController { 
	public static void main(String [] args)
	{
		Student studentData = new Student();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter student name");

        String studentName = input.nextLine();
        input.close();

		studentData.StudentWrite(studentName);
        studentData.StudentRead();
	}
}