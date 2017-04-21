package Ex01;

/**
 * //Description of LibraryImpl
 * 
 * @author svince04
 */
public class LibraryImpl implements Library {

	LibraryUser[] newUser = new LibraryUser[10]; 

    public int addUser(String name) {
    	return 123;
    }

    public String getName() {
    	return "Library Name";
    }
}