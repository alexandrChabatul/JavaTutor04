package by.epam.chebatul.task3;

public class Tester {
	
	public static void main(String[] args) {

		String[] names = { "Петров А.А.", "Ярик В.М.", "Перепеча Р.Д.", "Кривой Г.В.", "Якушева О.А." };
		String[] groups = { "11-a", "15-x", "j-28", "k-8", "16-h" };
		int[][] rating = { { 3, 4, 7, 8, 9 }, { 9, 10, 7, 8, 9 }, { 3, 9, 7, 8, 9 }, { 6, 9, 7, 8, 9 },
				{ 9, 9, 7, 8, 9 } };

		Student[] studenstList = new Student[names.length];

		for (int i = 0; i < studenstList.length; i++) {
			Student stud = new Student(names[i], groups[i], rating[i]);
			studenstList[i] = stud;
		}

		System.out.println("All students:");
		
		for (Student a : studenstList) {
			System.out.println(a.toString());
		}
		
		System.out.println();
	    System.out.println("Find by minimal rating:");

		StudentLogic helper = new StudentLogic();

		helper.findStudentsByMinimalRating(studenstList, 7);

	}

}
