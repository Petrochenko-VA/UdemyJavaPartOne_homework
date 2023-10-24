package Homework.Lesson4;

public class Employee {
    int id;
    String name;
    int age;
    double salary;
    String departament;

    Employee(int  id1, String name1, int age1, double salary1, String departament1){
        id=id1;
        name=name1;
        age=age1;
        salary=salary1;
        departament=departament1;
    }

    double tooXZp(){
        salary *= 2;
        return salary;
    }


}


class EmployeeTest{
    public static void main(String[] args) {
        Employee vladimir = new Employee(1, "Vladimir", 38, 147000, "SberTech");
        Employee elena = new Employee(2, "Elena", 37, 121000, "KMZ");
        vladimir.tooXZp();
        elena.tooXZp();



        System.out.println("Zarpleta " + vladimir.name +" uvelichilas` v dvoe i sostavlyaet: " + vladimir.salary);
        System.out.println("Zarpleta " + elena.name +" uvelichilas` v dvoe i sostavlyaet: " + elena.salary);

    }
}