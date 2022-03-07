package com.revature.revspace.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.revature.revspace.models.Notification;

@Repository
public interface NotificationRepo extends CrudRepository<Notification, Integer>{

}
