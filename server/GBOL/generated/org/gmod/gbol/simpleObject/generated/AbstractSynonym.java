package org.gmod.gbol.simpleObject.generated;


import org.gmod.gbol.simpleObject.*; 


/**
 * Synonym generated by hbm2java
 */
public abstract class AbstractSynonym extends AbstractSimpleObject implements java.io.Serializable {


     private Integer synonymId;
     private CVTerm type;
     private String name;
     private String synonymSGML;

    public AbstractSynonym() {
    }

    public AbstractSynonym(CVTerm type, String name, String synonymSGML) {
       this.type = type;
       this.name = name;
       this.synonymSGML = synonymSGML;
    }
   
    public Integer getSynonymId() {
        return this.synonymId;
    }
    
    public void setSynonymId(Integer synonymId) {
        this.synonymId = synonymId;
    }
    public CVTerm getType() {
        return this.type;
    }
    
    public void setType(CVTerm type) {
        this.type = type;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getSynonymSGML() {
        return this.synonymSGML;
    }
    
    public void setSynonymSGML(String synonymSGML) {
        this.synonymSGML = synonymSGML;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
         if ( (other == null ) ) return false;
         if ( !(other instanceof AbstractSynonym) ) return false;
         AbstractSynonym castOther = ( AbstractSynonym ) other; 
         
         return ( (this.getType()==castOther.getType()) || ( this.getType()!=null && castOther.getType()!=null && this.getType().equals(castOther.getType()) ) )
 && ( (this.getName()==castOther.getName()) || ( this.getName()!=null && castOther.getName()!=null && this.getName().equals(castOther.getName()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         
         result = 37 * result + ( getType() == null ? 0 : this.getType().hashCode() );
         result = 37 * result + ( getName() == null ? 0 : this.getName().hashCode() );
         
         return result;
   }   

public AbstractSynonym generateClone() {
    AbstractSynonym cloned = new AbstractSynonym; 
           cloned.type = this.type;
           cloned.name = this.name;
           cloned.synonymSGML = this.synonymSGML;
    return cloned;
}


}


