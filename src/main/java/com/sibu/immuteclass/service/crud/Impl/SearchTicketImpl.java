/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sibu.immuteclass.service.crud.Impl;

import com.sibu.immuteclass.model.SearchTicket;
import com.sibu.immuteclass.service.crud.SearchTicketCrud;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author stud
 */
public class SearchTicketImpl implements SearchTicketCrud{
    
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public SearchTicket find(String id) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public SearchTicket persist(SearchTicket entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public SearchTicket merge(SearchTicket entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public SearchTicket remove(SearchTicket entity) {

        return  null;

    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<SearchTicket> findAll() {
        return null;
    }
    
}
