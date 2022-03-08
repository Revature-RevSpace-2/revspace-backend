package com.revature.revspace.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.TestPropertySource;

import com.revature.revspace.models.Like;
import com.revature.revspace.models.Notifications;
import com.revature.revspace.repositories.LikeRepo;
import com.revature.revspace.repositories.NotificationsRepo;
import com.revature.revspace.repositories.PostRepo;





@TestPropertySource("classpath:application-test.properties")
@SpringBootTest(classes= com.revature.revspace.app.RevSpaceWebServiceApplication.class)
public class NotificationsServiceTest {
	
	
@Autowired
NotificationService ns;

@MockBean
NotificationsRepo nr;

private List<Notifications> notlist;


@BeforeEach
void setUp() {
	for (int i = 0; i < 2; i++){
	notlist.add(new Notifications(i+1,"message", LocalDate.now(),1));
	}
}

@Test
void getAllNotificationsTest() {
	
	List<Notifications> testlist = ns.getAllNotifications();
	assertEquals(notlist.size(), testlist.size());
}

@Test
void getNotificationByIdTest() {
	
	Notifications notification = new Notifications(1,"message",LocalDate.now(),1);
	Assertions.assertNotNull(ns.getNotificationById(notification.getNotiId()));
}

@Test
void getNotificationByUserTest() {
	
	Notifications notification = new Notifications(1,"message",LocalDate.now(),1);
	List<Notifications> testlist = ns.getNotificationByUser(notification.getUserReceive());
	assertEquals(notlist.size(), testlist.size());
	
}

@Test
public void addNotificationTest() {
	
	Notifications notification = new Notifications(1,"message",LocalDate.now(),1);
	ns.addNotification(notification);
	List<Notifications> testlist = ns.getAllNotifications();
	Assertions.assertEquals(testlist.size(), 3);
		
}


}
