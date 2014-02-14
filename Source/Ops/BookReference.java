package Ops;

import java.util.ArrayList;


public class BookReference extends Reference {
	private String editor;
	private int publishDate;
	private String bookTitle;
	private String edition;
	private String location;
	private String publisher;
	public BookReference(ArrayList<String> authors, String editor, int publishDate,
			String bookTitle, String edition, String location, String publisher){
		super(authors, Reference.BOOK_REF);
		this.editor=editor;
		this.publishDate=publishDate;
		this.bookTitle=bookTitle;
		this.edition=edition;
		this.location=location;
		this.publisher=publisher;
	}	
	public String getEditor(){
		return editor;
	}
	public String getTitle(){
		return bookTitle;
	}
	public int getDate(){
		return publishDate;
	}
	public String getEdition(){
		return edition;
	}
	public String getLocation(){
		return location;
	}
	public String getPublisher(){
		return publisher;
	}
}
