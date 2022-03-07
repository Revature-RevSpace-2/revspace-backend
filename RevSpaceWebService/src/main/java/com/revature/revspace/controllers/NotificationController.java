package com.revature.revspace.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.revature.revspace.models.Notification;
import com.revature.revspace.services.NotificationService;

@RestController
public class NotificationController {
	
	@Autowired
	NotificationService nServ;
	
	@GetMapping(value = "/notifications/{id}")
	public List<Notification> getNotificationByUser(@PathVariable(name="id") String id){
		List<Notification> notificationAll = nServ.getAll();
		List<Notification> notificationById = new ArrayList<>();
		for(Notification noti: notificationAll) {
			int createrId = noti.getPost().getCreatorId().getUserId();
			System.out.println("CreaterId: "+createrId);
			if(createrId == Integer.parseInt(id)) {
				notificationById.add(noti);
			}
		}
		
		System.out.println("Notifications: "+notificationById);
		return notificationById;
	}
	
	

}
