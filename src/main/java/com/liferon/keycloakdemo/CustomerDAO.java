/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.liferon.keycloakdemo;

import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author olanrewaju.ebenezer
 */

public interface CustomerDAO extends CrudRepository<Customer, Long> {
    
}
