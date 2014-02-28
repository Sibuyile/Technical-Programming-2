/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sibu.flightsystem.Violation.DIP.service.Impl;

/**
 *
 * @author stud
 */
public class SpecialAddition {
    Sum s = new Sum();
    int num1, num2;
    int ans = s.add(num1, num2);
    
    public boolean isEven(int ans){
        if(ans % 2 == 0)
            return true;
        else 
            return false;
    }
    
}
