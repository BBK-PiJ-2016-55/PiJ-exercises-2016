package Ex01;

/**
 * //Description of LibraryUser interface
 * 
 * @author svince04
 */
public interface LibraryUser {

    /**
     *
     * @return userName
     */
    String getUserName();

    /**
     *
     * @return libraryID
     */
    int register(Library library);

    /**
     *
     * @return library name
     */
    String getLibrary();


}

