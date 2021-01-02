package project2;

import java.util.ArrayList;
import java.util.List;

/**
 * Class to create a student
 *
 * @author maria
 */
public class Student extends User {

    //Data members
    private List<Course> regsCourses;
    private static int nextId = 1;

    /**
     * Constructor with name and password as parameters
     *
     * @param name the name of the student
     * @param password the password of the student
     */
    public Student(String name, String password) {
        this.id = generateId();
        this.name = name;
        this.password = password;
        this.regsCourses = new ArrayList<>();
    }

    /**
     * Method to generate the next ID
     *
     * @return the next ID
     */
    @Override
    protected String generateId() {
        return String.format("S%04d", nextId++);
    }

    /**
     * Getter method to get the register courses
     *
     * @return the list of register courses
     */
    public List<Course> getRegsCourses() {
        return regsCourses;
    }

} //End of class
