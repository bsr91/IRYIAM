package Ops;

import java.util.*;

public class Formatter {
	/*
	 * Sort authors alphabetically by last name
	 */
	public void sortAuthors(Reference r){
		ArrayList<String> alist=r.getAuthorList();
		Collections.sort(alist);
		r.setAuthorList(alist);
	}
	/*
	 * Format and contacenate author list ready for final ref
	 */
	public String getAuthorListAsString(Reference r){
		String authorString="";
		if(r.getAuthorList().size()>1){
			for(String author:r.getAuthorList()){					
				int i=r.getAuthorList().indexOf(author);
				boolean isLast=i==r.getAuthorList().size()-1;
				boolean is2ndLast=i==r.getAuthorList().size()-2;
				if(isLast){
					authorString=authorString+"and "+author;
				}else if(is2ndLast){
					authorString=authorString+author+" ";
				}else{
					authorString=authorString+author+", ";
				}
			}
		}else{
			authorString=r.getAuthorList().get(0);
		}
		return authorString;
	}
}
