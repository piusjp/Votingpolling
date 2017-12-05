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
    public List<UserEntity> alluser(){
        return userRepo.findAll();
    }
    
    @Override
    public UserEntity userbyid(UserEntity data){
        return userRepo.findUserEntitiesByUserId(data.getUserId());
    }
    
    @Override
    public UserEntity userbymail(UserEntity data){
        return userRepo.userbymail(data.getUserEmail());
    }

    @Override
    public UserEntity userbyname(UserEntity data) {
        return userRepo.findUserEnititiesByUserName(data.getUserName());
    }
}
