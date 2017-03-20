package com.team;
import java.io.Serializable;
import java.util.Date;
public class Treat implements Comparable, Serializable{
	private static final long serialVersionUID = -3953639501150931364L;
	private boolean mBreakIt = true;
	private String mAuthor;
	private String mDescription;
	private Date mCreationDate;
	
	public Treat(String author, String description, Date creationDate){
		mAuthor = author;
		mDescription = description;
		mCreationDate = creationDate;	
	}
	@Override
	public String toString(){
		return String.format("Treat: \"%s\" by %s on %s", 
				mDescription,mAuthor, mCreationDate);
	}
	@Override
	public int compareTo(Object obj){
		Treat other = (Treat) obj;
		if(equals(other)){
			return 0;
		}
		int dateCmp = mCreationDate.compareTo(other.mCreationDate);
		if (dateCmp == 0){
			return mDescription.compareTo(other.mDescription);
		}
		return dateCmp;
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
public String[] getWords(){
	return mDescription.toLowerCase().split("[^\\w#@']+");
}
}