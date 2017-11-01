/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Votingpolling.Controllers;

import com.Votingpolling.Entities.UserEntity;
import com.Votingpolling.Services.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author HP
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    //new user
    @RequestMapping(value = "/nuser", method = RequestMethod.POST)
    public ResponseEntity<UserEntity> nuser(@RequestBody UserEntity data) {
        try {
            userService.newuser(data);
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.OK);
        }
    }
    
    //show all user
    @RequestMapping(value = "/alluser",method = RequestMethod.GET)
    public ResponseEntity<List<UserEntity>> alluser(){
        return new ResponseEntity<>(userService.alluser(),HttpStatus.FOUND);
    }
    
    //show user by email
    @RequestMapping(value = "/userbymail",method = RequestMethod.POST)
    public ResponseEntity<UserEntity> userbymail(@RequestBody UserEntity data){
        return new ResponseEntity<>(userService.userbymail(data),HttpStatus.FOUND);
    }
    
    //show user by userID
    @RequestMapping(value = "/userbyid",method = RequestMethod.POST)
    public ResponseEntity<UserEntity> userbyid(@RequestBody UserEntity data){
        return new ResponseEntity<>(userService.userbyid(data),HttpStatus.FOUND);
    }
}
