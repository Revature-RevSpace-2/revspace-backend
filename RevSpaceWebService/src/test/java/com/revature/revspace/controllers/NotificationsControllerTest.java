package com.revature.revspace.controllers;

import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.revature.revspace.models.Notifications;
import com.revature.revspace.repositories.NotificationsRepo;
import com.revature.revspace.services.NotificationService;


@AutoConfigureMockMvc
@TestPropertySource("classpath:application.properties")
@TestPropertySource("classpath:application-test.properties")
@SpringBootTest(classes = com.revature.revspace.app.RevSpaceWebServiceApplication.class)
public class NotificationsControllerTest {
	
//	private static final String TEST_EMAIL = "testemail@revature.net";


    @Autowired
    MockMvc mvc;

    @Autowired
    Gson gson;

    @MockBean
    NotificationsRepo nRepo;

    @MockBean
    NotificationService nServ;
    
    
    @Test
    void getNotificationByIdTest() throws Exception{
    	
//    	Notifications notification = ModelGenerators.makeRandomNotifications();
    	Notifications notification = new Notifications(1,"message",LocalDate.now(),1);
    	
    	ResultActions actions = mvc.perform(MockMvcRequestBuilders.get("/notifications/1")
    			.contentType(MediaType.APPLICATION_JSON)
    			.content(new ObjectMapper().writeValueAsString(notification)));
    	actions.andExpect(MockMvcResultMatchers.status().isOk());

	}


	@Test
	void addNotificationTest() throws Exception{
		
		Notifications notification = new Notifications(1,"message",LocalDate.now(),1);

		ResultActions actions = mvc.perform(MockMvcRequestBuilders.post("/notifications/")
    			.contentType(MediaType.APPLICATION_JSON)
    			.content(new ObjectMapper().writeValueAsString(notification)));
    	actions.andExpect(MockMvcResultMatchers.status().is(201));
		
	}

	
	@Test
	void deleteNotificationTest() throws Exception{
		
		Notifications notification = new Notifications(1,"message",LocalDate.now(),1);

		ResultActions actions = mvc.perform(MockMvcRequestBuilders.delete("/notifications/1")
    			.contentType(MediaType.APPLICATION_JSON)
    			.content(new ObjectMapper().writeValueAsString(notification)));
    	actions.andExpect(MockMvcResultMatchers.status().isOk());
		
	}

   

}
