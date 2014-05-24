/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sibu.designpatterns.behavioral.ChainOfResponsibility;

/**
 *
 * @author stud
 */
public class VenusHandler extends PlanetHandler {

    public void handleRequest(PlanetEnum request) {
		if (request == PlanetEnum.VENUS) {
			System.out.println("VenusHandler handles " + request);
			System.out.println("Venus is poisonous.\n");
		} else {
			System.out.println("VenusHandler doesn't handle " + request);
			if (successor != null) {
				successor.handleRequest(request);
			}
		}
	}

}
