package Homework.Lesson12;

public class Student {
    String name;
    int course;
    int score;

    Student(String name, int course, int score){
        this.name = name;
        this.course=course;
        this.score=score;
    }
}
class StudentTest {


    static void equals(Student s1, Student s2) {
        if (s1.course == s2.course) {
            System.out.println("Studenti na odnom curse");
        } else if (s1.course > s2.course) {
            System.out.println("Student " + s1.name + " v starshem curse chem " + s2.name);
        } else {
            System.out.println("Student " + s2.name + " v starshem curse chem " + s1.name);

        }
        if (s1.score == s2.score) {
            System.out.println("U studentov odinakoviy ball");

        } else if (s1.score > s2.score) {
            System.out.println("Student " + s1.name + " uchitsya luchshe chem " + s2.name);
        } else {
            System.out.println("Student " + s2.name + " uchitsya luchshe chem " + s1.name);

        }

    }
    static void equalsall(Student s1, Student s2){
        if(s1.course == s2.course && s1.score==s2.score && s1.name.equals(s2.name)){
            System.out.println("Studenty " +s1.name+" i "+s2.name+" ravni");
        }else {
            System.out.println("Studenty raznie");
        }
    }
    static void eQUALS(Student s1, Student s2){
        if(s1.name.equals(s2.name)){
            System.out.println("Studenty s odinakovim imenem");
        }
    }


    public static void main (String[]args){
        StudentTest st = new StudentTest();

        Student s11 = new Student("Vladimir", 5, 90);
        Student s22 = new Student("Petr", 3, 45);
        equals(s11, s22);

        Student s33 = new Student("Vladimir", 5, 90);
        Student s44 = new Student("Vladimir", 5, 90);
        equalsall(s33,s44);
        eQUALS(s33,s44);



    }
}
