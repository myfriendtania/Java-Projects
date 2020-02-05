
public class RemainingStudentCount {

	public static void main(String[] args) {
		
		String student = "Tania Torres";
		int enrolledStudents = 66;
		int classMax = 20;
		int remainingStudents = enrolledStudents % classMax;
		int fullClassRooms = (enrolledStudents - remainingStudents) / classMax;
		
		System.out.print("Student Name: ");
		System.out.println(student);
		System.out.print("Enrolled students: ");
		System.out.println(enrolledStudents);
		System.out.print("Classes that are full: ");
		System.out.println(fullClassRooms);
		System.out.print("Remaining Students: ");
		System.out.println(remainingStudents);		

	}
}
