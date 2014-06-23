package org.gmod.gbol.simpleObject.generated;


import org.gmod.gbol.simpleObject.*; 


/**
 * FeaturePosition generated by hbm2java
 */
public abstract class AbstractFeaturePosition extends AbstractSimpleObject implements java.io.Serializable {


     private Integer featurePositionId;
     private Feature feature;
     private FeatureMap featureMap;
     private Feature mapFeature;
     private double mapPosition;

    public AbstractFeaturePosition() {
    }

    public AbstractFeaturePosition(Feature feature, FeatureMap featureMap, Feature mapFeature, double mapPosition) {
       this.feature = feature;
       this.featureMap = featureMap;
       this.mapFeature = mapFeature;
       this.mapPosition = mapPosition;
    }
   
    public Integer getFeaturePositionId() {
        return this.featurePositionId;
    }
    
    public void setFeaturePositionId(Integer featurePositionId) {
        this.featurePositionId = featurePositionId;
    }
    public Feature getFeature() {
        return this.feature;
    }
    
    public void setFeature(Feature feature) {
        this.feature = feature;
    }
    public FeatureMap getFeatureMap() {
        return this.featureMap;
    }
    
    public void setFeatureMap(FeatureMap featureMap) {
        this.featureMap = featureMap;
    }
    public Feature getMapFeature() {
        return this.mapFeature;
    }
    
    public void setMapFeature(Feature mapFeature) {
        this.mapFeature = mapFeature;
    }
    public double getMapPosition() {
        return this.mapPosition;
    }
    
    public void setMapPosition(double mapPosition) {
        this.mapPosition = mapPosition;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
         if ( (other == null ) ) return false;
         if ( !(other instanceof AbstractFeaturePosition) ) return false;
         AbstractFeaturePosition castOther = ( AbstractFeaturePosition ) other; 
         
         return ( (this.getFeature()==castOther.getFeature()) || ( this.getFeature()!=null && castOther.getFeature()!=null && this.getFeature().equals(castOther.getFeature()) ) )
 && ( (this.getFeatureMap()==castOther.getFeatureMap()) || ( this.getFeatureMap()!=null && castOther.getFeatureMap()!=null && this.getFeatureMap().equals(castOther.getFeatureMap()) ) )
 && ( (this.getMapFeature()==castOther.getMapFeature()) || ( this.getMapFeature()!=null && castOther.getMapFeature()!=null && this.getMapFeature().equals(castOther.getMapFeature()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         
         result = 37 * result + ( getFeature() == null ? 0 : this.getFeature().hashCode() );
         result = 37 * result + ( getFeatureMap() == null ? 0 : this.getFeatureMap().hashCode() );
         result = 37 * result + ( getMapFeature() == null ? 0 : this.getMapFeature().hashCode() );
         
         return result;
   }   

public AbstractFeaturePosition generateClone() {
    AbstractFeaturePosition cloned = new AbstractFeaturePosition; 
           cloned.feature = this.feature;
           cloned.featureMap = this.featureMap;
           cloned.mapFeature = this.mapFeature;
           cloned.mapPosition = this.mapPosition;
    return cloned;
}


}


