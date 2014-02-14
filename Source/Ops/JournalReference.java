package Ops;

import java.util.*;

public class JournalReference extends Reference {
	private int publishDate;
	private String journal;
	private String article;
	private String pagerange;
	private String vol;
	private String issue;
	
	
	public JournalReference(ArrayList<String> authors, int publishDate, String journal,
			String article, String pagerange, String vol, String issue){
		super(authors,Reference.JOURNAL_REF);
		this.publishDate=publishDate;
		this.journal=journal;
		this.article=article;
		this.pagerange=pagerange;
		this.vol=vol;
		this.issue=issue;
	}
	public int getPublishDate() {
		return publishDate;
	}
	public String getJournal() {
		return journal;
	}
	public String getArticle() {
		return article;
	}
	public String getPagerange() {
		return pagerange;
	}
	public String getVol() {
		return vol;
	}
	public String getIssue() {
		return issue;
	}
}
