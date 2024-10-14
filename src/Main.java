import java.util.Scanner;
import static java.lang.System.in;

public class Student {
    int rating;
    private String name;

    /*private class Student;// TODO implement Student class according to the instructions provided in the README.md file
        private static name;
            Scanner scannername = new Scanner(in);
            String name = scannername.nextLine();
            scannername.close();

        private static rating;
            Scanner scannerrating = new Scanner(in);
            int rating = scannerrating.nextInt();
            scannerrating.close();*/

    public Student(String name) {
        /*Scanner scannername = new Scanner(in);
        String name = scannername.nextLine();
        scannername.close();//TODO initialize name*/
    }

    public static double getAvgRating() {
        // TODO return average rating of all students
        return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        /*Scanner scannername = new Scanner(in);
        String name = scannername.nextLine();
        scannername.close();// TODO set student's name*/
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        // TODO initialize rating;
    }

    public boolean betterStudent(Student student) {
        /*double rating = (student1 < student2 ? student2 : student1)// TODO return the result of comparing this.student's rating with the student's rating*/
        return false;
    }

    public void changeRating(int rating) {
        /*Scanner scannerrating = new Scanner(in);
        int rating = scannerrating.nextInt();
        scannerrating.close();// TODO change this student's rating and average rating of all students*/
    }

    public static void removeStudent(Student student) {
        // TODO remove student
    }

    @Override
    public String toString() {
        /*String student = toString();// TODO return String with name and rating of this student*/
        return "";
    }
}