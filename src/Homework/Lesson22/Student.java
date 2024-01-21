package Homework.Lesson22;

public class Student {

    private StringBuilder name;
    private int course, grade;

    //конструктор

//    Student(StringBuilder name, int course, int grade){
//        this.name = new StringBuilder(name);
//        this.course=course;
//        this.grade=grade;
//    }
    // гетеры
    public StringBuilder getName(){
        return new StringBuilder(name);
    }
    public int getCourse(){
        return course;
    }
    public int getGrade(){
        return grade;
    }

    //сетеры

    public void setName(StringBuilder name){
        if (name.length()>3) {
            this.name = new StringBuilder(name);
        }else {
            System.out.println("Длина имени должна быть более трех символов");
        }
    }
    public void setCourse(int course){
        if(course >= 1 & course <= 4 ) {
            this.course = course;
        }
    }
    public void setGrade(int grade){
        if(grade >= 1 & grade <= 10) {
            this.grade = grade;
        }
    }

    public static void main(String[] args) {
        Student st = new Student();
        st.setCourse(4);
        st.setGrade(1);
        st.setName(new StringBuilder("Vova"));

        System.out.println(st.getCourse());
        System.out.println(st.getGrade());
        System.out.println(st.getName());

    }
}


