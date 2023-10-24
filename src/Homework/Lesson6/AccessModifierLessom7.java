package Homework.Lesson6;

import Homework.Lesson7.Employee;

public class AccessModifierLessom7 {
    public static void main(String[] args) {
        Employee am7 = new Employee(1,"Vova1",32.23);
        System.out.println(am7.name+" "+am7.id()+" "+am7.salary());

    }
}
