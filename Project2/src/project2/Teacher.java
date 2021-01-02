package project2;

import java.util.ArrayList;
import java.util.List;

/**
 * Class to create teacher
 *
 * @author maria
 */
public class Teacher extends User {

    //Data members
    private List<Course> teachingCourses;
    private static int nextId = 1;

    /**
     * Default constructor
     */
    public Teacher() {
        this.name = "";
        this.password = "";
        this.teachingCourses = new ArrayList<>();
    }

    /**
     * Constructor with name and password as parameters
     * @param name the name of the teacher
     * @param password the password of the teacher
     */
    public Teacher(String name, String password) {
        this.id = generateId();
        this.name = name;
        this.password = password;
        this.teachingCourses = new ArrayList<>();
    }

    /**
     * Method to generate the next ID
     *
     * @return the next ID
     */
    @Override
    protected String generateId() {
        return String.format("T%04d", nextId++);
    }

    /**
     * Getter method to get the list of teaching course
     * @return list of teaching course
     */
    public List<Course> getTeachingCourses() {
        return teachingCourses;
    }

} //End of class
