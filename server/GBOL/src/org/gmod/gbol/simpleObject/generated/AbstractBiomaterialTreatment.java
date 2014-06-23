package org.gmod.gbol.simpleObject.generated;


import org.gmod.gbol.simpleObject.*; 


/**
 * BiomaterialTreatment generated by hbm2java
 */
public abstract class AbstractBiomaterialTreatment extends AbstractSimpleObject implements java.io.Serializable {


     private Integer biomaterialTreatmentId;
     private CVTerm unitType;
     private Treatment treatment;
     private Biomaterial biomaterial;
     private Float value;
     private int rank;

    public AbstractBiomaterialTreatment() {
    }

    
    public AbstractBiomaterialTreatment(Treatment treatment, Biomaterial biomaterial, int rank) {
        this.treatment = treatment;
        this.biomaterial = biomaterial;
        this.rank = rank;
    }
    public AbstractBiomaterialTreatment(CVTerm unitType, Treatment treatment, Biomaterial biomaterial, Float value, int rank) {
       this.unitType = unitType;
       this.treatment = treatment;
       this.biomaterial = biomaterial;
       this.value = value;
       this.rank = rank;
    }
   
    public Integer getBiomaterialTreatmentId() {
        return this.biomaterialTreatmentId;
    }
    
    public void setBiomaterialTreatmentId(Integer biomaterialTreatmentId) {
        this.biomaterialTreatmentId = biomaterialTreatmentId;
    }
    public CVTerm getUnitType() {
        return this.unitType;
    }
    
    public void setUnitType(CVTerm unitType) {
        this.unitType = unitType;
    }
    public Treatment getTreatment() {
        return this.treatment;
    }
    
    public void setTreatment(Treatment treatment) {
        this.treatment = treatment;
    }
    public Biomaterial getBiomaterial() {
        return this.biomaterial;
    }
    
    public void setBiomaterial(Biomaterial biomaterial) {
        this.biomaterial = biomaterial;
    }
    public Float getValue() {
        return this.value;
    }
    
    public void setValue(Float value) {
        this.value = value;
    }
    public int getRank() {
        return this.rank;
    }
    
    public void setRank(int rank) {
        this.rank = rank;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
         if ( (other == null ) ) return false;
         if ( !(other instanceof AbstractBiomaterialTreatment) ) return false;
         AbstractBiomaterialTreatment castOther = ( AbstractBiomaterialTreatment ) other; 
         
         return ( (this.getTreatment()==castOther.getTreatment()) || ( this.getTreatment()!=null && castOther.getTreatment()!=null && this.getTreatment().equals(castOther.getTreatment()) ) )
 && ( (this.getBiomaterial()==castOther.getBiomaterial()) || ( this.getBiomaterial()!=null && castOther.getBiomaterial()!=null && this.getBiomaterial().equals(castOther.getBiomaterial()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         
         
         result = 37 * result + ( getTreatment() == null ? 0 : this.getTreatment().hashCode() );
         result = 37 * result + ( getBiomaterial() == null ? 0 : this.getBiomaterial().hashCode() );
         
         
         return result;
   }   

public AbstractBiomaterialTreatment generateClone() {
    AbstractBiomaterialTreatment cloned = new BiomaterialTreatment(); 
           cloned.unitType = this.unitType;
           cloned.treatment = this.treatment;
           cloned.biomaterial = this.biomaterial;
           cloned.value = this.value;
           cloned.rank = this.rank;
    return cloned;
}


}


