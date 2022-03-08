package com.revature.revspace.controllers;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.revature.revspace.models.Credentials;
import com.revature.revspace.models.Like;
import com.revature.revspace.models.Notifications;
import com.revature.revspace.models.Post;
import com.revature.revspace.models.User;
import com.revature.revspace.repositories.CredentialsRepo;
import com.revature.revspace.repositories.NotificationsRepo;
import com.revature.revspace.services.LikeService;
import com.revature.revspace.services.NotificationService;
import com.revature.revspace.services.PostService;
import com.revature.revspace.testutils.ModelGenerators;


@AutoConfigureMockMvc
@TestPropertySource("classpath:application.properties")
@TestPropertySource("classpath:application-test.properties")
@SpringBootTest(classes = com.revature.revspace.app.RevSpaceWebServiceApplication.class)
public class NotificationsControllerTest {
	
//	private static final String TEST_EMAIL = "testemail@revature.net";

    @MockBean
   	NotificationService ns;

    @Autowired
    MockMvc mvc;

    @Autowired
    Gson gson;

    @MockBean
    NotificationsRepo nRepo;

    @MockBean
    NotificationService nServ;
    
//    public Notifications(int notiId, String message, LocalDate dateAndTime, User userReceive)
    
    
    @Test
	void getAllNotifications() throws Exception{
    	
    	Notifications not = ModelGenerators.makeRandomNotifications();
    	List<Notifications> nots = new ArrayList();
    	
    	
//		return UserController.loginUser.getList();
	}
	
//	@Test
//	void getNotificationById(@PathVariable("notiId") String notiId) throws Exception{
//		Notifications nmodl = nServ.getNotificationById(notiId);
//		return ResponseEntity.status(200).body(nmodl);
//		
//		
//	}
//		
//	@Test
//	void addNotification(@RequestBody Notifications nmodl) throws Exception{
//		if(nServ.getNotificationById(nmodl.getMessage())==null) {
//			nServ.addNotification(nmodl);
//			return  ResponseEntity.status(201).body(nServ.getAllNotifications());
//		}
//		return  ResponseEntity.noContent().build();
//	}
//	
//	
//	@Test
//	void deleteNotification(@PathVariable("notId") String notiId) throws Exception{
//		Optional<Notifications> notiOpt = Optional.ofNullable(nServ.getNotificationById(notiId));
//		if (notiOpt.isPresent()) {
//			nServ.deleteNotification(notiOpt.get());
//			return ResponseEntity.status(200).body(notiOpt.get());
//		}
//		return ResponseEntity.notFound().build();
//	}

   

}
