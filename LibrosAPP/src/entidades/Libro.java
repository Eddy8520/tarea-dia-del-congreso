package entidades;


/**
 * @author alexa
 * @version 1.0
 * @created 02-Dec-2022 12:55:54 AM
 */
public class Libro {

	private String isbn;
	private String title;
	private int editionNumber;
	private String copyright;
	public Autor m_Autor;

	public Libro(){

	}

	public void finalize() throws Throwable {

	}
}//end Libro