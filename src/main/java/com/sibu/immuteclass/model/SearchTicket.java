package com.sibu.immuteclass.model;

import com.sibu.immuteclass.service.Interface.Airport; 

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.22F7982E-CB01-297B-F397-784714FF4451]
// </editor-fold> 
public final class SearchTicket {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.86C4422B-6FCA-C1F0-76C5-7FE7C3596181]
    // </editor-fold> 
    private String searchID;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.63DAE5C5-0B5F-8EC2-356E-ECAC45348D76]
    // </editor-fold> 
    private String search;
    Flight f;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.6827FFE5-5CFB-5875-947B-79DEB1219373]
    // </editor-fold> 
    private SearchTicket () {
    }
    
    private SearchTicket(Builder builder)
    {
        searchID = builder.searchID;
        search = builder.search;
        
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.D908CCE8-D1B4-D16B-B1B4-DA71681E654B]
    // </editor-fold> 
    public String getSearchID () {
        return searchID;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.B0D4EFA1-3F13-D1AE-5DB8-92C74C299A08]
    // </editor-fold> 
    public String getSearch () {
        return search;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.517EF8C1-3611-8420-9B3B-8BA351E3470F]
    // </editor-fold> 
    public String flightID () {
        return f.flightID();
    }

    public static class Builder {
        private String search;
        private String searchID;

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

}

