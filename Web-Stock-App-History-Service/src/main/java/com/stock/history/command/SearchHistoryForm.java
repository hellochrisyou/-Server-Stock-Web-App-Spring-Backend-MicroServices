package com.stock.history.command;

import java.util.Date;

import javax.persistence.Id;

public class SearchHistoryForm implements BaseHistoryForm {

	@Id
	private String id;
	private String email;
	private String action; 
	private String title;
	private Date timeOfAction;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getTimeOfAction() {
		return timeOfAction;
	}
	public void setTimeOfAction(Date timeOfAction) {
		this.timeOfAction = timeOfAction;
	}
	@Override
	public String toString() {
		return "SearchHistoryForm [id=" + id + ", email=" + email + ", action=" + action + ", title=" + title
				+ ", timeOfAction=" + timeOfAction + "]";
	}
	
	
}