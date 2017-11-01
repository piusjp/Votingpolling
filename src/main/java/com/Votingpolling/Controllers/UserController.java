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
    @RequestMapping(value = "/salluser",method = RequestMethod.GET)
    public ResponseEntity<List<UserEntity>> salluser(){
        return new ResponseEntity<>(userService.salluser(),HttpStatus.FOUND);
    }
    
    //show user by email
    @RequestMapping(value = "/suseremail/{email}",method = RequestMethod.GET)
    public ResponseEntity<UserEntity> suseremail(@PathVariable String email){
        System.out.println(userService.suseremail(email));
        return ResponseEntity.ok(userService.suseremail(email));
    }
}
