package com.restapi.springboot.vo;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = false)
public class UserVO implements Serializable {

	private static final long serialVersionUID = 1L;

	private int userId;

	private int id;

	private String title;

	@JsonProperty("completed") // used to annotate fields or methods within a Java class to specify the JSON
								// property
	private boolean status;

	private String userName; // Additional field which is not present in response

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "UserVO [userId=" + userId + ", id=" + id + ", title=" + title + ", status=" + status + ", userName="
				+ userName + "]";
	}
}
