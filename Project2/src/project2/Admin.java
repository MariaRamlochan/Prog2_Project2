package project2;

/**
 * Class to create an admin
 *
 * @author maria
 */
public class Admin extends User {

    //Data members
    private static int nextId = 1;

    /**
     * Constructor with name and password parameters
     *
     * @param name the name of the admin
     * @param password the password of the admin
     */
    public Admin(String name, String password) {
        this.id = generateId();
        this.name = name;
        this.password = password;
    }

    /**
     * genrateId method that will generate the next ID
     *
     * @return the next ID
     */
    @Override
    protected String generateId() {
        return String.format("A%04d", nextId++);
    }

} //End of class
