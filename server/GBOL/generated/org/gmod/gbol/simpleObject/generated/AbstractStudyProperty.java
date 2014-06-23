package org.gmod.gbol.simpleObject.generated;


import org.gmod.gbol.simpleObject.*; 

import java.util.HashSet;
import java.util.Set;

/**
 * StudyProperty generated by hbm2java
 */
public abstract class AbstractStudyProperty extends AbstractSimpleObject implements java.io.Serializable {


     private Integer studyPropertyId;
     private Study study;
     private CVTerm type;
     private String value;
     private int rank;
     private Set<StudyPropertyFeature> studyPropertyFeatures = new HashSet<StudyPropertyFeature>(0);

    public AbstractStudyProperty() {
    }

    
    public AbstractStudyProperty(Study study, CVTerm type, int rank) {
        this.study = study;
        this.type = type;
        this.rank = rank;
    }
    public AbstractStudyProperty(Study study, CVTerm type, String value, int rank, Set<StudyPropertyFeature> studyPropertyFeatures) {
       this.study = study;
       this.type = type;
       this.value = value;
       this.rank = rank;
       this.studyPropertyFeatures = studyPropertyFeatures;
    }
   
    public Integer getStudyPropertyId() {
        return this.studyPropertyId;
    }
    
    public void setStudyPropertyId(Integer studyPropertyId) {
        this.studyPropertyId = studyPropertyId;
    }
    public Study getStudy() {
        return this.study;
    }
    
    public void setStudy(Study study) {
        this.study = study;
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
    public Set<StudyPropertyFeature> getStudyPropertyFeatures() {
        return this.studyPropertyFeatures;
    }
    
    public void setStudyPropertyFeatures(Set<StudyPropertyFeature> studyPropertyFeatures) {
        this.studyPropertyFeatures = studyPropertyFeatures;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
         if ( (other == null ) ) return false;
         if ( !(other instanceof AbstractStudyProperty) ) return false;
         AbstractStudyProperty castOther = ( AbstractStudyProperty ) other; 
         
         return ( (this.getStudy()==castOther.getStudy()) || ( this.getStudy()!=null && castOther.getStudy()!=null && this.getStudy().equals(castOther.getStudy()) ) )
 && ( (this.getType()==castOther.getType()) || ( this.getType()!=null && castOther.getType()!=null && this.getType().equals(castOther.getType()) ) )
 && (this.getRank()==castOther.getRank());
   }
   
   public int hashCode() {
         int result = 17;
         
         
         result = 37 * result + ( getStudy() == null ? 0 : this.getStudy().hashCode() );
         result = 37 * result + ( getType() == null ? 0 : this.getType().hashCode() );
         
         result = 37 * result + this.getRank();
         
         return result;
   }   

public AbstractStudyProperty generateClone() {
    AbstractStudyProperty cloned = new AbstractStudyProperty; 
           cloned.study = this.study;
           cloned.type = this.type;
           cloned.value = this.value;
           cloned.rank = this.rank;
           cloned.studyPropertyFeatures = this.studyPropertyFeatures;
    return cloned;
}


}


