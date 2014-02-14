package Ops;

import java.util.*;

public class Reference {
	public ArrayList<String> authors;
	private String authorString;
	public Reference(ArrayList<String> authors){
		this.authors=authors;
	}
	public void createAuthorString(){
		sortAuthors();
		authorString="";
		if(getAuthors().size()>1){
			for(String author:getAuthors()){
				int i=getAuthors().indexOf(author);
				boolean isLast=i==getAuthors().size()-1;
				boolean is2ndLast=i==getAuthors().size()-2;
				if(isLast){
					authorString=authorString+"and "+author;
				}else if(is2ndLast){
					authorString=authorString+author+" ";
				}else{
					authorString=authorString+author+", ";
				}
			}
		}else{
			authorString=getAuthors().get(0);
		}
	}
	public void sortAuthors(){
		Collections.sort(getAuthors());
	}
	public String getAuthorString(){
		return authorString;
	}
	public ArrayList<String> getAuthors(){
		return authors;
	}
}
