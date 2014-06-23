package org.gmod.gbol.simpleObject.generated;


import org.gmod.gbol.simpleObject.*; 


/**
 * LibraryPropertyPublication generated by hbm2java
 */
public abstract class AbstractLibraryPropertyPublication extends AbstractSimpleObject implements java.io.Serializable {


     private Integer libraryPropertyPublicationId;
     private Publication publication;
     private LibraryProperty libraryProperty;

    public AbstractLibraryPropertyPublication() {
    }

    public AbstractLibraryPropertyPublication(Publication publication, LibraryProperty libraryProperty) {
       this.publication = publication;
       this.libraryProperty = libraryProperty;
    }
   
    public Integer getLibraryPropertyPublicationId() {
        return this.libraryPropertyPublicationId;
    }
    
    public void setLibraryPropertyPublicationId(Integer libraryPropertyPublicationId) {
        this.libraryPropertyPublicationId = libraryPropertyPublicationId;
    }
    public Publication getPublication() {
        return this.publication;
    }
    
    public void setPublication(Publication publication) {
        this.publication = publication;
    }
    public LibraryProperty getLibraryProperty() {
        return this.libraryProperty;
    }
    
    public void setLibraryProperty(LibraryProperty libraryProperty) {
        this.libraryProperty = libraryProperty;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
         if ( (other == null ) ) return false;
         if ( !(other instanceof AbstractLibraryPropertyPublication) ) return false;
         AbstractLibraryPropertyPublication castOther = ( AbstractLibraryPropertyPublication ) other; 
         
         return ( (this.getPublication()==castOther.getPublication()) || ( this.getPublication()!=null && castOther.getPublication()!=null && this.getPublication().equals(castOther.getPublication()) ) )
 && ( (this.getLibraryProperty()==castOther.getLibraryProperty()) || ( this.getLibraryProperty()!=null && castOther.getLibraryProperty()!=null && this.getLibraryProperty().equals(castOther.getLibraryProperty()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         
         result = 37 * result + ( getPublication() == null ? 0 : this.getPublication().hashCode() );
         result = 37 * result + ( getLibraryProperty() == null ? 0 : this.getLibraryProperty().hashCode() );
         return result;
   }   

public AbstractLibraryPropertyPublication generateClone() {
    AbstractLibraryPropertyPublication cloned = new AbstractLibraryPropertyPublication; 
           cloned.publication = this.publication;
           cloned.libraryProperty = this.libraryProperty;
    return cloned;
}


}


