package com.sibu.immuteclass.service.Impl.Flight;

import com.sibu.immuteclass.service.Interface.Airport; 

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.97756809-C2BA-504E-7F48-C7FC98A3C8CC]
// </editor-fold> 
public final class Status implements Airport {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.4F0B0CCB-5FBD-CD3C-9565-093DBF0AA916]
    // </editor-fold> 
    private int statusID;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.B706CF27-422E-BD82-9362-6BDE63FB6B45]
    // </editor-fold> 
    private String statusName;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.3E42D471-F401-935D-27DB-E045CB968523]
    // </editor-fold> 
    private double amount;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.A463CF59-905B-E837-49F8-1D35C0C8251B]
    // </editor-fold> 
    private int totalSeatClass;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.E4121DF0-7BA6-24CF-B1F4-CAA959EB5243]
    // </editor-fold> 
    private Status () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.75DE18D7-5A61-BD76-F89C-0DEA3445604C]
    // </editor-fold> 
    public double getAmount () {
        return amount;
    }
    
    private Status(Builder builder)
    {
        statusID = builder.statusID;
        statusName = builder.statusName;
        amount = builder.amount;
        totalSeatClass = builder.seats;
        
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.57FC3144-8BD7-6B2E-9EFF-D639A586D3D1]
    // </editor-fold> 
    public int getStatusID () {
        return statusID;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.F5E2D78A-4E22-F1A9-4734-A8109A353A46]
    // </editor-fold> 
    public String getStatusName () {
        return statusName;
    }


    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.B9760794-1E28-96FA-15DD-F9A5638A8ECE]
    // </editor-fold> 
    public int getTotalSeatClass () {
        return totalSeatClass;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.CFB2EDD6-6A5B-4161-7C3D-95EF51F46079]
    // </editor-fold> 
    public int flightID () {
        return 0;
    }

    public static class Builder {
        private int statusID;
        private String statusName;
        private double amount;
        private int seats;

        public Builder(int id) {
            
            this.statusID = id;
        }
        
        public Builder Name(String name)
        {
            statusName = name;
            return this;
        }
        
        public Builder Amount(double amt)
        {
            amount = amt;
            return this;
        }

        @Override
        public int hashCode() {
            int hash = 7;
            hash = 29 * hash + this.statusID;
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final Builder other = (Builder) obj;
            if (this.statusID != other.statusID) {
                return false;
            }
            return true;
        }
        
        public Builder Seats(int seat)
        {
            seats = seat;
            return this;
        }
        
        public Status build()
        {
            return new Status(this);
            
        }
    }

}

