package Ops;

import java.util.*;

public class Reference {
	public ArrayList<String> authors;
	public static int BOOK_REF;
	public static int JOURNAL_REF;
	public static int WEB_REF;
	private int type;
	public Reference(ArrayList<String> authors, int type){
		this.authors=authors;
		setType(type);
	}
	public void setAuthorList(ArrayList<String> alist){
		this.authors=alist;
	}
	public ArrayList<String> getAuthorList(){
		return authors;
	}
	private void setType(int t){
		this.type=t;
	}
	public int getType(){
		return type;
	}
}
