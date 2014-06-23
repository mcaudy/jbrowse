package org.gmod.gbol.simpleObject.generated;


import org.gmod.gbol.simpleObject.*; 

import java.util.HashSet;
import java.util.Set;

/**
 * FeatureRelationship generated by hbm2java
 */
public abstract class AbstractFeatureRelationship extends AbstractSimpleObject implements java.io.Serializable {


     private Integer featureRelationshipId;
     private CVTerm type;
     private Feature objectFeature;
     private Feature subjectFeature;
     private String value;
     private int rank;
     private Set<FeatureRelationshipProperty> featureRelationshipProperties = new HashSet<FeatureRelationshipProperty>(0);
     private Set<FeatureRelationshipPublication> featureRelationshipPublications = new HashSet<FeatureRelationshipPublication>(0);

    public AbstractFeatureRelationship() {
    }

    
    public AbstractFeatureRelationship(CVTerm type, Feature objectFeature, Feature subjectFeature, int rank) {
        this.type = type;
        this.objectFeature = objectFeature;
        this.subjectFeature = subjectFeature;
        this.rank = rank;
    }
    public AbstractFeatureRelationship(CVTerm type, Feature objectFeature, Feature subjectFeature, String value, int rank, Set<FeatureRelationshipProperty> featureRelationshipProperties, Set<FeatureRelationshipPublication> featureRelationshipPublications) {
       this.type = type;
       this.objectFeature = objectFeature;
       this.subjectFeature = subjectFeature;
       this.value = value;
       this.rank = rank;
       this.featureRelationshipProperties = featureRelationshipProperties;
       this.featureRelationshipPublications = featureRelationshipPublications;
    }
   
    public Integer getFeatureRelationshipId() {
        return this.featureRelationshipId;
    }
    
    public void setFeatureRelationshipId(Integer featureRelationshipId) {
        this.featureRelationshipId = featureRelationshipId;
    }
    public CVTerm getType() {
        return this.type;
    }
    
    public void setType(CVTerm type) {
        this.type = type;
    }
    public Feature getObjectFeature() {
        return this.objectFeature;
    }
    
    public void setObjectFeature(Feature objectFeature) {
        this.objectFeature = objectFeature;
    }
    public Feature getSubjectFeature() {
        return this.subjectFeature;
    }
    
    public void setSubjectFeature(Feature subjectFeature) {
        this.subjectFeature = subjectFeature;
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
    public Set<FeatureRelationshipProperty> getFeatureRelationshipProperties() {
        return this.featureRelationshipProperties;
    }
    
    public void setFeatureRelationshipProperties(Set<FeatureRelationshipProperty> featureRelationshipProperties) {
        this.featureRelationshipProperties = featureRelationshipProperties;
    }
    public Set<FeatureRelationshipPublication> getFeatureRelationshipPublications() {
        return this.featureRelationshipPublications;
    }
    
    public void setFeatureRelationshipPublications(Set<FeatureRelationshipPublication> featureRelationshipPublications) {
        this.featureRelationshipPublications = featureRelationshipPublications;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
         if ( (other == null ) ) return false;
         if ( !(other instanceof AbstractFeatureRelationship) ) return false;
         AbstractFeatureRelationship castOther = ( AbstractFeatureRelationship ) other; 
         
         return ( (this.getType()==castOther.getType()) || ( this.getType()!=null && castOther.getType()!=null && this.getType().equals(castOther.getType()) ) )
 && ( (this.getObjectFeature()==castOther.getObjectFeature()) || ( this.getObjectFeature()!=null && castOther.getObjectFeature()!=null && this.getObjectFeature().equals(castOther.getObjectFeature()) ) )
 && ( (this.getSubjectFeature()==castOther.getSubjectFeature()) || ( this.getSubjectFeature()!=null && castOther.getSubjectFeature()!=null && this.getSubjectFeature().equals(castOther.getSubjectFeature()) ) )
 && (this.getRank()==castOther.getRank());
   }
   
   public int hashCode() {
         int result = 17;
         
         
         result = 37 * result + ( getType() == null ? 0 : this.getType().hashCode() );
         result = 37 * result + ( getObjectFeature() == null ? 0 : this.getObjectFeature().hashCode() );
         result = 37 * result + ( getSubjectFeature() == null ? 0 : this.getSubjectFeature().hashCode() );
         
         result = 37 * result + this.getRank();
         
         
         return result;
   }   

public AbstractFeatureRelationship generateClone() {
    AbstractFeatureRelationship cloned = new FeatureRelationship(); 
           cloned.type = this.type;
           cloned.objectFeature = this.objectFeature;
           cloned.subjectFeature = this.subjectFeature;
           cloned.value = this.value;
           cloned.rank = this.rank;
           cloned.featureRelationshipProperties = this.featureRelationshipProperties;
           cloned.featureRelationshipPublications = this.featureRelationshipPublications;
    return cloned;
}


}


