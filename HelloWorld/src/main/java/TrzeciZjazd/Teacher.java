package TrzeciZjazd;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {
    private int numCourses = 0;
    private List<String> courses1 = new ArrayList<>();

    public Teacher(String name, String address) {
        super(name, address);

    }

    @Override
    public String toString() {
        return "Teacher: " + super.toString();
    }

    public boolean addCourse(String course) {
        if (numCourses > 3) {
            return false;
        } else{
            courses1.add(course);
            numCourses++;
            return true;
        }

    }
    public boolean removeCourse(String course){
        if(numCourses > 0){
            courses1.remove(course);
            numCourses--;
            return true;
        }
        else
            return false;
    }

    public int getNumCourses() {
        return numCourses;
    }

    public void setNumCourses(int numCourses) {
        this.numCourses = numCourses;
    }

    public List<String> getCourses1() {
        return courses1;
    }

    public void setCourses1(List<String> courses1) {
        this.courses1 = courses1;
    }
}
