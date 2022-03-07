package com.revature.revspace.controllers;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.revature.revspace.models.Like;
import com.revature.revspace.models.Notification;
import com.revature.revspace.repositories.NotificationRepo;
import com.revature.revspace.services.LikeService;

@RestController
public class LikeController {

    @Autowired
    LikeService ls;
    @Autowired
    NotificationRepo nRepo;

    @GetMapping(value = "/likes/{id}")
    public Like getLikeById(@PathVariable(name = "id") String id){
        int safeId;
        try{
            safeId = Integer.parseInt(id);
        } catch(NumberFormatException e)
        {
            throw new ResponseStatusException(HttpStatus.UNPROCESSABLE_ENTITY);
        }
        return ls.get(safeId);
    }

    @GetMapping(value = "/likes")
    public List<Like> getAllLikes(){
    	return ls.getAll();
    }

    @PostMapping(value="/likes", consumes = "application/json", produces = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public Like addLike(@RequestBody Like like)
    {
    	
    	Notification notification = new Notification("Like", LocalDate.now(),false, like.getPostId());
    	nRepo.save(notification);
        return ls.add(like);
    }

    //Update Like By ID
    @PutMapping(value = "/likes", consumes = "application/json", produces = "application/json")
    public Like updateLike(@RequestBody Like like)
    {
    	System.out.println("Inside UpdateLike");
        return ls.update(like);
    }



    //Delete Post By ID
    @DeleteMapping(value = "/likes/{id}")
    public boolean deletePost(@PathVariable("id") String id)
    {
        int safeId;
        try
        {
            safeId = Integer.parseInt(id);
        }catch (NumberFormatException e)
        {
            safeId = 0;
        }
        return ls.delete(safeId);
    }
}
