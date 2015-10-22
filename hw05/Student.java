public class Student {
    public String firstName, lastName;
    public int osis;
    public int age;
    public double gpa;

    public Student(String first, String last, int ID, int years) {
	firstName = first;
	lastName = last;
	osis = ID;
	age = years;
	gpa = 100.0;
    }

    public static void printStudent(String first, String last) {
	System.out.println(first + " " + last);
    }

    public static void lowerGPA(double gpa) {
	gpa = 0;
	System.out.println("Your GPA is now " + gpa);
    }

    public static void raiseGPA(double gpa) {
	gpa = 100;
	System.out.println("Your GPA is now " + gpa);
    }
}
