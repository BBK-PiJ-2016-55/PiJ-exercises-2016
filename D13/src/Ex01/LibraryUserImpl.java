package Ex01;

/**
 * Implementation of LibraryUser
 * 
 * @author svince04
 */
public class LibraryUserImpl implements LibraryUser {
	private String name;
	private int libraryId;
	private Library library = new LibraryImpl();

	public LibraryUserImpl(String name) {
		this.name = name;
	}

    public String getUserName() {
    	return name;
    }

    public int register(Library lib) {
    	library = lib;
    	libraryId = lib.addUser(name);
    	return libraryId;
    }

    public String getLibrary() {
    	return library.getName();
    }


}