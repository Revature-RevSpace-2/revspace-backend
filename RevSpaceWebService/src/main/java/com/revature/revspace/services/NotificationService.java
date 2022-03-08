package com.revature.revspace.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.revature.revspace.models.Notifications;
import com.revature.revspace.repositories.NotificationsRepo;

@Service
public class NotificationService {
	
	private NotificationsRepo nRepo;
	
	public NotificationService () {
		
	}

	public NotificationService (NotificationsRepo nRepo) {
		super ();
		this.nRepo = nRepo;
		
	}

	public List<Notifications> getAllNotifications() {
		// TODO Auto-generated method stub
		return this.nRepo.findAll();
	}
	
	public Notifications getNotificationById(int notiId) {
		// TODO Auto-generated method stub
		List<Notifications> nList = this.nRepo.findAll();
		int notificationId = notiId;
		for (Notifications noti: nList) {
			if (noti.getNotiId() == notificationId) {
				return noti;
			}
		}
		return null;
	}

	public void addNotification(Notifications nmodl) {
		// TODO Auto-generated method stub
		nRepo.save(nmodl);
		
	}


	public void deleteNotification(Notifications notifications) {
		// TODO Auto-generated method stub
		nRepo.delete(notifications);
		
	}

	
}
