package project2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Class to create a course
 *
 * @author maria
 */
public class Course implements Serializable {

    //Data members
    private String name;
    private int maxStuAmount = 4;
    private Teacher teacher;
    private List<Student> regsStudents;
    private List<Double> finalScores;

    /**
     * Default constructor
     */
    public Course() {
        this.name = "";
        this.teacher = new Teacher();
        this.regsStudents = new ArrayList<>();
        this.finalScores = new ArrayList<>();
    }

    /**
     * Constructor with name and teacher as parameters
     *
     * @param name the name of the course
     * @param teacher the teacher
     */
    public Course(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
        this.regsStudents = new ArrayList<>();
        this.finalScores = new ArrayList<>();
    }

    /**
     * Constructor with name, max student amount and teacher as parameters
     *
     * @param name the name of the course
     * @param maxStuAmount the maximum student amount
     * @param teacher the teacher
     */
    public Course(String name, int maxStuAmount, Teacher teacher) {
        this.name = name;
        this.maxStuAmount = maxStuAmount;
        this.teacher = teacher;
        this.regsStudents = new ArrayList<>();
        this.finalScores = new ArrayList<>();
    }

    /**
     * Getter method to get the name of the course
     *
     * @return the name of the course
     */
    public String getName() {
        return name;
    }

    /**
     * Getter method to get the maximum student amount
     *
     * @return the maximum student amount
     */
    public int getMaxStuAmount() {
        return maxStuAmount;
    }

    /**
     * Method to get the teacher
     *
     * @return the teacher
     */
    public Teacher getTeacher() {
        return teacher;
    }

    /**
     * Method to get the list of register Student
     *
     * @return the list of register students
     */
    public List<Student> getRegsStudents() {
        return regsStudents;
    }

    /**
     * Method to get the list of final scores
     *
     * @return the list of final scores
     */
    public List<Double> getFinalScores() {
        return finalScores;
    }

}//End of class
