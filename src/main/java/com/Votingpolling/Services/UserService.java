/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Votingpolling.Services;

import com.Votingpolling.Entities.UserEntity;
import java.util.List;

/**
 *
 * @author HP
 */
public interface UserService {
    
    void newuser(UserEntity userData);
    
    List<UserEntity> alluser();
    
    UserEntity userbymail(UserEntity data);
    
    UserEntity userbyid(UserEntity data);
}
