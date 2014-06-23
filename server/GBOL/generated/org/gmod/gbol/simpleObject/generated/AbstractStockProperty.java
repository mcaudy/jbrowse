package org.gmod.gbol.simpleObject.generated;


import org.gmod.gbol.simpleObject.*; 

import java.util.HashSet;
import java.util.Set;

/**
 * StockProperty generated by hbm2java
 */
public abstract class AbstractStockProperty extends AbstractSimpleObject implements java.io.Serializable {


     private Integer stockPropertyId;
     private Stock stock;
     private CVTerm type;
     private String value;
     private int rank;
     private Set<StockPropertyPublication> stockPropertyPublications = new HashSet<StockPropertyPublication>(0);

    public AbstractStockProperty() {
    }

    
    public AbstractStockProperty(Stock stock, CVTerm type, int rank) {
        this.stock = stock;
        this.type = type;
        this.rank = rank;
    }
    public AbstractStockProperty(Stock stock, CVTerm type, String value, int rank, Set<StockPropertyPublication> stockPropertyPublications) {
       this.stock = stock;
       this.type = type;
       this.value = value;
       this.rank = rank;
       this.stockPropertyPublications = stockPropertyPublications;
    }
   
    public Integer getStockPropertyId() {
        return this.stockPropertyId;
    }
    
    public void setStockPropertyId(Integer stockPropertyId) {
        this.stockPropertyId = stockPropertyId;
    }
    public Stock getStock() {
        return this.stock;
    }
    
    public void setStock(Stock stock) {
        this.stock = stock;
    }
    public CVTerm getType() {
        return this.type;
    }
    
    public void setType(CVTerm type) {
        this.type = type;
    }
    public String getValue() {
        return this.value;
    }
    
    public void setValue(String value) {
        this.value = value;
    }
    public int getRank() {
        return this.rank;
    }
    
    public void setRank(int rank) {
        this.rank = rank;
    }
    public Set<StockPropertyPublication> getStockPropertyPublications() {
        return this.stockPropertyPublications;
    }
    
    public void setStockPropertyPublications(Set<StockPropertyPublication> stockPropertyPublications) {
        this.stockPropertyPublications = stockPropertyPublications;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
         if ( (other == null ) ) return false;
         if ( !(other instanceof AbstractStockProperty) ) return false;
         AbstractStockProperty castOther = ( AbstractStockProperty ) other; 
         
         return ( (this.getStock()==castOther.getStock()) || ( this.getStock()!=null && castOther.getStock()!=null && this.getStock().equals(castOther.getStock()) ) )
 && ( (this.getType()==castOther.getType()) || ( this.getType()!=null && castOther.getType()!=null && this.getType().equals(castOther.getType()) ) )
 && (this.getRank()==castOther.getRank());
   }
   
   public int hashCode() {
         int result = 17;
         
         
         result = 37 * result + ( getStock() == null ? 0 : this.getStock().hashCode() );
         result = 37 * result + ( getType() == null ? 0 : this.getType().hashCode() );
         
         result = 37 * result + this.getRank();
         
         return result;
   }   

public AbstractStockProperty generateClone() {
    AbstractStockProperty cloned = new AbstractStockProperty; 
           cloned.stock = this.stock;
           cloned.type = this.type;
           cloned.value = this.value;
           cloned.rank = this.rank;
           cloned.stockPropertyPublications = this.stockPropertyPublications;
    return cloned;
}


}


