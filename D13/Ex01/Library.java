/**
 * //Description of Library interface
 * 
 * @author svince04
 */
public interface Library {

    /**
     * Adds new user to Library. User name must be unique.
     *
     * @return LibraryUser added if successful, null if unsuccessful
     */
    LibraryUser addUser();

}
