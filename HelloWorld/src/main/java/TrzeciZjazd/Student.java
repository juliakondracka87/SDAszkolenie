package TrzeciZjazd;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {

    private List<String> courses =  new ArrayList<String>();
    private List<Integer> grades = new ArrayList<Integer>();

//    private int numCourses = 0;
//    private String courses;
//    private int grades;

//    public Student(){
//    }

    public Student(String name, String address) {
        super(name, address);

    }
    @Override
    public String toString() {
       return "Uczeń: " + super.toString();
    }



    public void addCourseGrade (String course, int grade) {
        if (!courses.contains(course)) {
            courses.add(course);
            grades.add(grade);
        }
    }
    public void printGrades() {

        System.out.println(grades);
    }

    public double getAvgGrade() {
    if(!grades.isEmpty()) {
        int gradesSum = 0;
        for(Integer grade : grades) {
            gradesSum += grade; //+=
        }
        return (double) gradesSum/grades.size();
    }
    else
        return 0;
}
}








