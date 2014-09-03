package com.example.historicireland2;

public class dataObject 
{
	private long id;
	private String title;
	private String snippet;
	private String position1;
	private String position2;
	
	public dataObject ()
	{
		
	}
	public dataObject(long id, String title, String snippet, String position1, String position2)
	{
		this.id=id;
		this.title=title;
		this.snippet=snippet;
		this.position1=position1;
		this.position2=position2;
	}
	public dataObject(String title, String snippet, String position1, String position2)
	{
		
		this.title=title;
		this.snippet=snippet;
		this.position1=position1;
		this.position2=position2;
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
	public String getPosition1()
	{
		return position1;
	}
	
	public void setPosition1 (String position1)
	{
		this.position1=position1;
	}
	public String getPosition2()
	{
		return position2;
	}
	
	public void setPosition2 (String position2)
	{
		this.position2=position2;
	}
	public String getTitle() {
		// TODO Auto-generated method stub
		return title;
	}
	
}
