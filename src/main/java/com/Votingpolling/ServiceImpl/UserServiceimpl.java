/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Votingpolling.ServiceImpl;

import com.Votingpolling.Entities.UserEntity;
import com.Votingpolling.Repositories.UserRepository;
import com.Votingpolling.Services.UserService;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author HP
 */
@Service("User")
@Transactional
public class UserServiceimpl implements UserService{
    
    @Autowired
    private UserRepository userRepo;

    @Override
    public void newuser(UserEntity userData) {
        userRepo.saveAndFlush(userData);
    }
    
    @Override
    public List<UserEntity> salluser(){
        return userRepo.findAll();
    }
    
    @Override
    public UserEntity suseremail(String email){
        System.out.println(email);
        return userRepo.suseremail(email);
    }
}
