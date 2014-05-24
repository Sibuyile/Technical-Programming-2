/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sibu.designpatterns.behavioral.Template;

/**
 *
 * @author stud
 */
public class TacoMeal extends Meal{
    
    @Override
    public String prepareIngredients() {
            return("Getting ground beef and shells");
    }

    @Override
    public String cook() {
            return("Cooking ground beef in pan");
    }

    @Override
    public String eat() {
            return("The tacos are tasty");
    }

    @Override
    public String cleanUp() {
            return("Doing the dishes");
    }
}
