/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sibuyile.assignment2.service.Impl;

import com.sibuyile.assignment2.service.AssignmentService;

/**
 *
 * @author stud
 */
public class ServiceImpl implements AssignmentService {

    
    @Override
   public float feeBalance() {
        
        float amountPaid = 0;
        final float fee = (float)550.00;
       float balance = amountPaid - fee;
       
       return balance;
    }

    @Override
    public int memberYrs() {
        
        final int year = 2013;
        int joinYr = 0;
        
        int  memberYrs = year - joinYr;
        
        return memberYrs;
        
       // int members = 0;
       // String message;
        
       // if(members >= 5)
       //     message = "Club is full";
       // else
      //      members++;
        
       // return members;
            
    }

    @Override
    public String memberDatails() {
        
        String name = "Sibuyile";
        String surname = "Mdladlana";
        String location = "Cape Town";
        int joinYr = 2010;
        double feeBalance = (double)550;
        String info = new String(name + surname + location + joinYr + feeBalance);
        
        return info;
        
    }

   
    @Override
    public String specificMembers() {
        String memberName = "Sibuyile Mdladlana";
        
        return memberName;
        
    }
    
     @Override
    public boolean paid() {
        
        boolean feePaid = false;
        
        return feePaid;
       
       
    }

    @Override
    public boolean feePaid() {
        
        boolean feePaid = true;
        
        return feePaid;
    }


    @Override
    public boolean cancelMembership() {
        
        return false;
        
    }

    @Override
    public void membershipExpiration() {
       
        String message;
       
        if(memberYrs() < 5)
            message = "Your membership has expired.";
        else
            message = "You are still an active member.";
        
    }

    @Override
    public String isNull() {
        
       return null;
       
    
    }

    @Override
    public void listOfMembers() {
    
        String [] actual = new String [] {"Sibu", "Zintle", "Sese"};
        String [] var = new String [] {"Sibu", "Daisy", "Khazi"};
        
        
    }

        
       
        
   
    
}
