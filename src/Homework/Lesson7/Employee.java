package Homework.Lesson7;

public class Employee {
    protected int id;
    public String name;
    int age;
    private double salary;



    public int id(){
        return id;
    }
    public String name(){
        return name;
    }
    public double salary(){
        return salary;
    }
    public Employee(int  id1, String name1, double salary1){
        id=id1;
        name=name1;
        salary=salary1;
    }
//    Employee(int  id2, String name2, double salary2){
//        id=id2;
//        name=name2;
//        salary=salary2;
//    }
//
//    private Employee(int  id3, String name3, double salary3){
//        id=id3;
//        name=name3;
//        salary=salary3;
//    }


}

class EmployeeTest{
       public static void main(String[] args) {
        Employee vladimir = new Employee(3,"Vova3",33.33);


        System.out.println(vladimir.name +" "+vladimir.id+" "+vladimir.salary());

    }
}