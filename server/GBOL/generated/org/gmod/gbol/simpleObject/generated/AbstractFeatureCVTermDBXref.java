package org.gmod.gbol.simpleObject.generated;


import org.gmod.gbol.simpleObject.*; 


/**
 * FeatureCVTermDBXref generated by hbm2java
 */
public abstract class AbstractFeatureCVTermDBXref extends AbstractSimpleObject implements java.io.Serializable {


     private Integer featureCVTermDBXrefId;
     private DBXref dbxref;
     private FeatureCVTerm featureCVTerm;

    public AbstractFeatureCVTermDBXref() {
    }

    public AbstractFeatureCVTermDBXref(DBXref dbxref, FeatureCVTerm featureCVTerm) {
       this.dbxref = dbxref;
       this.featureCVTerm = featureCVTerm;
    }
   
    public Integer getFeatureCVTermDBXrefId() {
        return this.featureCVTermDBXrefId;
    }
    
    public void setFeatureCVTermDBXrefId(Integer featureCVTermDBXrefId) {
        this.featureCVTermDBXrefId = featureCVTermDBXrefId;
    }
    public DBXref getDbxref() {
        return this.dbxref;
    }
    
    public void setDbxref(DBXref dbxref) {
        this.dbxref = dbxref;
    }
    public FeatureCVTerm getFeatureCVTerm() {
        return this.featureCVTerm;
    }
    
    public void setFeatureCVTerm(FeatureCVTerm featureCVTerm) {
        this.featureCVTerm = featureCVTerm;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
         if ( (other == null ) ) return false;
         if ( !(other instanceof AbstractFeatureCVTermDBXref) ) return false;
         AbstractFeatureCVTermDBXref castOther = ( AbstractFeatureCVTermDBXref ) other; 
         
         return ( (this.getDbxref()==castOther.getDbxref()) || ( this.getDbxref()!=null && castOther.getDbxref()!=null && this.getDbxref().equals(castOther.getDbxref()) ) )
 && ( (this.getFeatureCVTerm()==castOther.getFeatureCVTerm()) || ( this.getFeatureCVTerm()!=null && castOther.getFeatureCVTerm()!=null && this.getFeatureCVTerm().equals(castOther.getFeatureCVTerm()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         
         result = 37 * result + ( getDbxref() == null ? 0 : this.getDbxref().hashCode() );
         result = 37 * result + ( getFeatureCVTerm() == null ? 0 : this.getFeatureCVTerm().hashCode() );
         return result;
   }   

public AbstractFeatureCVTermDBXref generateClone() {
    AbstractFeatureCVTermDBXref cloned = new AbstractFeatureCVTermDBXref; 
           cloned.dbxref = this.dbxref;
           cloned.featureCVTerm = this.featureCVTerm;
    return cloned;
}


}


