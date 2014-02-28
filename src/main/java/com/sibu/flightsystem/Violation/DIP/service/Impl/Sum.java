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
public class Sum {
    int ans;
    SpecialAddition add = new SpecialAddition();
    public int add(int num1, int num2){
        ans = num1 + num2;
        return ans;
    }
    public void findEvenAnswer(){
    if(add.isEven(ans))
        System.out.println("The answer is an even number..");
    else
        System.out.println("The answer is an odd number..");
    }
}
