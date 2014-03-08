package com.sibu.immuteclass.service.Impl.Passenger;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.AAFB88CD-9592-9517-3C16-A9AD45083EB0]
// </editor-fold> 
public final class Payment{

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.1AA82769-913B-59EA-F0D4-3DA5B2CFFDC8]
    // </editor-fold> 
    private int paymentID;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.F901212F-A009-2F9D-98AF-B3FAA412376B]
    // </editor-fold> 
    private double paidAmount;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.218309C8-324C-9C15-6E7A-01A805A87D86]
    // </editor-fold> 
    private String paymentDate;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.6D0BC5C8-2DAC-1A09-5C7E-DCCC6DCB3B40]
    // </editor-fold> 
    private Payment () {
    }
    
    private Payment(Builder builder)
    {
        paymentID = builder.paymentID;
        paidAmount = builder.paidAmount;
        paymentDate = builder.paymentDate;
        
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.860F9B32-655A-2E2B-FDE7-332773FD8AFA]
    // </editor-fold> 
    public double getPaidAmount () {
        return paidAmount;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.F465D50E-D4AB-D1A6-4775-2AAFDC4AADD8]
    @Override
    public int hashCode () {
        int hash = 5;
        hash = 71 * hash + this.paymentID;
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
        final Payment other = (Payment) obj;
        if (this.paymentID != other.paymentID) {
            return false;
        }
        return true;
    }

    // </editor-fold>
    public String getPaymentDate() {
        return paymentDate;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.89561A8D-38E3-300C-FA2E-C2FE61B98230]
    // </editor-fold> 
    public int getPaymentID () {
        return paymentID;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.6C9E201C-A8AA-F15F-55A6-7EFD6F786803]
    // </editor-fold> 
    public int getPassengerID () {
        return 0;
    }

    public static class Builder {
        private double paidAmount;
        private String paymentDate;
        private int paymentID;

        public Builder(int id) {
            
            this.paymentID = id;
        }
        
        public Builder paymentAmt(double amt)
        {
            paidAmount = amt;
            return this;
            
        }
        
        public Builder payMentDate(String pDate)
        {
            paymentDate = pDate;
            return this;
            
        }
        
        public Payment build()
        {
            return new Payment(this);
        }
    }

}

