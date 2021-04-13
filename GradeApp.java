import java.util.Scanner;

public class GradeApp {
	static String subjectNames[] = { "Tamil", "English", "Maths", "Science", "Social" };
	static int totalSubjects = subjectNames.length;
	static int total = 0;
	static float percentage;

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		getMarks();
		percentage = calculatePercentage();
//		display();
		
//		int a = 100;
//		int sq = square(a);
//		System.out.println(sq);
//
//		sc.close();
	}

//	private static int square(int a) {
//		// TODO Auto-generated method stub
//		return a*a;
//	}

	/**
	 * calculates percentage
	 * @return
	 */
	public static float calculatePercentage() {
		return percentage = (float) total / totalSubjects;
	}

	/**
	 * This method get all subject marks
	 */
	public static void getMarks() {
		for (int i = 0; i < totalSubjects; i++) {
			System.out.print("Enter " + subjectNames[i] + " Mark : ");
			int mark = sc.nextInt();
			calculateTotal(mark);
		}
	}

	/**
	 * This method performs calculate the total marks
	 * @param mark
	 */
	public static void calculateTotal(int mark) {
		total = total + mark;
	}

	/**
	 * This method displays the total and percentage
	 */
	public static void display() {
		System.out.println("Total  : " + total);
		System.out.println("Percentage  : " + percentage + "%");
	}

}
