/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sibuyile.assignment2.service;

/**
 *
 * @author stud
 */
public interface AssignmentService {
    
   //floating point assertion
  float feeBalance();
  
  //Integer assertion
  int memberYrs();
  
  //ObjectEquality
  String memberDatails();
  
  //Obect Identity
  String specificMembers();
  
  //Asserting truth
  boolean paid();
  
  //Asserting false
  boolean feePaid();
 
  //Deliberately failing a test
  boolean cancelMembership();
  
  //Timeout
  void membershipExpiration();
  
  //isNull test
  String isNull();
  
  //Asserting array contents
  void listOfMembers();
    
    
    
}
