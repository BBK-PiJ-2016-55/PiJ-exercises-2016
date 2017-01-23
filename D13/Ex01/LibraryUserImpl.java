/**
 * Implementation of LibraryUser
 * 
 * @author svince04
 */
public class LibraryUserImpl implements LibraryUser {
	private String name;

	public LibraryUserImpl(String name) {
		this.name = name;
	}

    public String getUserName() {
    	return name;
    }

    public String getId() {
    	return "";
    }

}