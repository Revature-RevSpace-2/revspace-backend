package com.revature.revspace.models;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
@Table(name="notifications")
public class Notification {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "notiId", updatable = false)
	private int notiId;
	
	@Column(name = "message")
	private String message;
	
	@Column(name = "dateAndTime")
	private LocalDate dateAndTime;
	
	@Column(name = "isViewed")
	private boolean isViewed;
	
	@OneToOne(cascade=CascadeType.MERGE, fetch = FetchType.EAGER)
	@JoinColumn(name="post_id")
	@JsonManagedReference
	private Post post;
	


	
	public Notification() {
		// TODO Auto-generated constructor stub
	}

	public Notification(int notiId, String message, LocalDate dateAndTime,boolean isViewed,Post post) {
		super();
		this.notiId = notiId;
		this.message = message;
		this.dateAndTime = dateAndTime;
		this.isViewed = isViewed;
		this.post = post;
	}

	public Notification(String message, LocalDate dateAndTime, boolean isViewed,Post post) {
		super();
		this.message = message;
		this.dateAndTime = dateAndTime;
		this.isViewed = isViewed;
		this.post = post;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public LocalDate getDateAndTime() {
		return dateAndTime;
	}

	public void setDateAndTime(LocalDate dateAndTime) {
		this.dateAndTime = dateAndTime;
	}

	

	public boolean isViewed() {
		return isViewed;
	}

	public void setViewed(boolean isViewed) {
		this.isViewed = isViewed;
	}

	

	public int getNotiId() {
		return notiId;
	}

	
	
	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	@Override
	public String toString() {
		return "NotificationsModel [notiId=" + notiId + ", message=" + message + ", dateAndTime=" + dateAndTime  + ", post=" + post +  "]";
	}
	
}
