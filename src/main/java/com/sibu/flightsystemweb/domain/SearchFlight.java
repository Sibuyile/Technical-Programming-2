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
public class SearchFlight implements Serializable{
    
     
    private String searchID;
    private String search;
    private List<ListOfFlights> lof;
    
    private SearchFlight () {
    }
    
    private SearchFlight(Builder builder)
    {
        searchID = builder.searchID;
        search = builder.search;
        lof = builder.lof;
        
    }

    public static class Builder {
        private String search;
        private String searchID;
        private List<ListOfFlights> lof;

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
        
        public Builder searchFlight(SearchFlight sf)
        {
            search = sf.getSearch();
            searchID = sf.getSearchID();
                    
            
            return this;
        }
        
        public SearchFlight build()
        {
            return new SearchFlight(this);
        }
        
        
    }


    public String getSearchID() {
        return searchID;
    }

    public String getSearch() {
        return search;
    }

    public List<ListOfFlights> getLof() {
        return lof;
    }
    
    
    
}
