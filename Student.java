import java.util.Scanner;

class Stud_details {
    int marks[] = new int[8];
    int credits[] = new int[8];
    int grade[] = new int[8]; // Initialize the grade array to store grades for each subject
    String usn, name;
    float sgpa;
    Scanner sc = new Scanner(System.in);

    // Method to get the details of the student
    void getdetails() {
        System.out.print("Enter USN: ");
        usn = sc.next();
        System.out.print("Enter Name: ");
        name = sc.next();
        System.out.println("Enter Marks for 8 subjects: ");
        for (int i = 0; i < 8; i++) {
            marks[i] = sc.nextInt();
        }
        System.out.println("Enter Credits for 8 subjects: ");
        for (int i = 0; i < 8; i++) {
            credits[i] = sc.nextInt();
        }
    }

    // Method to display the details of the student
    void display() {
        System.out.println("Name: " + name);
        System.out.println("USN: " + usn);
        for (int i = 0; i < 8; i++) {
            System.out.println("Marks of subject " + (i + 1) + ": " + marks[i]);
        }
        for (int i = 0; i < 8; i++) {
            System.out.println("Credit of subject " + (i + 1) + ": " + credits[i]);
        }
    }

    // Method to calculate the grades for each subject based on marks
    void grades() {
        for (int i = 0; i < 8; i++) {
            if (marks[i] <= 100 && marks[i] >= 90) {
                grade[i] = 10;
            } else if (marks[i] < 90 && marks[i] >= 80) {
                grade[i] = 9;
            } else if (marks[i] < 80 && marks[i] >= 70) {
                grade[i] = 8;
            } else if (marks[i] < 70 && marks[i] >= 60) {
                grade[i] = 7;
            } else if (marks[i] < 60 && marks[i] >= 50) {
                grade[i] = 6;
            } else if (marks[i] < 50 && marks[i] >= 40) {
                grade[i] = 5;
            } else if (marks[i] < 40) {
                grade[i] = 0;
            }
        }
    }

    // Method to calculate the SGPA
    void sgpacal() {
        int totalCredits = 0;
        int weightedGradeSum = 0;
        for (int i = 0; i < 8; i++) {
            weightedGradeSum += grade[i] * credits[i];
            totalCredits += credits[i];
        }
        sgpa = (float) weightedGradeSum / totalCredits; // Calculate SGPA
        System.out.printf("The SGPA of %s is: %.2f%n", name, sgpa); // Print SGPA with 2 decimal places
    }
}

class Student {
    public static void main(String args[]) {
        Stud_details s1[] = new Stud_details[8];
        for (int j = 0; j < 8; j++) {
            s1[j] = new Stud_details(); // Create a new Stud_details object for each student
        }
        for (int j = 0; j < 8; j++) {
            System.out.println("Enter the student information for student " + (j + 1));
            s1[j].getdetails();
            System.out.println("Student information is:");
            s1[j].display();
            s1[j].grades();
            s1[j].sgpacal();
        }
    }
}

