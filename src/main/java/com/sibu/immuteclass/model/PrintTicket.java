package com.sibu.immuteclass.model;

import java.util.Objects;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.D4D3632C-C617-320F-0074-5C71E0FD263A]
// </editor-fold> 
public final class PrintTicket {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.5BA1D66E-644C-C1E8-7EE9-32734CAE9E0E]
    // </editor-fold> 
    private String printTicketID;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.D431A151-65C9-209D-44F6-053F8C50B066]
    // </editor-fold> 
    private String print;
    Reservation r;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.BB143190-9182-C607-C738-A9B708C207C4]
    // </editor-fold> 
    private PrintTicket () {
    }
    
    private PrintTicket(Builder builder)
    {
        printTicketID = builder.printTicketID;
        print = builder.print;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.06A0513C-F81F-8273-B4E3-A1F7DDDA9392]
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.printTicketID);
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
        final PrintTicket other = (PrintTicket) obj;
        if (this.printTicketID != other.printTicketID) {
            return false;
        }
        return true;
    }

    // </editor-fold>
    public String getPrint() {
        return print;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.CF5FDA8E-C5F9-883C-9661-EA1431309141]
    // </editor-fold> 
    public String getPrintTicketID () {
        return printTicketID;
    }


    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.B9F62F3E-5A28-29D5-EDA2-A9A98AF3C7F6]
    // </editor-fold> 
    public String getReservationID () {
        return r.getReservationID();
    }

    public static class Builder {
        private String printTicketID;
        private String print;

        public Builder(String id) {
            
            this.printTicketID = id;
            
        }
        
         public Builder()
         {
             
             
             
         }
        
        public Builder print(String p)
        {
            print = p;
            return this;
        }
        
        public Builder printTicket(PrintTicket prt)
        {
            printTicketID = prt.getPrintTicketID();
            print = prt.getPrint();
            
            return this;
        }
        
        public PrintTicket build()
        {
            return new PrintTicket(this);
        }
    }

}

