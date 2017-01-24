/**
 * //Description of Library interface
 * 
 * @author svince04
 */
public interface Library {

    /**
     * Adds new user to Library. User name must be unique.
     *
     * @return ID of user added if successful, null if unsuccessful
     */
    int addUser(String name);

    /**
     * Gets name of current library
     *
     * @return Library name
     */
    String getName();
}
