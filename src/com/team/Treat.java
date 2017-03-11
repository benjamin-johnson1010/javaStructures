package com.team;
import java.util.Date;
public class Treat{
	private String mAuthor;
	private String mDescription;
	private Date mCreationDate;
	
	public Treat(String author, String description, Date creationDate){
		mAuthor = author;
		mDescription = description;
		mCreationDate = creationDate;	
	}
	public String getAuthor(){
		return mAuthor;
	}
	public String getDescription(){
		return mDescription;
	}
	public Date getCreationDate(){
		return mCreationDate;
	}
}