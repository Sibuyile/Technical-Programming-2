/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sibu.flightsystem.config;

import com.sibu.flightsystem.NonViolation.DIP.service.Add.Impl.SpecialAddition;
import com.sibu.flightsystem.NonViolation.DIP.service.SumInterface;
import com.sibu.flightsystem.NonViolation.ISP.service.Airport;
import com.sibu.flightsystem.NonViolation.ISP.service.Impl.flight;
import com.sibu.flightsystem.NonViolation.LSP.service.Impl.Flight;
import com.sibu.flightsystem.NonViolation.OCP.service.Impl.DepartCity;
import com.sibu.flightsystem.NonViolation.OCP.service.flightInterface;
import com.sibu.flightsystem.NonViolation.PLK.service.Impl.Tickets;
import com.sibu.flightsystem.NonViolation.PLK.service.Impl.runPLK;
import com.sibu.flightsystem.NonViolation.SRP.service.Impl.Booking;
import com.sibu.flightsystem.NonViolation.SRP.service.Impl.runSRP;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author stud
 */
public class FlightConfig {
    
    
    @Bean(name = "DIP")
    public SumInterface getDIP()
    {
        return new SpecialAddition();
    }
    
    @Bean(name = "ISP")
    public Airport getISP()
    {
        return new flight();
    }
    
    @Bean(name = "LSP")
    public Flight getLSP()
    {
        return new Flight();
    }
    
    @Bean(name = "OCP")
    public flightInterface getOCP()
    {
        return new DepartCity();
    }
    
    @Bean(name = "PLK")
    public Tickets getPLK()
    {
        return new Tickets();
    }
    
    @Bean(name = "SRP")
    public Booking getSRP()
    {
        return new Booking();
    }
    
    
    
    
    
}
