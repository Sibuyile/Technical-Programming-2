/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sibu.flightsystemweb.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Embeddable;

/**
 *
 * @author stud
 */
@Embeddable
public class SearchTicket implements Serializable{
    
    private String searchID;
    private String search;
    List<Ticket> tic;

    private SearchTicket () {
    }
    
    private SearchTicket(Builder builder)
    {
        searchID = builder.searchID;
        search = builder.search;
        tic = builder.tic;
        
    }


    public static class Builder {
        private String search;
        private String searchID;
        private List<Ticket> tic;

        public Builder(String id) {
            
            this.searchID = id;
        }
        
         public Builder()
         {
             
             
             
         }
        
        public Builder search(String Search)
        {
            search = Search;
            return this;
        }
        
        public Builder search(SearchTicket st)
        {
            search = st.getSearch();
            searchID = st.getSearchID();
            
            return this;
        }
        
        public SearchTicket build()
        {
            return new SearchTicket(this);
        }
        
        
    }
    
    
    public String getSearchID() {
        return searchID;
    }

    public String getSearch() {
        return search;
    }

    public List<Ticket> getTic() {
        return tic;
    }
    
    
    
    
}
