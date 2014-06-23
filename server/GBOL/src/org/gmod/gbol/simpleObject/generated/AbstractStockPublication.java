package org.gmod.gbol.simpleObject.generated;


import org.gmod.gbol.simpleObject.*; 


/**
 * StockPublication generated by hbm2java
 */
public abstract class AbstractStockPublication extends AbstractSimpleObject implements java.io.Serializable {


     private Integer stockPublicationId;
     private Publication publication;
     private Stock stock;

    public AbstractStockPublication() {
    }

    public AbstractStockPublication(Publication publication, Stock stock) {
       this.publication = publication;
       this.stock = stock;
    }
   
    public Integer getStockPublicationId() {
        return this.stockPublicationId;
    }
    
    public void setStockPublicationId(Integer stockPublicationId) {
        this.stockPublicationId = stockPublicationId;
    }
    public Publication getPublication() {
        return this.publication;
    }
    
    public void setPublication(Publication publication) {
        this.publication = publication;
    }
    public Stock getStock() {
        return this.stock;
    }
    
    public void setStock(Stock stock) {
        this.stock = stock;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
         if ( (other == null ) ) return false;
         if ( !(other instanceof AbstractStockPublication) ) return false;
         AbstractStockPublication castOther = ( AbstractStockPublication ) other; 
         
         return ( (this.getPublication()==castOther.getPublication()) || ( this.getPublication()!=null && castOther.getPublication()!=null && this.getPublication().equals(castOther.getPublication()) ) )
 && ( (this.getStock()==castOther.getStock()) || ( this.getStock()!=null && castOther.getStock()!=null && this.getStock().equals(castOther.getStock()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         
         result = 37 * result + ( getPublication() == null ? 0 : this.getPublication().hashCode() );
         result = 37 * result + ( getStock() == null ? 0 : this.getStock().hashCode() );
         return result;
   }   

public AbstractStockPublication generateClone() {
    AbstractStockPublication cloned = new StockPublication(); 
           cloned.publication = this.publication;
           cloned.stock = this.stock;
    return cloned;
}


}


