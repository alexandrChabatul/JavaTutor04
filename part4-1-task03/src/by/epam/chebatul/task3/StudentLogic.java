package by.epam.chebatul.task3;

public class StudentLogic {
	
	public void findStudentsByMinimalRating(Student[] listOfStudents, int minRating) {
		boolean result = false;
		for (Student stud : listOfStudents) {
			if (testToMinRating(stud, minRating)) {
				System.out.println(stud.toString());
				result = true;
			}
		}
		if (!result) {
			System.out.println("Not found.");
		}

	}
	
	public static boolean testToMinRating(Student stud, int minRating) {
		int[] rating = stud.getRating();
		for (int i : rating) {
			if (i < minRating) {
				return false;
			}
		}
		return true;
	}

}
