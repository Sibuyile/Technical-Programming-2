/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sibu.designpatterns.creational.Factory;

/**
 *
 * @author stud
 */
public class AgeFactory {

    
   public AgeType getFactory(int af)
   {
       /* if("3".equals(af))
        {
            return new Infant();
        }
        else// if("10".equals(af))
        {
            return new Child();
        }
       // else  ("25".equals(af))
       // {
       //     return new Adult();
       // }
               */
       
       if(af < 3)
       {
           return new Infant();
       }
       else if(af < 3 && af > 10)
       {
           return new Child();
       }
       else 
           return new Adult();
       
    }
    
}
