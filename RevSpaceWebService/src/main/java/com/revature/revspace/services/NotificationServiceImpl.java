package com.revature.revspace.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.revspace.models.Notification;
import com.revature.revspace.repositories.NotificationRepo;
@Service
public class NotificationServiceImpl implements NotificationService{

	@Autowired
	NotificationRepo notiRepo;
	
	
	@Override
	public NotificationRepo getRepo() {
		return notiRepo;
	}


	@Override
	public Integer getIDFor(Notification value) {
		return value.getNoti_id();
	}


}
	
