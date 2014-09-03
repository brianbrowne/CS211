package com.example.historicireland;

public class dataObject 
{
	private long id;
	private String title;
	private String snippet;
	private String position;
	
	public dataObject ()
	{
		
	}
	public dataObject(long id, String title, String snippet, String position)
	{
		this.id=id;
		this.title=title;
		this.snippet=snippet;
		this.position=position;
	}
	public dataObject(String title, String snippet, String position)
	{
		
		this.title=title;
		this.snippet=snippet;
		this.position=position;
	}
	public void setTitle(String title)
	{
		this.title=title;
	}
	public String getSnippet()
	{
		return snippet;
	}
	public void setSnippet(String snippet)
	{
		this.snippet=snippet;
	}
	public long getId()
	{
		return id;
	}
	public void setId(long id)
	{
		this.id=id;
	}
	public String getPosition()
	{
		return position;
	}
	
	public void setPosition (String position)
	{
		this.position=position;
	}
	public String getTitle() {
		// TODO Auto-generated method stub
		return title;
	}
	
}
