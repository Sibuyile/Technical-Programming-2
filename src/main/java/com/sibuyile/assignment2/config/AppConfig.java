/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sibuyile.assignment2.config;

import com.sibuyile.assignment2.service.AssignmentService;
import com.sibuyile.assignment2.service.Impl.ImprovedServiceImpl;
import com.sibuyile.assignment2.service.Impl.ServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author stud
 */
@Configuration
public class AppConfig {
    
    @Bean(name = "Hiking")
    public AssignmentService getService()
    {
       return new ServiceImpl();
    }
   
  
    
 //   @Bean(name = "Hiking club")
  //  public AssignmentService getImprovedService()
  //  {
  //      return new ImprovedServiceImpl();
  //  }

    
    
}
