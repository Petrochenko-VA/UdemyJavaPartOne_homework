package Homework.Lesson7;

public class AccessModifier {
    public static void main(String[] args) {
        Employee am = new Employee(2,"name2",22.22);

        System.out.println(am.name+" "+am.id+" "+am.salary());
    }

}
