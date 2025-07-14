import java.util.*;

class Student_Grade {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\t---- STUDENT GRADE CALCULATOR ----");
        System.out.print("\tEnter the number of subjects: ");
        int numberOfSubjects = sc.nextInt();

        int totalMarks = 0;
        int marks;
        int choice;

        System.out.println();

        do {
            System.out.println("Enter your choice: ");
            System.out.println("\t1 -> To enter marks of the student");
            System.out.println("\t2 -> To see the result");
            System.out.println("\t3 -> To Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // entering marks of each subject
                    System.out.println("\tEnter the marks of the student: ");
                    System.out.println();

                    totalMarks = 0;  // Reset total for new entry
                    for (int i = 1; i <= numberOfSubjects; i++) {
                        System.out.print("\tMarks of subject " + i + " (out of 100): ");
                        marks = sc.nextInt();

                        if (marks < 0 || marks > 100) {
                            System.out.println("\t---- Enter valid marks! ----");
                            i--; // redo this subject
                        } else {
                            totalMarks += marks;
                        }
                    }
                    break;

                case 2:
                    if (totalMarks == 0) {
                        System.out.println("Please enter marks first!!");
                        break;
                    }

                    System.out.println("\t---- SHOWING RESULT ----");

                    // total marks
                    System.out.println("TOTAL MARKS IS " + (100 * numberOfSubjects));
                    System.out.println("THE STUDENT GOT " + totalMarks + " MARKS OUT OF " + (100 * numberOfSubjects));

                    // average
                    int avg = totalMarks / numberOfSubjects;
                    System.out.println("THE AVERAGE IS " + avg);

                    // grade calculation
                    if (avg > 90) {
                        System.out.println("GRADE: O");
                    } else if (avg > 81) {
                        System.out.println("GRADE: E");
                    } else if (avg > 71) {
                        System.out.println("GRADE: A");
                    } else if (avg > 61) {
                        System.out.println("GRADE: B");
                    } else if (avg > 51) {
                        System.out.println("GRADE: C");
                    } else if (avg > 41) {
                        System.out.println("GRADE: D");
                    } else {
                        System.out.println("GRADE: FAIL");
                    }
                    break;

                case 3:
                    System.out.println("\t---- EXITING ----");
                    break;

                default:
                    System.out.println("Wrong choice");
            }
        } while (choice != 3);

        sc.close();
    }
}
