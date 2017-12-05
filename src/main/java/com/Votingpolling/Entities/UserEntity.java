/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Votingpolling.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

/**
 *
 * @author HP
 */
@Entity
@Data
public class UserEntity {
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long userId;
    
    @Column
    private String userName;
    
    @Column
    private String userEmail;
    
    @Column
    private String userPassword;
    
    @Column
    private String userPhone;
}
