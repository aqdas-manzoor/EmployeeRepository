package model;

public class School {
    private String schoolName;
    private Student student;

    public School(String schoolName, Student student){
        this.schoolName= schoolName;
        this.student=student;

    }
    public Student getStudent(){
        return student;
    }
    public String getSchoolName(){
        return schoolName;
    }
    public static void main(String[] args){
        Student student1 = new Student("Aqdas");
        System.out.println(student1.getName());
        School school= new School("Hera school",student1 );
        System.out.println(school.getSchoolName());
        System.out.println(school.getStudent().getName());
    }

}
