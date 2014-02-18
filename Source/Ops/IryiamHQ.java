package Ops;

import java.util.*;


public class IryiamHQ {
	private Formatter formatter;
	private ArrayList<Reference> allMergedRefs;
	public IryiamHQ(){
		this.formatter=new Formatter();
		
		this.allMergedRefs=new ArrayList<Reference>();
	}
	public Formatter getFormatter(){
		return formatter;
	}
	public ArrayList<Reference> getAllReferences(){
		return allMergedRefs;
	}
}
