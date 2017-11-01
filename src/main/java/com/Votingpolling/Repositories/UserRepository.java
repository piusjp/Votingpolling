/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Votingpolling.Repositories;

import com.Votingpolling.Entities.UserEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

/**
 *
 * @author HP
 */
@RestResource
public interface UserRepository extends JpaRepository<UserEntity, Long>{
    
    public List<UserEntity> findUserEntitiesByUserId(Long userId);
    
    @Query("select u from UserEntity u where u.userEmail=:email")
    public UserEntity suseremail(@Param("email")String email);
}
