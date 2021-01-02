package project2;

import java.io.*;
import java.io.FileOutputStream;
import java.io.Serializable;

/**
 * Class to create a user
 *
 * @author maria
 */
public abstract class User implements Serializable {

    //Data members
    protected String id;
    protected String name;
    protected String password;

    /**
     * Default constructor
     */
    public User() {
        this.id = "";
        this.name = "";
        this.password = "1234";
    }

    /**
     * Constructor with all data members
     *
     * @param id from User id data member
     * @param name from User name data member
     * @param password from User data member password
     */
    public User(String id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    /**
     * Copy constructor
     *
     * @param user from User
     */
    public User(User user) {
        this.id = user.id;
        this.name = user.name;
        this.password = user.password;
    }

    /**
     * Method is abstract
     *
     * @return nothing
     */
    protected abstract String generateId();

    /**
     * Getter method to get the ID of the user
     *
     * @return the ID of the user
     */
    public String getId() {
        return id;
    }

    /**
     * Getter method to get the name of the user
     *
     * @return the name of the user
     */
    public String getName() {
        return name;
    }

    /**
     * Getter method to get the password of the user
     *
     * @return the password of the user
     */
    public String getPassword() {
        return password;
    }

    /**
     * Method to serialize an object
     *
     * @param path the path of the file
     * @param obj the object to serialize
     */
    public static void serializeObj(String path, Object obj) {
        File outFile = new File(path);
        try (FileOutputStream fos = new FileOutputStream(outFile)) {
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(obj);
        } catch (Exception e) {
            System.out.printf("Error: %s", e);
        }
    }

    /**
     * Method to deserialize an object
     *
     * @param path the path of the file
     * @return the deserialized object
     */
    public static Object deserializeObj(String path) {
        File inFile = new File(path);
        try (FileInputStream fis = new FileInputStream(inFile)) {
            ObjectInputStream ois = new ObjectInputStream(fis);
            return ois.readObject();
        } catch (Exception e) {
            System.out.printf("Error: %s", e);
        }
        return null;
    }

} //End of class
