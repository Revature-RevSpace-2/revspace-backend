package com.revature.revspace.models;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="notifications")
public class Notification {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "noti_id", updatable = false)
	private int noti_id;
	
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

	public Notification(int noti_id, String message, LocalDate dateAndTime,boolean isViewed,Post post) {
		super();
		this.noti_id = noti_id;
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

	

	public int getNoti_id() {
		return noti_id;
	}

	
	
	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	@Override
	public String toString() {
		return "NotificationsModel [noti_id=" + noti_id + ", message=" + message + ", dateAndTime=" + dateAndTime  + ", post=" + post +  "]";
	}
	
}
