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
    public StringBuilder getName() {
        StringBuilder nameNew = new StringBuilder(name);
        return nameNew;
    }

    public int getCourse() {
        return course;
    }

    public int getGrade() {
        return grade;
    }

    //сетеры

    public void setName(StringBuilder name) {
        if (name.length() > 3) {
            this.name = name;
        } else {
            System.out.println("Длина имени должна быть более трех символов");
        }
    }

    public void setCourse(int course) {
        if (course >= 1 & course <= 4) {
            this.course = course;
        }
    }

    public void setGrade(int grade) {
        if (grade >= 1 & grade <= 10) {
            this.grade = grade;
        }
    }

    public void showInfo() {
        System.out.println("name: " + getName());
        System.out.println("course: " + getCourse());
        System.out.println("grade: " + getGrade());

    }

}
    class TestStudent{
    public static void main(String[] args) {
        Student st = new Student();
        StringBuilder sb = new StringBuilder("Vova");
        st.setCourse(4);
        st.setGrade(1);
        st.setName(sb);
       st.showInfo();

    }
}


