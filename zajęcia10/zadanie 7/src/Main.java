import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Adam", "Kowalski", "s12345");
        Student student2 = new Student("Jan", "Nowak", "s23456");
        Student student3 = new Student("Kamil", "Góral", "s34567");
        Student student4 = new Student("Mateusz", "Rokicki", "s45678");
        Student student5 = new Student("Kacper", "Adamski", "s56789");


        Student[] students = {student1,student2,student3,student4,student5};
        Arrays.sort(students);
        for(Student student : students){
            System.out.println(student.Nazwisko + ": " + student.NumerIndeksu);
        }

    }
}