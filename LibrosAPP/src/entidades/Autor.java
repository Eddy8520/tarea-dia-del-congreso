package entidades;


/**
 * @author alexa
 * @version 1.0
 * @created 02-Dec-2022 12:55:54 AM
 */
public class Autor {

	private int authorID;
	private String firstName;
	private String lastName;

	public Autor(){

	}

    public Autor(int authorID, String firstName, String lastName) {
        this.authorID = authorID;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getAuthorID() {
        return authorID;
    }

    public void setAuthorID(int authorID) {
        this.authorID = authorID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

     public String toString()   {
         return firstName+ " " + lastName ;
     }
        
        
        
	public void finalize() throws Throwable {

	}
}//end Autor