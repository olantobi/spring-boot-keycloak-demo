/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.liferon.keycloakdemo;

import java.security.Principal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author olanrewaju.ebenezer
 */
@Controller
public class WebController {
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
    
    @Autowired
    private CustomerDAO customerDAO;
    
    @GetMapping(path = "/")
    public String index() {
        LOGGER.info("Called / endpoint");
        return "external";
    }

    @GetMapping(path = "/customers")
    public String customers(Principal principal, Model model) {
        LOGGER.info("Called /customers endpoint to show customers list");
        addCustomers();
        model.addAttribute("customers", customerDAO.findAll());
        model.addAttribute("username", principal.getName());
        return "customers";
    }
    
    // add customers for demonstration
    public void addCustomers() {
        LOGGER.info("Adding test customers ");
        Customer customer1 = new Customer();
        customer1.setAddress("1111 foo blvd");
        customer1.setName("Foo Industries");
        customer1.setServiceRendered("Important services");
        customerDAO.save(customer1);

        Customer customer2 = new Customer();
        customer2.setAddress("2222 bar street");
        customer2.setName("Bar LLP");
        customer2.setServiceRendered("Important services");
        customerDAO.save(customer2);

        Customer customer3 = new Customer();
        customer3.setAddress("33 main street");
        customer3.setName("Big LLC");
        customer3.setServiceRendered("Important services");
        customerDAO.save(customer3);
    }
}
